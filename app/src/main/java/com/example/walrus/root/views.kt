package com.example.walrus.root

import android.view.ViewManager
import androidx.constraintlayout.widget.ConstraintLayout
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.constraint.layout._ConstraintLayout
import org.jetbrains.anko.custom.ankoView

inline fun ViewManager.fullscreenLayoutUI(init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
    return ankoView(FullscreenLayout.factory, theme = 0) { init() } }