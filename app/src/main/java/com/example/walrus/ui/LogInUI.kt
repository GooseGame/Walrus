package com.example.walrus.ui

import android.graphics.Color
import android.view.View
import com.example.walrus.R
import com.example.walrus.activity.LogInActivity
import com.example.walrus.root.AsteriskPasswordTransformationMethod
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LogInUI: AnkoComponent<LogInActivity> {
    lateinit var onClickSingUp : () -> Unit
    lateinit var drawNotification: () -> Unit
    override fun createView(ui: AnkoContext<LogInActivity>) = with(ui) {

            verticalLayout {
                id = R.id.parent
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
                }.lparams(matchParent, dip(64)) {
                    setMargins(dip(32), 0, dip(32), 0)
                }
                editText {
                    id = R.id.edit_query
                    hintResource = R.string.email
                    backgroundColor = Color.WHITE
                    backgroundResource = R.drawable.bordered_view
                }.lparams(matchParent, wrapContent) {
                setMargins(dip(32), 0, dip(32), 0)
                }
                editText {
                    id = R.id.search_edit_frame
                    hintResource = R.string.password
                    backgroundColor = Color.WHITE
                    backgroundResource = R.drawable.bordered_view
                    transformationMethod = AsteriskPasswordTransformationMethod()
                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), dip(-2), dip(32), 0)
                }
                button {
                    textColor = Color.WHITE
                    textResource = R.string.logIn_Button
                    backgroundColorResource = R.color.colorPrimaryGreen
                    onClick {
                        drawNotification()
                    }

                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), dip(8), dip(32), 0)
                }
                button {
                    textColor = Color.WHITE
                    textResource = R.string.signUp_Button
                    backgroundColorResource = R.color.colorAccent
                    onClick {
                        onClickSingUp()
                    }
                }.lparams(matchParent, wrapContent) {
                    setMargins(dip(32), dip(8), dip(32), 0)
                }
            }
        }
    }
