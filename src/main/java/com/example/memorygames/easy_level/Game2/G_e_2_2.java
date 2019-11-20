package com.example.memorygames.easy_level.Game2;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.TableOfGames;
import com.example.memorygames.easy_level.Game1.G_e_1_2;
import com.example.memorygames.easy_level.Table_Easy;

public class G_e_2_2 extends AppCompatActivity {

    ImageButton img1, img2, img3, img4;
    public SoundPlayer sound;

    ImageButton user, help, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e_2_2);

        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);
        img3 = findViewById(R.id.image3);
        img4 = findViewById(R.id.image4);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_2_2.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_2_2.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_2_2.this, Table_Easy.class));
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void right_ans(View view) {
        img1.setBackgroundColor(this.getColor(R.color.colorPrimary));
        startActivity(new Intent(this, G_e_2_3.class));
        sound.playHitSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans1(View view) {
        img2.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans2(View view) {
        img3.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans3(View view) {
        img4.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void playNo_Some_Vehicle(View view) {
        sound.playNo_Some_Vehicle();
    }
}