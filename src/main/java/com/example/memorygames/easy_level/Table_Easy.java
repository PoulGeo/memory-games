package com.example.memorygames.easy_level;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.memorygames.Level_Choice;
import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.easy_level.Game1.G_e_1_1;
import com.example.memorygames.easy_level.Game2.G_e_2_1;
import com.example.memorygames.easy_level.Game3.G_e_3_1;
import com.example.memorygames.easy_level.Game3.G_e_3_3;
import com.example.memorygames.easy_level.Game4.G_e_4_1;
import com.example.memorygames.easy_level.Game5.G_e_5_1;
import com.example.memorygames.easy_level.Game6.G_e_6_1;
import com.example.memorygames.easy_level.Game7.G_e_7_1;
import com.example.memorygames.easy_level.Game8.G_e_8_1;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Table_Easy extends AppCompatActivity {

    Button game1, game2, game3, game4, game5, game6, game7, game8;
    private static  String kEasy;
    DatabaseReference db;
    ImageButton user, lvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__easy);
        kEasy= SignUp.k;
        db= FirebaseDatabase.getInstance().getReference("MemoryGames0");


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
                startActivity(new Intent(Table_Easy.this, SignUp.class));
            }
        });

        lvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Table_Easy.this, Level_Choice.class));
            }
        });

        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_1_1.class);
             //   intent.putExtra("keyEasy1", kEasy);
                startActivity(intent);




            }
        });

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_2_1.class);
                intent.putExtra("keyEasy2", kEasy);
                startActivity(intent);


            }
        });

        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_3_1.class);
                intent.putExtra("keyEasy3", kEasy);
                startActivity(intent);



            }
        });

        game4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_4_1.class);
                intent.putExtra("keyEasy4", kEasy);
                startActivity(intent);

            }
        });

        game5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_5_1.class);
                intent.putExtra("keyEasy5", kEasy);
                startActivity(intent);
            }
        });

        game6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_6_1.class);
                intent.putExtra("keyEasy6", kEasy);
                startActivity(intent);
            }
        });

        game7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_7_1.class);
                intent.putExtra("keyEasy7", kEasy);
                startActivity(intent);
            }
        });

        game8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table_Easy.this,  G_e_8_1.class);
                intent.putExtra("keyEasy8", kEasy);
                startActivity(intent);
            }
        });
    }
}
