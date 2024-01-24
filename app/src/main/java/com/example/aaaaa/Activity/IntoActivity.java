package com.example.aaaaa.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aaaaa.R;

public class IntoActivity extends AppCompatActivity {

    ConstraintLayout startBtnLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into);
        startBtnLayout = findViewById(R.id.startBtn);
        startBtnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntoActivity.this,MainActivity.class));
            }
        });
    }
}