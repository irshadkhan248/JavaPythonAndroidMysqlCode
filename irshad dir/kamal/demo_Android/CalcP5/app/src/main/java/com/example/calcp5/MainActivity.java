package com.example.calcp5;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    Button btnSquare, btnSquareroot, btnCube;
    TextView tvResult;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btnSquare = findViewById(R.id.btnSquare);
        btnCube = findViewById(R.id.btnCube);
        tvResult = findViewById(R.id.tvResult);
        btnSquareroot = findViewById(R.id.btnSquareRoot);


        tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR){
                    tts.setLanguage(Locale.ENGLISH);
                }
            }
        });


        //int o= ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        //setRequestedOrientation(o);


        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumber.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "text field connot empty!", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double n = Double.parseDouble(etNumber.getText().toString());

                double res1 = n * n;
                double res = Math.round(res1 * 100D) / 100D;
                Toast.makeText(MainActivity.this, "Square of " + n + " is " + res, Toast.LENGTH_LONG).show();
                tvResult.setText("Square of " + n + " is " + res);
                tts.speak("Square of " + n + " is " + res,TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        btnSquareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumber.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "text field cannot be empty!", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double n = Double.parseDouble(etNumber.getText().toString());
                double res1 = Math.sqrt(n);
                double res = Math.round(res1 * 100D) / 100D;
                Toast.makeText(MainActivity.this, "Square root of " + n + " is " + res, Toast.LENGTH_SHORT).show();
                tvResult.setText("Square root of " + n + " is " + res);
                tts.speak("Square root of " + n + " is " + res,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumber.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "text field connot be empty!", Toast.LENGTH_LONG).show();
                    etNumber.requestFocus();
                    return;
                }
                double n = Double.parseDouble(etNumber.getText().toString());
                double res1 = n * n * n;
                double res = Math.round(res1 * 100D) / 100D;
                Toast.makeText(MainActivity.this, "Cube of " + n + " is " + res, Toast.LENGTH_LONG).show();
                tvResult.setText("Cube of " + n + " is " + res);
                tts.speak("Cube of " + n + " is " + res ,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("jawaab", tvResult.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String a = savedInstanceState.getString("jawaab");
        tvResult.setText(a);
        super.onRestoreInstanceState(savedInstanceState);
    }

    long bpt;

    @Override
    public void onBackPressed() {
       /* if(bpt + 1500 > System.currentTimeMillis()) { //code for click BACK again to exit
            super.onBackPressed();
        }
        else {
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
            bpt = System.currentTimeMillis();
        }*/


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("tussi ja rahe hu ");
        builder.setCancelable(false);
        builder.setPositiveButton("haa", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("nahi ji", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Arey kiya huwa");
        alertDialog.show();

    }
}