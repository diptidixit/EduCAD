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

public class pdf910 extends AppCompatActivity {
    private Button pdf19,pdf29,pdf39,pdf110,pdf210,pdf310;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf910);
        pdf19 = findViewById(R.id.pdf19);
        pdf29 = findViewById(R.id.pdf29);
        pdf39 = findViewById(R.id.pdf39);
        pdf110 = findViewById(R.id.pdf110);
        pdf210 = findViewById(R.id.pdf210);
        pdf310 = findViewById(R.id.pdf310);
        pdf19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2019/04/chemistry-class-ix-reference-study-material.pdf";
                StartDownload(getUrl);
            }
        });
        pdf29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2021/02/maths-ix-case-study-question-01.pdf";
                StartDownload(getUrl);
            }
        });
        pdf39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2021/06/science-ix-case-study-question-01.pdf";
                StartDownload(getUrl);
            }
        });
        pdf110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/07-magnetic-effects-of-electric-current-chapter-wise-important-questions.pdf";
                StartDownload(getUrl);
            }
        });
        pdf210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/03-political-parties-important-questions-and-answers.pdf";
                StartDownload(getUrl);
            }
        });
        pdf310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/09-light-reflection-and-refraction-chapter-wise-important-questions.pdf";
                StartDownload(getUrl);
            }
        });
    }
    private void StartDownload(String getUrl){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
        String title = URLUtil.guessFileName(getUrl,null,null);
        request.setTitle(title);
        request.setDescription("Downloading file please wait...");
        String cookie = CookieManager.getInstance().getCookie(getUrl);
        request.addRequestHeader("Cookie",cookie);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
        DownloadManager downloadManager = (DownloadManager)getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);
    }
}