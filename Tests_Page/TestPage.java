package com.example.educad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TestPage extends AppCompatActivity {
    private int score=0,num=0;
    private boolean[] answerA = {false,false,false,false,false};
    private boolean[] answerB = {false,false,false,false,false};
    private boolean[] answerC = {false,false,false,false,false};
    private boolean[] answerD = {false,false,false,false,false};

    private Button A, B, C, D;
    private TextView result;
    private ImageView ques;

    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_page);
        A = findViewById(R.id.button4);
        B = findViewById(R.id.button5);
        C = findViewById(R.id.button6);
        D = findViewById(R.id.button7);
        ques = findViewById(R.id.imageView);
        result = findViewById(R.id.textView12);

        Intent intent = getIntent();
        int num = intent.getIntExtra(videos678.EXTRA_NUM,0);
        if (num==16){
            ques.setImageResource(R.drawable.q161);
            answerD[0]=true;
            answerA[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerA[4]=true;
        } else if (num==26){
            ques.setImageResource(R.drawable.q261);
            answerC[0]=true;
            answerC[1]=true;
            answerA[2]=true;
            answerA[3]=true;
            answerA[4]=true;
        } else if (num==17){
            ques.setImageResource(R.drawable.q171);
            answerA[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerD[4]=true;
        } else if (num==27){
            ques.setImageResource(R.drawable.q271);
            answerA[0]=true;
            answerC[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerB[4]=true;
        } else if (num==18){
            ques.setImageResource(R.drawable.q181);
            answerD[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerC[4]=true;
        } else if (num==28){
            ques.setImageResource(R.drawable.q261);
            answerC[0]=true;
            answerC[1]=true;
            answerA[2]=true;
            answerA[3]=true;
            answerA[4]=true;
        } else if (num==19){
            ques.setImageResource(R.drawable.q271);
            answerA[0]=true;
            answerC[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerB[4]=true;
        } else if (num==29){
            ques.setImageResource(R.drawable.q261);
            answerC[0]=true;
            answerC[1]=true;
            answerA[2]=true;
            answerA[3]=true;
            answerA[4]=true;
        } else if (num==110){
            ques.setImageResource(R.drawable.q171);
            answerA[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerD[4]=true;
        } else if (num==210){
            ques.setImageResource(R.drawable.q181);
            answerD[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerC[4]=true;
        } else if (num==11){
            ques.setImageResource(R.drawable.q181);
            answerD[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerC[4]=true;
        } else if (num==21){
            ques.setImageResource(R.drawable.q271);
            answerA[0]=true;
            answerC[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerB[4]=true;
        } else if (num==12){
            ques.setImageResource(R.drawable.q271);
            answerA[0]=true;
            answerC[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerB[4]=true;
        } else if (num==22){
            ques.setImageResource(R.drawable.q181);
            answerD[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerC[4]=true;
        }else if (num==13){
            ques.setImageResource(R.drawable.q261);
            answerC[0]=true;
            answerC[1]=true;
            answerA[2]=true;
            answerA[3]=true;
            answerA[4]=true;
        } else if (num==23){
            ques.setImageResource(R.drawable.q161);
            answerD[0]=true;
            answerA[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerA[4]=true;
        }else if (num==14){
            ques.setImageResource(R.drawable.q171);
            answerA[0]=true;
            answerA[1]=true;
            answerB[2]=true;
            answerA[3]=true;
            answerD[4]=true;
        } else if (num==24){
            ques.setImageResource(R.drawable.q161);
            answerD[0]=true;
            answerA[1]=true;
            answerD[2]=true;
            answerB[3]=true;
            answerA[4]=true;
        }

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<5){
                    if(answerA[index]){
                        score++;
                    }
                    ++index;
                    if(index!=5){
                        if(index==1){
                            if (num==16){
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q162);
                            }
                        } else if(index==2){
                            if (num==16){
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q163);
                            }
                        } else if(index==3) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q164);
                            }
                        } else if(index==4) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q165);
                            }
                        }
                    }
                    else{
                        ques.setImageResource(R.drawable.plainwhite);
                        result.setText("Your score is: "+score+"/5");
                    }
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<5){
                    if(answerB[index]){
                        score++;
                    }
                    ++index;
                    if(index!=5){
                        if(index==1){
                            if (num==16){
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q162);
                            }
                        } else if(index==2){
                            if (num==16){
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q163);
                            }
                        } else if(index==3) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q164);
                            }
                        } else if(index==4) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q165);
                            }
                        }
                    }
                    else{
                        ques.setImageResource(R.drawable.plainwhite);
                        result.setText("Your score is: "+score+"/5");
                    }
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<5){
                    if(answerC[index]){
                        score++;
                    }
                    ++index;
                    if(index!=5){
                        if(index==1){
                            if (num==16){
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q162);
                            }
                        } else if(index==2){
                            if (num==16){
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q163);
                            }
                        } else if(index==3) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q164);
                            }
                        } else if(index==4) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q165);
                            }
                        }
                    }
                    else{
                        ques.setImageResource(R.drawable.plainwhite);
                        result.setText("Your score is: "+score+"/5");
                    }
                }
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<5){
                    if(answerD[index]){
                        score++;
                    }
                    ++index;
                    if(index!=5){
                        if(index==1){
                            if (num==16){
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q272);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q182);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q262);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q162);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q172);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q162);
                            }
                        } else if(index==2){
                            if (num==16){
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q273);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q183);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q263);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q163);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q173);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q163);
                            }
                        } else if(index==3) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q274);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q184);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q264);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q164);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q174);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q164);
                            }
                        } else if(index==4) {
                            if (num==16){
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==26){
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==17) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==27) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==18) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==28) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==19) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==29) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==110) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==210) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==11) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==21) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==12) {
                                ques.setImageResource(R.drawable.q275);
                            } else if (num==22) {
                                ques.setImageResource(R.drawable.q185);
                            } else if (num==13) {
                                ques.setImageResource(R.drawable.q265);
                            } else if (num==23) {
                                ques.setImageResource(R.drawable.q165);
                            } else if (num==14) {
                                ques.setImageResource(R.drawable.q175);
                            } else if (num==24) {
                                ques.setImageResource(R.drawable.q165);
                            }
                        }
                    }
                    else{
                        ques.setImageResource(R.drawable.plainwhite);
                        result.setText("Your score is: "+score+"/5");
                    }
                }
            }
        });
    }
}