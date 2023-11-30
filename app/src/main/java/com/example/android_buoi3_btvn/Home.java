package com.example.android_buoi3_btvn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    TextView tvChao;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvChao=findViewById(R.id.tvChaoMung);
        Intent intent=getIntent();
        String str=intent.getStringExtra("TK");
        tvChao.setText("Hello "+str);
    }
}