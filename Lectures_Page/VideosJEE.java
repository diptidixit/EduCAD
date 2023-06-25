package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideosJEE extends AppCompatActivity {
    private Button vid1p,vid2p,vid3p,vid1c,vid2c,vid3c,vid1m,vid2m,vid3m;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_jee);
        vid1p = findViewById(R.id.vid1p);
        vid2p = findViewById(R.id.vid2p);
        vid3p = findViewById(R.id.vid3p);
        vid1c = findViewById(R.id.vid1c);
        vid2c = findViewById(R.id.vid2c);
        vid3c = findViewById(R.id.vid3c);
        vid1m = findViewById(R.id.vid1m);
        vid2m = findViewById(R.id.vid2m);
        vid3m = findViewById(R.id.vid3m);
        vid1p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 11;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 21;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid3p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 31;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 12;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 22;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 32;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid1m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 13;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 23;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 33;
                Intent intent = new Intent(VideosJEE.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
    }
}