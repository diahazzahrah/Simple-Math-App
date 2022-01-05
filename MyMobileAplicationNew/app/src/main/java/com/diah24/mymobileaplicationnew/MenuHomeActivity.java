package com.diah24.mymobileaplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MenuHomeActivity extends AppCompatActivity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);


        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.sound);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();
    }

    public void CalculatorButton(View view) {
        audioBackground.stop();
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }

    public void quiz(View view) {
        audioBackground.stop();
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void TutorialButton(View view) {
        audioBackground.stop();
        Intent intent = new Intent(this, TutorialActivity.class);
        startActivity(intent);
    }
    public void AboutButton(View view) {
        audioBackground.stop();
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}