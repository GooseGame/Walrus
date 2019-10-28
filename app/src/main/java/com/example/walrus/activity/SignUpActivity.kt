package com.example.walrus.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.walrus.ui.SignUpUI
import org.jetbrains.anko.setContentView

class SignUpActivity: AppCompatActivity() {
    private val uiComponent: SignUpUI by lazy { SignUpUI() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiComponent.setContentView(this)

    }
}