package com.example.memorygames.easy_level.Game8;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.memorygames.R;
import com.example.memorygames.Score_Calculator;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Game2.G_e_2_1;
import com.example.memorygames.easy_level.Table_Easy;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class G_e_8_3 extends AppCompatActivity {

    private static String key;
    private static DatabaseReference db, db1;
    public Score_Calculator mScore_calculator;
    long startTime, endTime;
    Double score;

    public SoundPlayer sound;
    Button btn1, btn2, btn3, btn4;
    ImageButton user, help, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e_8_3);

        startTime = G_e_8_1.startTime;
        key=SignUp.k;
        db = FirebaseDatabase.getInstance().getReference("MemoryGames0");
        db1 = db.child(key).child("LevelEasy").child("game_8");
        mScore_calculator = new Score_Calculator();

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_8_3.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_8_3.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_8_3.this, Table_Easy.class));
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void right_ans(View view) {
        btn4.setBackgroundColor(this.getColor(R.color.colorPrimary));
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
        btn1.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans2(View view) {
        btn2.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans3(View view) {
        btn3.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    public void playSorting(View view) {
    }
}
