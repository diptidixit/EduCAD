package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tests910 extends AppCompatActivity {
    private Button test19,test29,test110,test210;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests910);
        test19 = findViewById(R.id.test19);
        test29 = findViewById(R.id.test29);
        test110 = findViewById(R.id.test110);
        test210 = findViewById(R.id.test210);
        test19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 19;
                Intent intent = new Intent(Tests910.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 29;
                Intent intent = new Intent(Tests910.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 110;
                Intent intent = new Intent(Tests910.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 210;
                Intent intent = new Intent(Tests910.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
    }
}