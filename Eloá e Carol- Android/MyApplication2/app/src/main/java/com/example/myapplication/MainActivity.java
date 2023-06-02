package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Double num = Double.parseDouble(String.valueOf(txt.getText()));
        Double num1 = Double.parseDouble(String.valueOf(txt1.getText()));

        btn.setOnClickListener(v -> {
            Double resultado = num + num1;
                result.setText(String.valueOf(resultado));
        });

        btn1.setOnClickListener(m -> {
            Double resultado= num*num1;
            result.setText(String.valueOf(resultado));
        });

        btn2.setOnClickListener(d -> {
            Double resultado = num / num1;
            result.setText(String.valueOf(resultado));
        });

        btn3.setOnClickListener(s -> {
            Double resultado= num-num1;
            result.setText(String.valueOf(resultado));
        });



    }
    final Button btn=(Button)findViewById(R.id.btnsoma);
    final Button btn1=(Button)findViewById(R.id.btnmulti);
    final Button btn2=(Button)findViewById(R.id.btndiv1);
    final Button btn3=(Button)findViewById(R.id.btnsub);
    final EditText txt=(EditText)findViewById(R.id.num);
    final EditText txt1 =(EditText)findViewById(R.id.num1);
    final TextView result=(TextView)findViewById(R.id.resultado);






}
