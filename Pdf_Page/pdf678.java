package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.widget.Button;

public class pdf678 extends AppCompatActivity {
    //private EditText url;
    private Button pdf16,pdf26,pdf36,pdf17,pdf27,pdf37,pdf18,pdf28,pdf38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf678);
        //url = findViewById(R.id.editTextTextPersonName2);
        pdf16 = findViewById(R.id.pdf16);
        pdf26 = findViewById(R.id.pdf26);
        pdf36 = findViewById(R.id.pdf36);
        pdf17 = findViewById(R.id.pdf17);
        pdf27 = findViewById(R.id.pdf27);
        pdf37 = findViewById(R.id.pdf37);
        pdf18 = findViewById(R.id.pdf18);
        pdf28 = findViewById(R.id.pdf28);
        pdf38 = findViewById(R.id.pdf38);
        pdf16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/03/science-class-vi-chapter-01-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/04/science-class-vi-chapter-02-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/04/science-class-vi-chapter-03-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/03/science-class-vii-chapter-01-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/04/science-class-vii-chapter-02-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/04/science-class-vii-chapter-03-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/03/science-class-viii-chapter-01-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/04/science-class-viii-chapter-02-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2020/04/science-class-viii-chapter-03-study-material.pdf";
                StartDownload(getUrl);
            }
        });
    }
    private void StartDownload(String getUrl) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
        String title = URLUtil.guessFileName(getUrl, null, null);
        request.setTitle(title);
        request.setDescription("Downloading file please wait...");
        String cookie = CookieManager.getInstance().getCookie(getUrl);
        request.addRequestHeader("Cookie", cookie);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);
    }
}