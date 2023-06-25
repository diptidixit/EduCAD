package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home910 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home910);
    }

    public void testActivity(View view) {
        Intent intent = new Intent(this, Tests910.class);
        startActivity(intent);
    }
    public void videoActivity(View view) {
        Intent intent2 = new Intent(this, Videos910.class);
        startActivity(intent2);
    }
    public void pdfActivity(View view) {
        Intent intent3 = new Intent(this, pdf910.class);
        startActivity(intent3);
    }
}