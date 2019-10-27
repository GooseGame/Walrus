import android.content.Context
import android.os.Build
import android.view.Surface
import androidx.annotation.RequiresApi
import org.jetbrains.anko.constraint.layout._ConstraintLayout
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.windowManager

open class FullscreenLayout {

    companion object {
        private const val STATUS_BAR_HEIGHT = 24

        val factory = { ctx: Context -> createView(ctx) }

        private fun createView(context: Context): _ConstraintLayout {
            val layout = _ConstraintLayout(context)

            when(context.windowManager.defaultDisplay.rotation) {
                Surface.ROTATION_90 -> {
                    layout.setPadding(0, getStatusBarHeight(context), getSoftButtonBarHeight(context, true), 0)
                }
                Surface.ROTATION_270 -> {
                    layout.setPadding(getSoftButtonBarHeight(context, true), getStatusBarHeight(context), 0, 0)
                }
                else -> {
                    layout.setPadding(0, getStatusBarHeight(context), 0, getSoftButtonBarHeight(context, false))
                }
            }

            return layout
        }

        private fun getStatusBarHeight(context: Context): Int {
            return (STATUS_BAR_HEIGHT * context.displayMetrics.density).toInt()
        }

        @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
        private fun getSoftButtonBarHeight(context: Context, isLandscape: Boolean): Int {
            val metrics = context.displayMetrics

            context.windowManager.defaultDisplay.getMetrics(metrics)
            val size = if (isLandscape) metrics.widthPixels else metrics.heightPixels
            context.windowManager.defaultDisplay.getRealMetrics(metrics)
            val realSize = if (isLandscape) metrics.widthPixels else metrics.heightPixels

            return (realSize - size)
        }
    }
}