package ru.gb.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String keyCounters = "Counters";

    private Counters counters;
    private TextView textCounters;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable(keyCounters, counters);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        counters = (Counters) instanceState.getSerializable(keyCounters);
        setTetCounters();
    }

    private void setTetCounters() {


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        counters = new Counters();
        initView();

    }

    private void initView() {
        textCounters = findViewById(R.id.field_for_numbers);
        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();
        initButtonPlusClickListener();
        initButtonMinusClickListener();
        initButtonPointClickListener();
        initButtonPercentClickListener();
        initButtonEquallyClickListener();
        initButtonCleanClickListener();
        initButtonMultiplyClickListener();
        initButtonToShareClickListener();
        initButtonCleanAllClickListener();
        initButtonMemoryReadClickListener();
        initButtonMemoryMinusClickListener();
        initButtonMemoryPlusClickListener();
        initButtonMemoryCleanClickListener();
        initButton0ClickListener();
        initButton0ClickListener();
    }

    private void initButton1ClickListener() {
        Button first_button = findViewById(R.id.first_button);
        first_button.setOnClickListener(this);
    }

    private void initButton2ClickListener() {
        Button two_button = findViewById(R.id.two_button);
        two_button.setOnClickListener(this);
    }

    private void initButton3ClickListener() {
        Button three_button = findViewById(R.id.three_button);
        three_button.setOnClickListener(this);
    }

    private void initButtonMemoryCleanClickListener() {
        Button memory_clean_button = findViewById(R.id.memory_clean_button);
        memory_clean_button.setOnClickListener(this);
    }


    private void initButtonMemoryPlusClickListener() {
        Button memory_plus_button = findViewById(R.id.memory_plus_button);
        memory_plus_button.setOnClickListener(this);
    }


    private void initButtonMemoryMinusClickListener() {
        Button memory_minus_button = findViewById(R.id.memory_minus_button);
        memory_minus_button.setOnClickListener(this);
    }


    private void initButtonMemoryReadClickListener() {
        Button memory_read_button = findViewById(R.id.memory_read_button);
        memory_read_button.setOnClickListener(this);
    }


    private void initButtonCleanAllClickListener() {
        Button clean_all_button = findViewById(R.id.clean_all_button);
        clean_all_button.setOnClickListener(this);
    }


    private void initButtonToShareClickListener() {
        Button to_share_button = findViewById(R.id.to_share_button);
        to_share_button.setOnClickListener(this);
    }


    private void initButtonMultiplyClickListener() {
        Button multiply_button = findViewById(R.id.multiply_button);
        multiply_button.setOnClickListener(this);
    }


    private void initButtonCleanClickListener() {
        Button clean_button = findViewById(R.id.clean_button);
        clean_button.setOnClickListener(this);
    }


    private void initButtonEquallyClickListener() {
        Button equally_button = findViewById(R.id.equally_button);
        equally_button.setOnClickListener(this);
    }


    private void initButtonPercentClickListener() {
        Button percent_button = findViewById(R.id.percent_button);
        percent_button.setOnClickListener(this);
    }

    private void initButtonPointClickListener() {
        Button point_button = findViewById(R.id.point_button);
        point_button.setOnClickListener(this);
    }


    private void initButtonPlusClickListener() {
        Button plus_button = findViewById(R.id.plus_button);
        plus_button.setOnClickListener(this);
    }

    private void initButtonMinusClickListener() {
        Button minus_button = findViewById(R.id.minus_button);
        minus_button.setOnClickListener(this);
    }

    private void initButton0ClickListener() {
        Button zero_button = findViewById(R.id.zero_button);
        zero_button.setOnClickListener(this);
    }

    private void initButton9ClickListener() {
        Button nine_button = findViewById(R.id.nine_button);
        nine_button.setOnClickListener(this);
    }

    private void initButton8ClickListener() {
        Button eight_button = findViewById(R.id.eight_button);
        eight_button.setOnClickListener(this);
    }

    private void initButton7ClickListener() {
        Button seven_button = findViewById(R.id.seven_button);
        seven_button.setOnClickListener(this);
    }

    private void initButton6ClickListener() {
        Button six_button = findViewById(R.id.six_button);
        six_button.setOnClickListener(this);
    }

    private void initButton5ClickListener() {
        Button five_button = findViewById(R.id.five_button);
        five_button.setOnClickListener(this);

    }

    private void initButton4ClickListener() {
        Button four_button = findViewById(R.id.four_button);
        four_button.setOnClickListener(this);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.first_button:
                setTextCounter(textCounters, counters.getValue1());
                break;

            case R.id.two_button:
                setTextCounter(textCounters, counters.getValue2())
                ;
                break;
            case R.id.three_button:
                setTextCounter(textCounters, counters.getValue3());
                break;
            case R.id.four_button:

                setTextCounter(textCounters, counters.getValue4());
                break;
            case R.id.five_button:
                setTextCounter(textCounters, counters.getValue5());
                break;
            case R.id.six_button:
                setTextCounter(textCounters, counters.getValue6());
                break;
            case R.id.seven_button:
                setTextCounter(textCounters, counters.getValue7());
                break;
            case R.id.eight_button:
                setTextCounter(textCounters, counters.getValue8());
                break;
            case R.id.nine_button:
                setTextCounter(textCounters, counters.getValue9());
                break;
            case R.id.zero_button:
                setTextCounter(textCounters, counters.getValue0());
                break;
            case R.id.plus_button:
                textCounters.setText(String.valueOf(counters.getValuePlus()));
                break;
            case R.id.point_button:
                textCounters.setText(String.valueOf(counters.getValuePoint()));
                break;
            case R.id.minus_button:
                textCounters.setText(String.valueOf(counters.getValueMinus()));
                break;
            case R.id.multiply_button:
                textCounters.setText(String.valueOf(counters.getValueMultiply()));
                break;
            case R.id.equally_button:
                textCounters.setText(String.valueOf(counters.getValueEqually()));
                break;
            case R.id.to_share_button:
                textCounters.setText(String.valueOf(counters.getValueShare()));
                break;

        }

    }

    private void setTextCounter(TextView textCounters, int counter) {

        textCounters.setText(String.format(Locale.getDefault(), "%d", counter));
    }
}


//  case R.id.to_share_button:
//          setTextCounter(textCounters, counters.getValueShare());
//          break;
//          case R.id.percent_button:
//          setTextCounter(textCounters, counters.getValuePercent());
//          break;
//          case R.id.plus_button:
//          setTextCounter(textCounters, counters.getValuePlus());
//          break;
//          case R.id.point_button:
//          setTextCounter(textCounters, counters.getValuePoint());
//          break;
//          case R.id.minus_button:
//          setTextCounter(textCounters, counters.getValueMinus());
//          break;
//          case R.id.multiply_button:
//          setTextCounter(textCounters, counters.getValueMultiply());
//          break;
//          case R.id.equally_button:
//          setTextCounter(textCounters, counters.getValueEqually());
//          break;
//          case R.id.memory_plus_button:
//          setTextCounter(textCounters, Integer.parseInt(counters.getValueMemoryMinus()));
//          break;
//          case R.id.memory_clean_button:
//          setTextCounter(textCounters, Integer.parseInt(counters.getValueMemoryClean()));
//          break;
//          case R.id.memory_minus_button:
//          setTextCounter(textCounters, Integer.parseInt(counters.getValueMemoryMinus()));
//          break;
//          case R.id.memory_read_button:
//          setTextCounter(textCounters, Integer.parseInt(counters.getValueMemoryRead()));
//          break;
//          case R.id.clean_all_button:
//          setTextCounter(textCounters, Integer.parseInt(counters.getValueCleanAll()));
//          break;
//          case R.id.clean_button:
//          setTextCounter(textCounters, counters.getValueClean());
//          break;
