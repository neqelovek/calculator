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

        Button standardThemeBtn = findViewById(R.id.standard_theme);
        standardThemeBtn.setOnClickListener(this);

        Button redThemeBtn = findViewById(R.id.red_theme);
        redThemeBtn.setOnClickListener(this);


    }

    public static final String STANDARD = "STANDARD";
    public static final String RED = "RED";

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.standard_theme:
                Intent standardThemIntent = new Intent(this, CalculatorActivity.class);
                standardThemIntent.putExtra(STANDARD, STANDARD);
                startActivity(standardThemIntent);
                break;

            case R.id.red_theme:
                Intent redThemIntent = new Intent(this, CalculatorActivity.class);
                redThemIntent.putExtra(RED, RED);
                startActivity(redThemIntent);

        }


    }
}