package com.diah24.mymobileaplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmenu = findViewById(R.id.buttonmenu);
    }

    public void ButtonMenu(View view) {
        Intent intent = new Intent(this, MenuHomeActivity.class);
        startActivity(intent);
    }
}