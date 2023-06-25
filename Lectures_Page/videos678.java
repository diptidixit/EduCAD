package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class videos678 extends AppCompatActivity {
    private Button vid16,vid26,vid36,vid17,vid27,vid37,vid18,vid28,vid38;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos678);
        vid16 = findViewById(R.id.vid16);
        vid26 = findViewById(R.id.vid26);
        vid36 = findViewById(R.id.vid36);
        vid17 = findViewById(R.id.vid17);
        vid27 = findViewById(R.id.vid27);
        vid37 = findViewById(R.id.vid37);
        vid18 = findViewById(R.id.vid18);
        vid28 = findViewById(R.id.vid28);
        vid38 = findViewById(R.id.vid38);
        vid16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 16;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 26;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 36;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 17;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 27;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 37;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 18;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 28;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 38;
                Intent intent = new Intent(videos678.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
    }
}