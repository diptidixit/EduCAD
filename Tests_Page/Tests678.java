package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tests678 extends AppCompatActivity {
    private Button test16,test26,test17,test27,test18,test28;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests678);
        test16 = findViewById(R.id.test16);
        test26 = findViewById(R.id.test26);
        test17 = findViewById(R.id.test17);
        test27 = findViewById(R.id.test27);
        test18 = findViewById(R.id.test18);
        test28 = findViewById(R.id.test28);
        test16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 16;
                Intent intent = new Intent(Tests678.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 26;
                Intent intent = new Intent(Tests678.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 17;
                Intent intent = new Intent(Tests678.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 27;
                Intent intent = new Intent(Tests678.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 18;
                Intent intent = new Intent(Tests678.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 28;
                Intent intent = new Intent(Tests678.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
    }
}