package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.math.*;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnc;
    Button btnsumar, btnrestar, btnpor, btndivide, btnequal, btnpow;
    EditText et1;
    float res1,res2;
    boolean add,sub,mult,div,pow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btndot=(Button)findViewById(R.id.btndot);
        btnc=(Button)findViewById(R.id.btnclean);
        btnsumar=(Button)findViewById(R.id.btnmas);
        btnrestar=(Button)findViewById(R.id.btnresta);
        btnpor=(Button)findViewById(R.id.btnpor);
        btndivide=(Button)findViewById(R.id.btndivide);
        btnequal=(Button)findViewById(R.id.btnequal);
        btnpow=(Button)findViewById(R.id.btnpow);
        et1=(EditText)findViewById(R.id.editTextTextPersonName);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+".");
            }
        });

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1==null){
                    et1.setText("");
                }
                else{
                    res1=Float.parseFloat(et1.getText()+"");
                    add=true;
                    et1.setText(null);
                }
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1==null){
                    et1.setText("");
                }
                else{
                    res1=Float.parseFloat(et1.getText()+"");
                    sub=true;
                    et1.setText(null);
                }
            }
        });

        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1==null){
                    et1.setText("");
                }
                else{
                    res1=Float.parseFloat(et1.getText()+"");
                    mult=true;
                    et1.setText(null);
                }
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1==null){
                    et1.setText("");
                }
                else{
                    res1=Float.parseFloat(et1.getText()+"");
                    div=true;
                    et1.setText(null);
                }
            }
        });

        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1==null){
                    et1.setText("");
                }
                else{
                    res1=Float.parseFloat(et1.getText()+"");
                    pow=true;
                    et1.setText(null);
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(et1.getText()+"");
                if(add == true){
                    et1.setText(res1+res2+"");
                    add=false;
                }
                if(sub == true){
                    et1.setText(res1-res2+"");
                    sub=false;
                }
                if(mult == true){
                    et1.setText(res1*res2+"");
                    mult=false;
                }
                if(div == true){
                    if(res2!=0){
                        et1.setText(res1/res2+"");
                    }
                    else et1.setText("undefined");

                    div=false;
                }
                if(pow == true){
                    et1.setText(Math.pow(res1,res2)+"");
                    pow=false;
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
            }
        });
    }
}