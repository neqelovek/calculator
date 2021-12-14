package ru.gb.calculator;
//Start
//1. С этого урока будем писать приложение «Калькулятор».
// Выберите макет для работы с калькулятором.
// Обоснуйте, почему будете использовать именно этот тип макета.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        setContentView(R.layout.frame);

        setContentView(R.layout.linear_layout);
    }
}