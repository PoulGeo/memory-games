package com.example.memorygames.easy_level.Game4;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.memorygames.R;
import com.example.memorygames.Score_Calculator;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Game2.G_e_2_1;
import com.example.memorygames.easy_level.Table_Easy;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class G_e_4_3 extends AppCompatActivity {

    private static String key;
    private static DatabaseReference db, db1;
    public Score_Calculator mScore_calculator;
    long startTime, endTime;
    Double score;

    ImageView ch01, ch02, ch03;
    ImageButton user, help, close, mImageButton;
    public SoundPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e_4_3);

        startTime = G_e_4_1.startTime;
        key=SignUp.k;
        db = FirebaseDatabase.getInstance().getReference("MemoryGames0");
        db1 = db.child(key).child("LevelEasy").child("game_4");
        mScore_calculator = new Score_Calculator();

        ch01 = findViewById(R.id.choice01);
        ch02 = findViewById(R.id.choice02);
        ch03 = findViewById(R.id.choice03);

        mImageButton = findViewById(R.id.iv_sound);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_4_3.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_4_3.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_4_3.this, Table_Easy.class));
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void right_ans(View view) {
        ch02.setBackgroundColor(this.getColor(R.color.colorPrimary));
        sound.playHitSound();

        endTime = System.currentTimeMillis();
        mScore_calculator.setStart(startTime);
        mScore_calculator.setEnd(endTime);
        score = mScore_calculator.getEasy_Score(startTime, endTime, 5);
        db1.child("endTime: ").setValue(endTime);
        db1.child("score: ").setValue(score);

        startActivity(new Intent(this, Table_Easy.class));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans1(View view) {
        ch01.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans2(View view) {
        ch03.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    public void playWhat_Sound(View view) {
        sound.playWhat_Sound();
    }

    public void playSounds(View view) {
        sound.playPig_sound();
    }
}
