package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home678 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home678);
    }

    public void testActivity(View view) {
        Intent intent = new Intent(this, Tests678.class);
        startActivity(intent);
    }
    public void videoActivity(View view) {
        Intent intent2 = new Intent(this, videos678.class);
        startActivity(intent2);
    }
    public void pdfActivity(View view) {
        Intent intent = new Intent(this, pdf678.class);
        startActivity(intent);
    }
}