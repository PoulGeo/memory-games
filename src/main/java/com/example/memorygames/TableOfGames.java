package com.example.memorygames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.memorygames.Survey.Questions;
import com.example.memorygames.easy_level.Game6.G_e_6_1;
import com.example.memorygames.easy_level.Table_Easy;
import com.example.memorygames.hard_level.Table_Hard;
import com.example.memorygames.medium_level.Table_Medium;

public class TableOfGames extends AppCompatActivity {

    TextView start;
    Button newUser, changeUser, survey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_games);

        start = findViewById(R.id.tbl_games);
        newUser = findViewById(R.id.btnNewUser);
        changeUser = findViewById(R.id.btnChangeUser);
        survey = findViewById(R.id.btn_main_survey);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfGames.this, Table_Easy.class));
            }
        });
    }

    public void newUser(View view) {
        startActivity(new Intent(TableOfGames.this, SignUp.class));
    }

    public void changeUser(View view) {
        startActivity(new Intent(TableOfGames.this, SignUp.class));
    }

    public void survey_page(View view) {
        startActivity(new Intent(this, Questions.class));
    }
}
