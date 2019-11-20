package com.example.memorygames.medium_level.Game5;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Game5.G_e_5_3;
import com.example.memorygames.easy_level.Table_Easy;

public class G_m_5_1 extends AppCompatActivity {

    Button ch01, ch02, ch03, ch04, ch05, ch06;
    ImageButton user, help, close;
    public SoundPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_m_5_1);

        ch01 = findViewById(R.id.choice01);
        ch02 = findViewById(R.id.choice02);
        ch03 = findViewById(R.id.choice03);
        ch04 = findViewById(R.id.choice04);
        ch05 = findViewById(R.id.choice05);
        ch06 = findViewById(R.id.choice06);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_5_1.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_5_1.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_5_1.this, Table_Easy.class));
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void right_ans(View view) {
        ch01.setBackgroundColor(this.getColor(R.color.colorPrimary));
        startActivity(new Intent(this, G_m_5_2.class));
        sound.playHitSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans1(View view) {
        ch02.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans2(View view) {
        ch03.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans3(View view) {
        ch04.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans4(View view) {
        ch05.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans5(View view) {
        ch06.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    public void playWhat_Category(View view) {sound.playWhat_Category();}
}
