package com.example.excal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;
    private Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    private TextView tv;
    private String num1, num2;
    private double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnRem = findViewById(R.id.btnRem);
        tv = findViewById(R.id.tv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1)+Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + Double.toString(result));
                }else{
                    Toast.makeText(MainActivity.this, "계산할 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1)-Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + Double.toString(result));
                }else{
                    Toast.makeText(MainActivity.this, "계산할 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1)*Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + Double.toString(result));
                }else{
                    Toast.makeText(MainActivity.this, "계산할 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1)/Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + Double.toString(result));
                }else{
                    Toast.makeText(MainActivity.this, "계산할 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1)%Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + Double.toString(result));
                }else{
                    Toast.makeText(MainActivity.this, "계산할 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}