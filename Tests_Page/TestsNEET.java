package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestsNEET extends AppCompatActivity {
    private Button test1p,test2p,test1c,test2c,test1b,test2b;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests_neet);
        test1p = findViewById(R.id.test1p);
        test2p = findViewById(R.id.test2p);
        test1c = findViewById(R.id.test1c);
        test2c = findViewById(R.id.test2c);
        test1b = findViewById(R.id.test1b);
        test2b = findViewById(R.id.test2b);
        test1p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 11;
                Intent intent = new Intent(TestsNEET.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 21;
                Intent intent = new Intent(TestsNEET.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 12;
                Intent intent = new Intent(TestsNEET.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 22;
                Intent intent = new Intent(TestsNEET.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 13;
                Intent intent = new Intent(TestsNEET.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        test2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 23;
                Intent intent = new Intent(TestsNEET.this, TestPage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
    }
}