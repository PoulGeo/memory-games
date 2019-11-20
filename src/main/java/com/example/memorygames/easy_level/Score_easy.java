package com.example.memorygames.easy_level;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.memorygames.R;
import com.example.memorygames.easy_level.Game1.G_e_1_1;
import com.example.memorygames.easy_level.Game2.G_e_2_3;
import com.example.memorygames.easy_level.Game3.G_e_3_3;
import com.example.memorygames.easy_level.Game4.G_e_4_3;
import com.example.memorygames.easy_level.Game5.G_e_5_3;
import com.example.memorygames.easy_level.Game6.G_e_6_3;
import com.example.memorygames.easy_level.Game7.G_e_7_3;
import com.example.memorygames.easy_level.Game8.G_e_8_3;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Score_easy extends AppCompatActivity {

    TextView score1, score2, score3, score4, score5, score6, score7, score8;

    public G_e_1_1 mGE11;
    public G_e_2_3 mGE23;
    public G_e_3_3 mGE33;
    public G_e_4_3 mGE43;
    public G_e_5_3 mGE53;
    public G_e_6_3 mGE63;
    public G_e_7_3 mGE73;
    public G_e_8_3 mGE83;

    //DatabaseReference db;
    //private String key = getIntent().getStringExtra("key8");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_easy);

       // db = FirebaseDatabase.getInstance().getReference();


        mGE11 = new G_e_1_1();
        mGE23 = new G_e_2_3();
        mGE33 = new G_e_3_3();
        mGE43 = new G_e_4_3();
        mGE53 = new G_e_5_3();
        mGE63 = new G_e_6_3();
        mGE73 = new G_e_7_3();
        mGE83 = new G_e_8_3();


        score1 = findViewById(R.id.score_1);
        //score1.setText(String.valueOf(mGE11.getScore()));


    }

}
