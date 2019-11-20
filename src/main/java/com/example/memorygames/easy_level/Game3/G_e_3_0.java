package com.example.memorygames.easy_level.Game3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.memorygames.Game_3_db;
import com.example.memorygames.R;
import com.example.memorygames.db_Items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class G_e_3_0 extends AppCompatActivity {

    TextView b_answer1,b_answer2;

    ImageView iv_flag;

    List<db_Items> list;

    Random rand;

    int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e_3_0);

        iv_flag=findViewById(R.id.iv_activity);

        b_answer1=findViewById(R.id.choice01);
        b_answer2=findViewById(R.id.choice02);

        list = new ArrayList<>();

        //add all flags and names to the list
        for (int i = 0; i<new Game_3_db().answers.length; i++){
            list.add(new db_Items(new Game_3_db().answers[i], new Game_3_db().pictures[i]));
        }

        //shuffle the countries
        Collections.shuffle(list);

        newQuestion(turn);

        b_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if the answer is correct
                if (b_answer1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(G_e_3_0.this, "Correct!", Toast.LENGTH_SHORT).show();

                    //check if it is the last question
                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(G_e_3_0.this, "You finished the game!", Toast.LENGTH_SHORT).show();
                        finish();
                    }


                } else {
                    Toast.makeText(G_e_3_0.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(G_e_3_0.this, "You lost the game!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b_answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if the answer is correct
                if (b_answer2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(G_e_3_0.this, "Correct!", Toast.LENGTH_SHORT).show();

                    //check if it is the last question
                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(G_e_3_0.this, "You finished the game!", Toast.LENGTH_SHORT).show();
                    }


                } else {
                    Toast.makeText(G_e_3_0.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(G_e_3_0.this, "You lost the game!", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });


    }

    private void newQuestion(int number) {
        //set flag image to the screen
        iv_flag.setImageResource(list.get(number - 1).getImage());

        //decide on witch button to place the correct answer
        int correct_answer = rand.nextInt(4) + 1;

        int firstButton = number - 1;
        int secondButton;
        int thirdButton;
        int fourthButton;

        switch (correct_answer) {
            case 1:
                b_answer1.setText(list.get(firstButton).getName());

                do {
                    secondButton = rand.nextInt(list.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = rand.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do {
                    fourthButton = rand.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                b_answer2.setText(list.get(secondButton).getName());


                break;

            case 2:

                b_answer2.setText(list.get(firstButton).getName());

                do {
                    secondButton = rand.nextInt(list.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = rand.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do {
                    fourthButton = rand.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                b_answer1.setText(list.get(secondButton).getName());

                break;
        }
    }

    public void right_ans(View view) {
    }

    public void wrong_ans(View view) {
    }
}
