package com.example.intentexample

import android.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ThirdActivity : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvUser: TextView = findViewById(R.id.tvUser)
        val tvPasswd: TextView = findViewById(R.id.tvPasswd)
        val btnWeb: Button = findViewById(R.id.btnWeb)

        val intent = Intent.getIntent()
        val user = intent.getStringExtra("user")
        val passwd = intent.getStringExtra("passwd")

        tvUser.text = "Username: $user"
        tvPasswd.text = "Password: $passwd"

        btnWeb.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com")
            )
            ContextCompat.startActivity(browserIntent)
        }
    }
}