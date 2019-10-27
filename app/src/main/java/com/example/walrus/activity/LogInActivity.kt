package com.example.walrus.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.walrus.ui.LogInUI
import org.jetbrains.anko.setContentView

class LogInActivity: AppCompatActivity() {
    private val uiComponent: LogInUI by lazy { LogInUI() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiComponent.setContentView(this)
    }
}