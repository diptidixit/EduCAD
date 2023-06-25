package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {

    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        welcome = findViewById(R.id.textView5);
        Intent intent = getIntent();
        String name = intent.getStringExtra(LogInPage.EXTRA_NAME);
        welcome.setText("Welcome "+name);

    }

    public void home678Activity(View view) {
        Intent intent = new Intent(WelcomePage.this, home678.class);
        startActivity(intent);
    }

    public void home910Activity(View view) {
        Intent intent2 = new Intent(WelcomePage.this, home910.class);
        startActivity(intent2);
    }

    public void homeJeeActivity(View view) {
        Intent intent3 = new Intent(WelcomePage.this, HomeJee.class);
        startActivity(intent3);
    }
    public void homeNeetActivity(View view) {
        Intent intent4 = new Intent(WelcomePage.this, HomeNEET.class);
        startActivity(intent4);
    }

}