package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Videos910 extends AppCompatActivity {
    private Button vid19,vid29,vid39,vid110,vid210,vid310;
    public static final String EXTRA_NUM = "com.example.educad.extra.NUM";
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos910);
        vid19 = findViewById(R.id.vid19);
        vid29 = findViewById(R.id.vid29);
        vid39 = findViewById(R.id.vid39);
        vid110 = findViewById(R.id.vid110);
        vid210 = findViewById(R.id.vid210);
        vid310 = findViewById(R.id.vid310);
        vid19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 19;
                Intent intent = new Intent(Videos910.this, LecturePage.class);
                intent.putExtra(EXTRA_NUM, num);
                startActivity(intent);
            }
        });
        vid29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 29;
                Intent intent2 = new Intent(Videos910.this, LecturePage.class);
                intent2.putExtra(EXTRA_NUM, num);
                startActivity(intent2);
            }
        });
        vid39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 39;
                Intent intent3 = new Intent(Videos910.this, LecturePage.class);
                intent3.putExtra(EXTRA_NUM, num);
                startActivity(intent3);
            }
        });
        vid110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 110;
                Intent intent4 = new Intent(Videos910.this, LecturePage.class);
                intent4.putExtra(EXTRA_NUM, num);
                startActivity(intent4);
            }
        });
        vid210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 210;
                Intent intent5 = new Intent(Videos910.this, LecturePage.class);
                intent5.putExtra(EXTRA_NUM, num);
                startActivity(intent5);
            }
        });
        vid310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 310;
                Intent intent6 = new Intent(Videos910.this, LecturePage.class);
                intent6.putExtra(EXTRA_NUM, num);
                startActivity(intent6);
            }
        });
    }
}