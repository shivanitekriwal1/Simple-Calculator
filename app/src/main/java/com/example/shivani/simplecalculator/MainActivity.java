package com.example.shivani.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    TextView Result;
    Button btnadd, btnsub, btnmul, btndiv;
    double num1, num2, add, sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.txtnum1);
        secondNumber = (EditText)findViewById(R.id.txtnum2);
        Result = (TextView)findViewById(R.id.txtresult);
        btnadd = (Button)findViewById(R.id.btnadd);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmul = (Button)findViewById(R.id.btnmut);
        btndiv = (Button)findViewById(R.id.btndiv);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                add = num1 + num2;
                Result.setText(Double.toString(add));

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sub = num1 - num2;
                Result.setText(Double.toString(sub));

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                mul = num1 * num2;
                Result.setText(Double.toString(mul));

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                div = num1/num2;
                Result.setText(Double.toString(div));

            }
        });


    }
}
