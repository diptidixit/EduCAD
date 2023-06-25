package com.example.educad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class LecturePage extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaplayer.stop();
    }

    private Button play;
    private SeekBar seekbar;
    private MediaPlayer mediaplayer;
    private SurfaceView surfaceview;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_page);
        surfaceview = findViewById(R.id.surfaceView);
        play = findViewById(R.id.play);
        seekbar = findViewById(R.id.seekBar);
        Intent intent = getIntent();
        int num = intent.getIntExtra(videos678.EXTRA_NUM,0);
        mediaplayer = new MediaPlayer();
        if (num==16) {
            mediaplayer = MediaPlayer.create(this,R.raw.vid16);
        } else if(num==26){
            mediaplayer = MediaPlayer.create(this,R.raw.vid26);
        } else if(num==36){
            mediaplayer = MediaPlayer.create(this,R.raw.vid36);
        } else if(num==17){
            mediaplayer = MediaPlayer.create(this,R.raw.vid17);
        } else if(num==27){
            mediaplayer = MediaPlayer.create(this,R.raw.vid27);
        } else if(num==37){
            mediaplayer = MediaPlayer.create(this,R.raw.vid37);
        } else if(num==18){
            mediaplayer = MediaPlayer.create(this,R.raw.vid18);
        } else if(num==28){
            mediaplayer = MediaPlayer.create(this,R.raw.vid28);
        } else if(num==38){
            mediaplayer = MediaPlayer.create(this,R.raw.vid38);
        } else if(num==19){
            mediaplayer = MediaPlayer.create(this,R.raw.vid19);
        } else if(num==29){
            mediaplayer = MediaPlayer.create(this,R.raw.vid29);
        } else if(num==39){
            mediaplayer = MediaPlayer.create(this,R.raw.vid39);
        } else if (num==110) {
            mediaplayer = MediaPlayer.create(this,R.raw.vid110);
        } else if(num==210) {
            mediaplayer = MediaPlayer.create(this,R.raw.vid210);
        } else if(num==310){
            mediaplayer = MediaPlayer.create(this,R.raw.vid310);
        } else if(num==11){
            mediaplayer = MediaPlayer.create(this,R.raw.vid1p);
        } else if(num==21){
            mediaplayer = MediaPlayer.create(this,R.raw.vid2p);
        } else if(num==31){
            mediaplayer = MediaPlayer.create(this,R.raw.vid3p);
        } else if(num==12){
            mediaplayer = MediaPlayer.create(this,R.raw.vid1c);
        } else if(num==22){
            mediaplayer = MediaPlayer.create(this,R.raw.vid2c);
        } else if(num==32){
            mediaplayer = MediaPlayer.create(this,R.raw.vid3c);
        } else if(num==13){
            mediaplayer = MediaPlayer.create(this,R.raw.vid1m);
        } else if(num==23){
            mediaplayer = MediaPlayer.create(this,R.raw.vid2m);
        } else if(num==33){
            mediaplayer = MediaPlayer.create(this,R.raw.vid3m);
        } else if(num==14){
            mediaplayer = MediaPlayer.create(this,R.raw.vid1b);
        } else if(num==24){
            mediaplayer = MediaPlayer.create(this,R.raw.vid2b);
        } else if(num==34){
            mediaplayer = MediaPlayer.create(this,R.raw.vid3b);
        }

        surfaceview.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceview.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaplayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });

        seekbar.setMax(mediaplayer.getDuration());
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekbar.setProgress(mediaplayer.getCurrentPosition());
            }
        }, 0 , 800);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaplayer.seekTo(seekBar.getProgress());
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaplayer.isPlaying()){
                    mediaplayer.pause();
                    play.setText("Play");
                } else {
                    mediaplayer.start();
                    play.setText("Pause");
                }
            }
        });
        mediaplayer.start();
    }
}