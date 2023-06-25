package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;

public class LogInPage extends AppCompatActivity {

    private Button button;
    private EditText username,password;
    private TextView message;
    public static final String EXTRA_NAME = "com.example.educad.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
        button = findViewById(R.id.button3);
        username = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);
        message = findViewById(R.id.textView6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = username.getText().toString();
                String s2 = password.getText().toString();
                if(s1.equals("admin")&&s2.equals("admin")){
                    //Toast.makeText(LogInPage.this, "Successful", Toast.LENGTH_SHORT).show();
                    message.setText(" ");
                    Intent intent2 = new Intent(LogInPage.this, WelcomePage.class);
                    intent2.putExtra(EXTRA_NAME, s1);
                    startActivity(intent2);
                }
                else{
                    //Toast.makeText(LogInPage.this, "Failed", Toast.LENGTH_SHORT).show();
                    message.setText("Invalid Username or Password!");
                    username.setText("");
                    password.setText("");
                }
            }
        });
    }

}