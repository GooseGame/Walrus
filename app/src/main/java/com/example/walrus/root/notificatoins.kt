package com.example.walrus.root

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.walrus.R

fun drawLogInNotification(context: Context, email: String, password: String) {
    println(email)
    println(password)
    var resultText = ""
            if ((isEmailValid(email)) && isPasswordValid(password)) {
                println("FUCK")
                //TODO
            } else {
                if (!isEmailValid(email)) {
                    resultText += "email_not_valid"
                }
                if (!isPasswordValid(password)) {
                    resultText += "password_not_valid"
                }
                val li = LayoutInflater.from(context)
                val promptView = li.inflate(R.layout.validation_fail_alert, null)
                when (resultText) {
                    "email_not_valid" -> promptView.findViewById<TextView>(R.id.email_not_valid).visibility =
                        View.VISIBLE
                    "password_not_valid" -> promptView.findViewById<TextView>(R.id.password_not_valid).visibility =
                        View.VISIBLE
                    "email_not_validpassword_not_valid" -> {
                        promptView.findViewById<TextView>(R.id.email_not_valid).visibility = View.VISIBLE
                        promptView.findViewById<TextView>(R.id.password_not_valid).visibility = View.VISIBLE
                    }
                }
                val positiveButtonClick = { dialog: DialogInterface, _: Int ->
                    dialog.cancel()
                }
                var builder = AlertDialog.Builder(context)
                builder.setView(promptView)
                builder.setPositiveButton("ok", positiveButtonClick)
                val alert = builder.create()
                alert.show()
            }
}