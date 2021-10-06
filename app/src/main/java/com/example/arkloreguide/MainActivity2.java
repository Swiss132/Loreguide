package com.example.arkloreguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {
        EditText num1TxtBox = findViewById(R.id.editTextNum1);
        EditText num2TxtBox = findViewById(R.id.editTextNum2);
        EditText operaterBox = findViewById(R.id.editTextoperator);

        TextView answer = findViewById(R.id.textViewAnswer);

        String num1String = num1TxtBox.getText().toString();
        int Intnum1 = Integer.parseInt(String.valueOf(num1TxtBox.getText()));

        String operater = operaterBox.getText().toString();

        String num2String = num2TxtBox.getText().toString();
        int Intnum2 = Integer.parseInt(String.valueOf(num1TxtBox.getText()));

        int answerNumber = Intnum1 + Intnum2;

        answer.setText(Integer.toString(answerNumber));

        if (operater.equals("+")) {
            answerNumber = Intnum1 + Intnum2;

        }
        else if (operater.equals("-")) {
            answerNumber = Intnum1 - Intnum2;
        }
    }
}