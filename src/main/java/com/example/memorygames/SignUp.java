package com.example.memorygames;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Constructor.User;

public class SignUp extends AppCompatActivity {

    public static String k;
    DatabaseReference mDatabaseReference;
    EditText username, password, city, birthdate, education, Gender , level;
    private static String name, pass, city1, birth, edu, gen, lvl;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        city = findViewById(R.id.city);
        birthdate = findViewById(R.id.birthdate);
        education = findViewById(R.id.education);

        Gender = findViewById(R.id.gender);
        level = findViewById(R.id.difficulty_level);

        mDatabaseReference = FirebaseDatabase.getInstance().getReference("MemoryGames0");

    }


    public void Enroll(View view) {

        name = username.getText().toString().trim();
        pass = password.getText().toString().trim();
        city1 = city.getText().toString().trim();
        birth = birthdate.getText().toString().trim();
        edu = education.getText().toString().trim();
        gen = Gender.getText().toString().trim();
        lvl = level.getText().toString().trim();

        k= mDatabaseReference.push().getKey();//(pairneis to userID apo th bash)

        User user = new User(name, pass, city1, birth, edu, gen, lvl);


        mDatabaseReference.child(k).child("user").setValue(user);

        Toast.makeText(getApplicationContext(), " Η Εγγραφή Ολοκληρώθηκε", Toast.LENGTH_LONG).show();


        Intent intent = new Intent(SignUp.this, Level_Choice.class);
        startActivity(intent);






    }

    public void male(View view) {
        Gender.setText("Male");
    }

    public void female(View view) {
        Gender.setText("Female");

    }

    public void easy(View view) {
        level.setText("Easy");


    }

    public void medium(View view) {
        level.setText("Medium");

    }

    public void hard(View view) {
        level.setText("Hard");

    }


}
