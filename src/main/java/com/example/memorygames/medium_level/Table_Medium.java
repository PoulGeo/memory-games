package com.example.memorygames.medium_level;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.memorygames.Level_Choice;
import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.medium_level.Game1.G_m_1_1;
import com.example.memorygames.medium_level.Game2.G_m_2_1;
import com.example.memorygames.medium_level.Game3.G_m_3_1;
import com.example.memorygames.medium_level.Game4.G_m_4_1;
import com.example.memorygames.medium_level.Game5.G_m_5_1;
import com.example.memorygames.medium_level.Game6.G_m_6_1;
import com.example.memorygames.medium_level.Game7.G_m_7_1;
import com.example.memorygames.medium_level.Game8.G_m_8_1;

public class Table_Medium extends AppCompatActivity {

    Button game1, game2, game3, game4, game5, game6, game7, game8;
    ImageButton user, lvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__medium);

        game1=findViewById(R.id.btn1);
        game2=findViewById(R.id.btn2);
        game3=findViewById(R.id.btn3);
        game4=findViewById(R.id.btn4);
        game5=findViewById(R.id.btn5);
        game6=findViewById(R.id.btn6);
        game7=findViewById(R.id.btn7);
        game8=findViewById(R.id.btn8);

        user = findViewById(R.id.user);
        lvl = findViewById(R.id.lvl);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this, SignUp.class));
            }
        });

        lvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this, Level_Choice.class));
            }
        });

        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this, G_m_1_1.class));

            }
        });

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this, G_m_2_1.class));

            }
        });

        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this,  G_m_3_1.class));

            }
        });

        game4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this,  G_m_4_1.class));

            }
        });

        game5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this,  G_m_5_1.class));

            }
        });

        game6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this,  G_m_6_1.class));

            }
        });

        game7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this,  G_m_7_1.class));

            }
        });

        game8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Medium.this,  G_m_8_1.class));

            }
        });
    }
}
