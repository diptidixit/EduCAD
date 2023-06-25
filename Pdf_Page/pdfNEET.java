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

public class pdfNEET extends AppCompatActivity {
    private Button pdf1p,pdf2p,pdf3p,pdf1c,pdf2c,pdf3c,pdf1b,pdf2b,pdf3b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_neet);
        pdf1p = findViewById(R.id.pdf1p);
        pdf2p = findViewById(R.id.pdf2p);
        pdf3p = findViewById(R.id.pdf3p);
        pdf1c = findViewById(R.id.pdf1c);
        pdf2c = findViewById(R.id.pdf2c);
        pdf3c = findViewById(R.id.pdf3c);
        pdf1b = findViewById(R.id.pdf1b);
        pdf2b = findViewById(R.id.pdf2b);
        pdf3b = findViewById(R.id.pdf3b);
        pdf1p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/02/physics-notes-xii-electrostatics.pdf";
                StartDownload(getUrl);
            }
        });
        pdf2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/02/physics-notes-xii-current-electricity.pdf";
                StartDownload(getUrl);
            }
        });
        pdf3p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/02/physics-notes-xii-electromagnetic-waves.pdf";
                StartDownload(getUrl);
            }
        });
        pdf1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/13-acids-bases-and-salts-chapter-wise-important-questions.pdf";
                StartDownload(getUrl);
            }
        });
        pdf2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/02-carbon-and-its-compounds-chapter-wise-important-questions.pdf";
                StartDownload(getUrl);
            }
        });
        pdf3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/01-metals-and-non-metals-imp-question-and-answers.pdf";
                StartDownload(getUrl);
            }
        });
        pdf1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/04-control-and-coordination-chapter-wise-important-questions.pdf";
                StartDownload(getUrl);
            }
        });
        pdf2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/11-heredity-and-evolution-chapter-wise-important-questions.pdf";
                StartDownload(getUrl);
            }
        });
        pdf3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUrl = "https://kumarsir34.files.wordpress.com/2018/03/03-life-processes-chapter-wise-important-questions.pdf";
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