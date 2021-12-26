package ru.gb.calculator;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultField;
    TextView operationField;
    TextView numberField;
    Integer operand = null;
    String pastOperation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        resultField = findViewById(R.id.field_calc_result);
        operationField = findViewById(R.id.field_operation);
        numberField = findViewById(R.id.field_numbers);
    }

    public void onNumberClick(View view) {
        Button button = (Button) view;
        numberField.append(button.getText());
        if (pastOperation.equals("=") && operand != null) {
            operand = null;
        }
    }

    public void onOperationClick(View view) {
        Button button = (Button) view;
        String operation = button.getText().toString();
        String number = numberField.getText().toString();
        if (number.length() > 0) {
            try {
                performOperation(Integer.valueOf(number), operation);
            } catch (NumberFormatException ex) {
                numberField.setText("");
            }
        }
        pastOperation = operation;
        operationField.setText(pastOperation);
    }

    private void performOperation(Integer number, String operation) {
        if (operand == null) {
            operand = number;
        } else {
            if (pastOperation.equals("=")) {
                pastOperation = operation;
            }
            switch (pastOperation) {
                case "=":
                    operand = number;
                    break;
                case "/":
                    if (number == 0) {
                        operand = 0;
                    } else {
                        operand /= number;
                    }
                    break;
                case "*":
                    operand *= number;
                    break;
                case "+":
                    operand += number;
                    break;
                case "-":
                    operand -= number;
                    break;
                case "C":
                    numberField.clearComposingText();
                    break;
            }
        }
        resultField.setText(String.valueOf(operand));
        numberField.setText("");
    }
}
