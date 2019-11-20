package com.example.memorygames.medium_level.Game3;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Table_Easy;
import com.example.memorygames.medium_level.Table_Medium;

public class G_m_3_3 extends AppCompatActivity {

    ImageButton inst_g3, audio01, audio02, user, help, close;
    public SoundPlayer sound;
    TextView ch01, ch02, ch03, ch04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_m_3_3);

        inst_g3 = findViewById(R.id.tv_instructions);
        audio01 = findViewById(R.id.act_choice_1);
        audio02 = findViewById(R.id.act_choice_2);
        ch01 = findViewById(R.id.choice01);
        ch02 =findViewById(R.id.choice02);
        ch03 = findViewById(R.id.choice03);
        ch04 = findViewById(R.id.choice04);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_3_3.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_3_3.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_3_3.this, Table_Easy.class));
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void right_ans(View view) {
        ch04.setBackgroundColor(this.getColor(R.color.colorPrimary));
        startActivity(new Intent(this, Table_Medium.class));
        sound.playHitSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans1(View view) {
        ch01.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans2(View view) {
        ch02.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans3(View view) {
        ch03.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    public void playWashing_Dishes(View view) {
        sound.playWashing_Dishes();
    }

    public void playHanging_Clothes(View view) {
        sound.playHanging_Clothes();
    }
    public void playWatching_tv(View view) {
        sound.playWatching_TV();
    }

    public void playWhat_Activity(View view) {
        sound.playWhat_Activity();
    }

    public void playWashing_Hands(View view) {
        sound.playWashing_Hands();
    }
}
