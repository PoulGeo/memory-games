package com.example.memorygames.hard_level.Game6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.memorygames.ImageSwitch;
import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Game6.G_e_6_3;
import com.example.memorygames.easy_level.Table_Easy;
import com.example.memorygames.hard_level.Table_Hard;
import com.example.memorygames.medium_level.Game6.G_m_6_1;

import java.util.Random;

public class G_h_6_3 extends AppCompatActivity {

    public SoundPlayer sound;
    ImageButton user, help, close, btn1, btn2, btn3, btn4, firstImage, secondImage;
    Random mRandom;
    int count = 0, a, b, c, d;
    Button check_btn;
    Integer[] Images = {R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_h_6_3);

        mRandom = new Random();
        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        check_btn = findViewById(R.id.check_btn);

        a = mRandom.nextInt(Images.length);
        btn1.setImageResource(Images[a]);
        btn1.setTag(a);
        do {
            b = mRandom.nextInt(Images.length);
        } while (b == a);
        {
            btn2.setImageResource(Images[b]);
            btn2.setTag(b);
        }
        do {
            c = mRandom.nextInt(Images.length);
        } while (c == a || c == b);
        {
            btn3.setImageResource(Images[c]);
            btn3.setTag(c);
        }
        do {
            d = mRandom.nextInt(Images.length);
        } while (d == a || d == b || d == c);
        {
            btn4.setImageResource(Images[d]);
            btn4.setTag(d);
        }

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_h_6_3.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_h_6_3.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_h_6_3.this, Table_Easy.class));
            }
        });
    }

    public void switch1(View view) {

        if (count == 0) {
            firstImage = btn1;
            count++;
        } else if (count == 1) {
            secondImage = btn1;
            new ImageSwitch(firstImage, secondImage);
            count = 0;
        }

    }

    public void switch2(View view) {

        if (count == 0) {
            firstImage = btn2;
            count++;
        } else if (count == 1) {
            secondImage = btn2;
            new ImageSwitch(firstImage, secondImage);
            count = 0;
        }
    }

    public void switch3(View view) {
        if (count == 0) {
            firstImage = btn3;
            count++;
        } else if (count == 1) {
            secondImage = btn3;
            new ImageSwitch(firstImage, secondImage);
            count = 0;
        }
    }

    public void switch4(View view) {

        if (count == 0) {
            firstImage = btn4;
            count++;
        } else if (count == 1) {
            secondImage = btn4;
            new ImageSwitch(firstImage, secondImage);
            count = 0;
        }
    }

    public void checkIt(View view) {

        if ((int) btn1.getTag() == 0 && (int) btn2.getTag() == 1 && (int) btn3.getTag() == 2 && (int) btn4.getTag() == 3) {

            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Table_Hard.class));

        }

    }

    public void playSorting(View view) {
    }
}
