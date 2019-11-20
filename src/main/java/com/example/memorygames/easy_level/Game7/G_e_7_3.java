package com.example.memorygames.easy_level.Game7;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.memorygames.R;
import com.example.memorygames.Score_Calculator;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Game2.G_e_2_1;
import com.example.memorygames.easy_level.Table_Easy;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class G_e_7_3 extends AppCompatActivity {

    private static String key;
    private static DatabaseReference db, db1;
    public Score_Calculator mScore_calculator;
    long startTime, endTime;
    Double score;

    public SoundPlayer sound;
    ImageButton user, help, close, btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e_7_3);

        startTime = G_e_7_1.startTime;
        key=SignUp.k;
        db = FirebaseDatabase.getInstance().getReference("MemoryGames0");
        db1 = db.child(key).child("LevelEasy").child("game_7");
        mScore_calculator = new Score_Calculator();

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setImageResource(R.drawable.green_polo);
        btn2.setImageResource(R.drawable.brocolis);
        btn3.setImageResource(R.drawable.pink_dress);
        btn4.setImageResource(R.drawable.green_apple);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_7_3.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_7_3.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_7_3.this, Table_Easy.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setSelected(!btn1.isSelected());
                if (btn1.isSelected()){
                    btn1.setBackgroundColor(Color.BLUE);
                }else {
                    btn1.setBackground(null);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setSelected(!btn2.isSelected());
                if (btn2.isSelected()){
                    btn2.setBackgroundColor(Color.BLUE);
                }else{
                    btn2.setBackground(null);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setSelected(!btn3.isSelected());
                if (btn3.isSelected()){
                    btn3.setBackgroundColor(Color.BLUE);
                }else{
                    btn3.setBackground(null);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setSelected(!btn4.isSelected());
                if (btn4.isSelected()){
                    btn4.setBackgroundColor(Color.BLUE);
                }else{
                    btn4.setBackground(null);
                }
            }
        });


    }

    public void checkIt(View view) {
        if (btn1.isSelected()&&btn2.isSelected()&&!btn3.isSelected()&&btn4.isSelected()){
            sound.playHitSound();

            endTime = System.currentTimeMillis();
            mScore_calculator.setStart(startTime);
            mScore_calculator.setEnd(endTime);
            score = mScore_calculator.getEasy_Score(startTime, endTime, 5);
            db1.child("endTime: ").setValue(endTime);
            db1.child("score: ").setValue(score);

            startActivity(new Intent(this, Table_Easy.class));
        }else {
            sound.playOverSound();
        }
    }

    public void playSorting(View view) {
    }
}
