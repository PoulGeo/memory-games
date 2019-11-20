package com.example.memorygames.Survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.memorygames.R;

public class Questions extends AppCompatActivity {

    private Questions_db Survey_Questions = new Questions_db();
    private RatingBar mRatingBar;
    private Button mButton;
    private TextView mQuestion;
    private int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        mRatingBar = findViewById(R.id.ratingBar);
        mButton = findViewById(R.id.sub_btn);
        mQuestion = findViewById(R.id.survey_tv);

        updateQuestion();

    }


    private void updateQuestion() {

        mQuestion.setText(Survey_Questions.getQuestions(number));
        number++;

    }


    public void next_question(View view) {

        Toast.makeText(this, String.valueOf(mRatingBar.getRating()), Toast.LENGTH_SHORT).show();
        updateQuestion();

    }
}
