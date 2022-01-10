package ru.gb.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoosingThemeActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button standardThemeBtn = findViewById(R.id.standard_theme_btn);
        standardThemeBtn.setOnClickListener(this);

        Button redThemeBtn = findViewById(R.id.red_theme_btn);
        redThemeBtn.setOnClickListener(this);

        Button blackThemeBtn = findViewById(R.id.black_theme_btn);
        blackThemeBtn.setOnClickListener(this);


    }

    public static final String STANDARD = "STANDARD";
    public static final String RED = "RED";
    public static final String BLACK = "BLACK";

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.standard_theme_btn:
                Intent standardThemIntent = new Intent(this, CalculatorActivity.class);
                standardThemIntent.putExtra(STANDARD, STANDARD);
                startActivity(standardThemIntent);
                break;

            case R.id.red_theme_btn:
                Intent redThemIntent = new Intent(this, CalculatorActivity.class);
                redThemIntent.putExtra(RED, RED);
                startActivity(redThemIntent);
                break;

            case R.id.black_theme_btn:
                Intent blackThemeIntent = new Intent(this,CalculatorActivity.class);
                blackThemeIntent.putExtra(BLACK,BLACK);
                startActivity(blackThemeIntent);
        }


    }
}