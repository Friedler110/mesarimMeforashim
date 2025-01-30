package com.example.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvUser = findViewById(R.id.tvUser);
        TextView tvPasswd = findViewById(R.id.tvPasswd);
        Button btnWeb = findViewById(R.id.btnWeb);

        Intent intent = getIntent();
        String user = intent.getStringExtra("user");
        String passwd = intent.getStringExtra("passwd");

        tvUser.setText("Username: " + user);
        tvPasswd.setText("Password: " + passwd);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(browserIntent);
            }
        });
    }
}