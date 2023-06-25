package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeJee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_jee);
    }
    public void testActivity(View view) {
        Intent intent = new Intent(this, TestsJEE.class);
        startActivity(intent);
    }
    public void videoActivity(View view) {
        Intent intent2 = new Intent(this, VideosJEE.class);
        startActivity(intent2);
    }
    public void pdfActivity(View view) {
        Intent intent3 = new Intent(this, pdfJEE.class);
        startActivity(intent3);
    }
}