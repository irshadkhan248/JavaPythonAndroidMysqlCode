package com.example.merapyraclaci;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etNumber;
Button btnSquare,btnSquareRoot;
TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int o= ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        setRequestedOrientation(o);
        etNumber=findViewById(R.id.etNumber);
        btnSquare=findViewById(R.id.btnsquare);
        btnSquareRoot=findViewById(R.id.btnSquareRoot);
        tvResult=findViewById(R.id.tvResult);

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=etNumber.getText().toString();
                if(s.length()==0){
                    Toast.makeText(MainActivity.this, "num is empty", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double n=Double.parseDouble(s);
                double r=n*n;
                Toast.makeText(MainActivity.this, "Square="+r, Toast.LENGTH_SHORT).show();
                tvResult.setText("Square root="+r);
            }
        });

        btnSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=etNumber.getText().toString();
                if(s.length()==0){
                    Toast.makeText(MainActivity.this, "num is empty", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double n=Double.parseDouble(s);
                double r=Math.sqrt(n);
                Toast.makeText(MainActivity.this, "Square Root="+r, Toast.LENGTH_SHORT).show();
                tvResult.setText("Square root="+r);
            }
        });
    }
}
