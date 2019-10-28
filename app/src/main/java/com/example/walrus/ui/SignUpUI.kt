package com.example.walrus.ui

import android.graphics.Color
import android.view.Gravity
import android.view.View
import com.example.walrus.R
import com.example.walrus.activity.SignUpActivity
import org.jetbrains.anko.*

class SignUpUI: AnkoComponent<SignUpActivity> {
    override fun createView(ui: AnkoContext<SignUpActivity>) = with(ui) {

        verticalLayout {
            backgroundResource = R.drawable.walrus_background

            textView(R.string.hello_novice){
                id = R.id.title_template
                textSize = dip(12).toFloat()
                textColor = Color.WHITE
                backgroundColorResource = R.color.colorPrimaryGreen
                textAlignment = View.TEXT_ALIGNMENT_CENTER
                topPadding = dip(12)
            }.lparams(matchParent, dip(64)) {
                setMargins(dip(32), dip(200) , dip(32), 0)
            }
            editText {
                hintResource = R.string.name
                backgroundColor = Color.WHITE
                backgroundResource = R.drawable.bordered_view
            }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), 0, dip(32), 0)
            }
            editText {
                hintResource = R.string.email
                backgroundColor = Color.WHITE
                backgroundResource = R.drawable.bordered_view
            }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), dip(-2), dip(32), 0)
            }
            editText {
                hintResource = R.string.password
                backgroundColor = Color.WHITE
                backgroundResource = R.drawable.bordered_view
            }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), dip(-2), dip(32), 0)
            }
            editText {
                hintResource = R.string.confirm
                backgroundColor = Color.WHITE
                backgroundResource = R.drawable.bordered_view
            }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), dip(-2), dip(32), 0)
            }
            button {
                textColor = Color.WHITE
                textResource = R.string.apply
                backgroundColorResource = R.color.colorPrimaryGreen
            }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), dip(8), dip(32), 0)
            }
        }
    }
}
