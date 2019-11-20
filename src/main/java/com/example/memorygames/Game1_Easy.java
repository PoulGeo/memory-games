package com.example.memorygames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.memorygames.Sounds.SoundPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game1_Easy extends AppCompatActivity {

    ImageButton account, help, close, im1, im2, im3, im4, audio;
    Button word;

    List <Picks> list;
    List <Picks> mImage_vrs;

    Random r= new Random(4+1);
    int turn = 1;

    public SoundPlayer sound;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);


        im1=(ImageButton)findViewById(R.id.image1);
        im2=(ImageButton)findViewById(R.id.image2);
        im3=(ImageButton)findViewById(R.id.image3);
        im4=(ImageButton)findViewById(R.id.image4);

        audio = findViewById(R.id.audio);
        word = findViewById(R.id.word);

        account = findViewById(R.id.user);
        close = findViewById(R.id.close);
        help = findViewById(R.id.help);

        list = new ArrayList<>();
        mImage_vrs= new ArrayList<>();


        for (int i = 0; i< new Game1_db().answers.length; i++){
            list.add(new Picks(new Game1_db().answers[i], new Game1_db().eikones[i]));
            mImage_vrs.add(new Picks(new Game1_db().answers[i],new Game1_db().agglika[i], new Game1_db().eikones[i]));
        }


        Collections.shuffle(list);
        nextQuestion (turn);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (im1.getDrawable().toString().contains((mImage_vrs.get(turn-1).getEng_name()))){
                    Toast.makeText(Game1_Easy.this, "Corrects!", Toast.LENGTH_SHORT).show();
                    if (turn<list.size()){
                        turn++;
                        nextQuestion(turn);
                    } else {
                        Toast.makeText(Game1_Easy.this, "Fin!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else {
                    Toast.makeText(Game1_Easy.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    turn++;
                    nextQuestion(turn);
                }

            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (im2.getDrawable().toString().contains((mImage_vrs.get(turn-1).getEng_name()))){
                    Toast.makeText(Game1_Easy.this, "Corrects!", Toast.LENGTH_SHORT).show();
                    if (turn<list.size()){
                        turn++;
                        nextQuestion(turn);
                    } else {
                        Toast.makeText(Game1_Easy.this, "Fin!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else {
                    Toast.makeText(Game1_Easy.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    turn++;
                    nextQuestion(turn);
                }

            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (im3.getDrawable().toString().contains((mImage_vrs.get(turn-1).getEng_name()))){
                    Toast.makeText(Game1_Easy.this, "Corrects!", Toast.LENGTH_SHORT).show();
                    if (turn<list.size()){
                        turn++;
                        nextQuestion(turn);
                    } else {
                        Toast.makeText(Game1_Easy.this, "Fin!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else {
                    Toast.makeText(Game1_Easy.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    turn++;
                    nextQuestion(turn);
                }

            }
        });

        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (im4.getDrawable().toString().contains((mImage_vrs.get(turn-1).getEng_name()))){
                    Toast.makeText(Game1_Easy.this, "Corrects!", Toast.LENGTH_SHORT).show();
                    if (turn<list.size()){
                        turn++;
                        nextQuestion(turn);
                    } else {
                        Toast.makeText(Game1_Easy.this, "Fin!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else {
                    Toast.makeText(Game1_Easy.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    turn++;
                    nextQuestion(turn);
                }

            }
        });

    }

    public void nextQuestion (int number){
            word.setText(list.get(number-1).getName());

    int correct_answer=r.nextInt(4)+1;

    int firstImage = number-1;
    int secondImage, thirdImage, fourthImage;

            switch (correct_answer){
        case 1:

            im1.setImageResource(list.get(firstImage).getImage());

            do {
                secondImage=r.nextInt(list.size());
            } while (secondImage == firstImage);

            do {
                thirdImage = r.nextInt(list.size());
            } while (thirdImage==firstImage || thirdImage==secondImage);

            do {
                fourthImage=r.nextInt(list.size());
            } while (fourthImage==firstImage||fourthImage==secondImage||fourthImage==thirdImage);

            im2.setImageResource(list.get(secondImage).getImage());
            im3.setImageResource(list.get(thirdImage).getImage());
            im4.setImageResource(list.get(fourthImage).getImage());

            break;


        case 2:
            im2.setImageResource(list.get(firstImage).getImage());

            do {
                secondImage=r.nextInt(list.size());
            } while (secondImage == firstImage);

            do {
                thirdImage = r.nextInt(list.size());
            } while (thirdImage==firstImage || thirdImage==secondImage);

            do {
                fourthImage=r.nextInt(list.size());
            } while (fourthImage==firstImage||fourthImage==secondImage||fourthImage==thirdImage);

            im1.setImageResource(list.get(secondImage).getImage());
            im3.setImageResource(list.get(thirdImage).getImage());
            im4.setImageResource(list.get(fourthImage).getImage());

            break;
        case 3:
            im3.setImageResource(list.get(firstImage).getImage());

            do {
                secondImage=r.nextInt(list.size());
            } while (secondImage == firstImage);

            do {
                thirdImage = r.nextInt(list.size());
            } while (thirdImage==firstImage || thirdImage==secondImage);

            do {
                fourthImage=r.nextInt(list.size());
            } while (fourthImage==firstImage||fourthImage==secondImage||fourthImage==thirdImage);

            im2.setImageResource(list.get(secondImage).getImage());
            im1.setImageResource(list.get(thirdImage).getImage());
            im4.setImageResource(list.get(fourthImage).getImage());

            break;
        case 4:
            im4.setImageResource(list.get(firstImage).getImage());

            do {
                secondImage=r.nextInt(list.size());
            } while (secondImage == firstImage);

            do {
                thirdImage = r.nextInt(list.size());
            } while (thirdImage==firstImage || thirdImage==secondImage);

            do {
                fourthImage=r.nextInt(list.size());
            } while (fourthImage==firstImage||fourthImage==secondImage||fourthImage==thirdImage);

            im2.setImageResource(list.get(secondImage).getImage());
            im3.setImageResource(list.get(thirdImage).getImage());
            im1.setImageResource(list.get(fourthImage).getImage());

            break;

    }

}

    public void main_menu(View view) {
        startActivity(new Intent(this, TableOfGames.class));

    }
}
