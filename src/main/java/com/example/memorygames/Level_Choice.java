package com.example.memorygames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.memorygames.easy_level.Game1.G_e_1_1;
import com.example.memorygames.easy_level.Table_Easy;
import com.example.memorygames.hard_level.Table_Hard;
import com.example.memorygames.medium_level.Table_Medium;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Constructor.User;

public class Level_Choice extends AppCompatActivity {

    private DatabaseReference db;
    private static String k1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level__choice);
        k1= SignUp.k;
        db = FirebaseDatabase.getInstance().getReference("MemoryGames0").child(k1).child("Level Choice");
        Log.d("xaxaxaxa", k1);




        // edw prepei na valoume to String k me getIntent
        // prepei na ftiaksoume ena kainourio Sting k1 as poume gia na baloume to push().getkey();
        //wste telika na to perasoume stis epomenes activities

    }

    public void easy_level(View view) {
        String lvl="easy";
        User user = new User(lvl);
        db.setValue(user);
        Intent intent = new Intent(Level_Choice.this,  Table_Easy.class);
        startActivity(intent);



    }

    public void medium_level(View view) {
        String lvl="easy";
        User user = new User(lvl);
        db.setValue(user);
        Intent intent = new Intent(Level_Choice.this,  Table_Medium.class);
        startActivity(intent);




    }

    public void hard_level(View view) {
        String lvl="easy";
        User user = new User(lvl);
        db.setValue(user);
        Intent intent = new Intent(Level_Choice.this,  Table_Hard.class);
        startActivity(intent);





    }
}
