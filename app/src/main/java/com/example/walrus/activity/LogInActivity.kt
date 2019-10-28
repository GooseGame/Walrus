package com.example.walrus.activity

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.walrus.R
import com.example.walrus.ui.LogInUI
import org.jetbrains.anko.setContentView
import com.example.walrus.root.drawLogInNotification

class LogInActivity: AppCompatActivity() {
    private val uiComponent: LogInUI by lazy { LogInUI() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiComponent.setContentView(this)

        uiComponent.onClickSingUp = {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        uiComponent.drawNotification = {
            println("here")
            drawLogInNotification(this, findViewById<EditText>(R.id.edit_query).text.toString(),findViewById<EditText>(R.id.search_edit_frame).text.toString())
        }
    }
}