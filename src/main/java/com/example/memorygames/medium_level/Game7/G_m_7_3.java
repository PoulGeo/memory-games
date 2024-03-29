package com.example.memorygames.medium_level.Game7;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Table_Easy;
import com.example.memorygames.medium_level.Table_Medium;

public class G_m_7_3 extends AppCompatActivity {

    public SoundPlayer sound;
    ImageButton user, help, close, btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_m_7_3);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn1.setImageResource(R.drawable.polygon);
        btn2.setImageResource(R.drawable.triangle_5);
        btn3.setImageResource(R.drawable.sphere);
        btn4.setImageResource(R.drawable.triangles_7);
        btn5.setImageResource(R.drawable.starfish);
        btn6.setImageResource(R.drawable.triangle_8);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_7_3.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_7_3.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_m_7_3.this, Table_Easy.class));
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

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setSelected(!btn5.isSelected());
                if (btn5.isSelected()){
                    btn5.setBackgroundColor(Color.BLUE);
                }else{
                    btn5.setBackground(null);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setSelected(!btn6.isSelected());
                if (btn6.isSelected()){
                    btn6.setBackgroundColor(Color.BLUE);
                }else{
                    btn6.setBackground(null);
                }
            }
        });
    }

    public void checkIt(View view) {
        if (!btn1.isSelected()&&btn2.isSelected()&&!btn3.isSelected()&&btn4.isSelected()&&!btn5.isSelected()&&btn6.isSelected()){
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            sound.playHitSound();
            startActivity(new Intent(this, Table_Medium.class));
        }else {
            Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
            sound.playOverSound();
        }
    }

    public void playSorting(View view) {
    }
}
