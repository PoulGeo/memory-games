package com.example.memorygames.easy_level.Game3;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.memorygames.R;
import com.example.memorygames.SignUp;
import com.example.memorygames.Sounds.SoundPlayer;
import com.example.memorygames.easy_level.Table_Easy;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class G_e_3_1 extends AppCompatActivity {

    private static String key;
    private static DatabaseReference db, db1;
    public static long startTime;

    ImageButton inst_g3, audio01, audio02, user, help, close;
    public SoundPlayer sound;
    TextView ch01, ch02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_e_3_1);

        inst_g3 = findViewById(R.id.tv_instructions);
        audio01 = findViewById(R.id.act_choice_1);
        audio02 = findViewById(R.id.act_choice_2);
        ch01 = findViewById(R.id.choice01);
        ch02 =findViewById(R.id.choice02);

        sound = new SoundPlayer(this);

        user = findViewById(R.id.user);
        help = findViewById(R.id.help);
        close = findViewById(R.id.close);

        startTime = System.currentTimeMillis();
        key=SignUp.k;
        db = FirebaseDatabase.getInstance().getReference("MemoryGames0");
        db1 = db.child(key).child("LevelEasy").child("game_3");
        db1.child("startTime: ").setValue(startTime);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_3_1.this, SignUp.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_3_1.this, SignUp.class));
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(G_e_3_1.this, Table_Easy.class));
            }
        });

    }

    //next activity!!!!!!!!!!

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void right_ans(View view) {
        ch01.setBackgroundColor(this.getColor(R.color.colorPrimary));
        startActivity(new Intent(this, G_e_3_2.class));
        sound.playHitSound();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void wrong_ans(View view) {
        ch02.setBackgroundColor(this.getColor(R.color.colorAccent));
        sound.playOverSound();
    }

    public void playWatching_tv(View view) {
        sound.playWatching_TV();
    }

    public void playWashing_Clothes(View view) {
        sound.playWashing_Clothes();
    }

    public void playWhat_Activity(View view) {
        sound.playWhat_Activity();
    }
}
