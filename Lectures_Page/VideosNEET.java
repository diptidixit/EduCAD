package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideosNEET extends AppCompatActivity {
    private Button vid1p,vid2p,vid3p,vid1c,vid2c,vid3c,vid1b,vid2b,vid3b;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_neet);
        vid1p = findViewById(R.id.vid1p);
        vid2p = findViewById(R.id.vid2p);
        vid3p = findViewById(R.id.vid3p);
        vid1c = findViewById(R.id.vid1c);
        vid2c = findViewById(R.id.vid2c);
        vid3c = findViewById(R.id.vid3c);
        vid1b = findViewById(R.id.vid1b);
        vid2b = findViewById(R.id.vid2b);
        vid3b = findViewById(R.id.vid3b);
        vid1p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 11;
                Intent intent = new Intent(VideosNEET.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 21;
                Intent intent2 = new Intent(VideosNEET.this, LecturePage.class);
                intent2.putExtra(EXTRA_NUM, num);
                startActivity(intent2);
            }
        });
        vid3p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 31;
                Intent intent3 = new Intent(VideosNEET.this, LecturePage.class);
                intent3.putExtra(EXTRA_NUM, num);
                startActivity(intent3);
            }
        });
        vid1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 12;
                Intent intent4 = new Intent(VideosNEET.this, LecturePage.class);
                intent4.putExtra(EXTRA_NUM, num);
                startActivity(intent4);
            }
        });
        vid2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 22;
                Intent intent5 = new Intent(VideosNEET.this, LecturePage.class);
                intent5.putExtra(EXTRA_NUM, num);
                startActivity(intent5);
            }
        });
        vid3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 32;
                Intent intent6 = new Intent(VideosNEET.this, LecturePage.class);
                intent6.putExtra(EXTRA_NUM, num);
                startActivity(intent6);
            }
        });
        vid1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 14;
                Intent intent7 = new Intent(VideosNEET.this, LecturePage.class);
                intent7.putExtra(EXTRA_NUM, num);
                startActivity(intent7);
            }
        });
        vid2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 24;
                Intent intent8 = new Intent(VideosNEET.this, LecturePage.class);
                intent8.putExtra(EXTRA_NUM, num);
                startActivity(intent8);
            }
        });
        vid3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 34;
                Intent intent9 = new Intent(VideosNEET.this, LecturePage.class);
                intent9.putExtra(EXTRA_NUM, num);
                startActivity(intent9);
            }
        });
    }
}