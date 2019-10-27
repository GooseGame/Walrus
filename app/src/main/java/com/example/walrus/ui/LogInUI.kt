package com.example.walrus.ui

import android.graphics.Color
import android.view.View
import android.widget.TextView
import com.example.walrus.R
import com.example.walrus.root.fullscreenLayoutUI
import com.example.walrus.activity.LogInActivity
import org.jetbrains.anko.*

class LogInUI: AnkoComponent<LogInActivity> {
    override fun createView(ui: AnkoContext<LogInActivity>) = with(ui) {

            verticalLayout {
                backgroundResource = R.drawable.walrus_background
                textView(R.string.logIn_mainText) {
                    textSize = dip(16).toFloat()
                    textColor = Color.WHITE
                }.lparams {
                    setMargins(dip(8),dip(8), dip(16), dip(8))
                }
                textView(R.string.heyThere){
                    id = R.id.title_template
                    textSize = dip(12).toFloat()
                    textColor = Color.WHITE
                    backgroundColorResource = R.color.colorPrimaryGreen
                    textAlignment = View.TEXT_ALIGNMENT_CENTER
                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), 0, dip(32), 0)
                }
                editText {
                    hintResource = R.string.email
                    backgroundColor = Color.WHITE
                    backgroundResource = R.drawable.bordered_view
                }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), 0, dip(32), 0)
                    leftPadding = dip(8)
                }
                editText {
                    hintResource = R.string.password
                    backgroundColor = Color.WHITE
                    backgroundResource = R.drawable.bordered_view
                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), dip(-2), dip(32), 0)
                    leftPadding = dip(8)

                }
                button {
                    textColor = Color.WHITE
                    textResource = R.string.logIn_Button
                    backgroundColorResource = R.color.colorPrimaryGreen
                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), dip(8), dip(32), 0)
                }
                button {
                    textColor = Color.WHITE
                    textResource = R.string.signUp_Button
                    backgroundColorResource = R.color.colorAccent
                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), dip(8), dip(32), 0)
                }
            }
        }
    }
