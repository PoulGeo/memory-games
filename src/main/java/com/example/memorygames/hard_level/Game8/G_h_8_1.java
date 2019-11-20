package com.example.memorygames.hard_level.Game8;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Table_Easy;
import com.example.memorygames.medium_level.Game8.G_m_8_3;
import com.example.memorygames.medium_level.Table_Medium;

public class G_h_8_1 extends AppCompatActivity {

    public SoundPlayer sound;
    ImageButton user, help, close, btn1, btn2, btn3, btn4, guide;
    TextView iv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_h_8_1);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);
        guide = findViewById(R.id.guide);

        iv_text = findViewById(R.id.iv_primary);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        iv_text.setText("50 - 23 = __ €");

        btn1.setImageResource(R.drawable.two_euro_coin);
        btn2.setImageResource(R.drawable.euro_50);
        btn3.setImageResource(R.drawable.euro_5);
        btn4.setImageResource(R.drawable.euro_20);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_h_8_1.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_h_8_1.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_h_8_1.this, Table_Easy.class));
            }
        });

        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {sound.playSum_Money();}
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setSelected(!btn1.isSelected());
                if (btn1.isSelected()){
                    btn1.setBackgroundColor(Color.BLUE);
                }else {btn1.setBackground(null);}
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setSelected(!btn2.isSelected());
                if (btn2.isSelected()){
                    btn2.setBackgroundColor(Color.BLUE);
                }else{btn2.setBackground(null);}
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setSelected(!btn3.isSelected());
                if (btn3.isSelected()){
                    btn3.setBackgroundColor(Color.BLUE);
                }else{btn3.setBackground(null);}
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setSelected(!btn4.isSelected());
                if (btn4.isSelected()){
                    btn4.setBackgroundColor(Color.BLUE);
                }else{btn4.setBackground(null);}
            }
        });
    }
    public void checkIt(View view) {
        if (btn1.isSelected()&&!btn2.isSelected()&&btn3.isSelected()&&btn4.isSelected()){
            sound.playHitSound();
            startActivity(new Intent(this, G_h_8_2.class));
        }else {
            sound.playOverSound();
        }
    }
}
