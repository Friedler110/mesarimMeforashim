package com.example.intentexample

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.etName)
        val etPasswd: EditText = findViewById(R.id.etPasswd)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = etName.text.toString()
            val passwd = etPasswd.text.toString()

            val i = Intent("stam1234")
            i.putExtra("user", user)
            i.putExtra("passwd", passwd)
            ContextCompat.startActivity(i)
        }
    }
}