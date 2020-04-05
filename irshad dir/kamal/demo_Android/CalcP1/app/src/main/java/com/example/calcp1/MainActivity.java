package com.example.calcp1;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.PersistableBundle;
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
    Button btnSquare,btnSquareRoot,btnCube;
    TextView tvResult;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // int o=ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        //setRequestedOrientation(o);
        etNumber=findViewById(R.id.etNumber);
        btnSquare=findViewById(R.id.btnSquare);
        btnSquareRoot=findViewById(R.id.btnSquareRoot);
        btnCube=findViewById(R.id.btnCube);
        tvResult=findViewById(R.id.tvResult);

        tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR){
                    tts.setLanguage(Locale.ENGLISH);
                }
            }
        });


        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumber.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Text Filed cannot be empty! ", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double number=Double.parseDouble(etNumber.getText().toString());
                double square=number*number;
                Toast.makeText(MainActivity.this, "Square of Numer"+number+" is:"+square, Toast.LENGTH_LONG).show();
                tvResult.setText("Square of Numer"+number+" is:"+square);
                tts.speak("Square of Numer"+number+" is:"+square,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        btnSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumber.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Text Filed cannot be empty! ", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double d=Double.parseDouble(etNumber.getText().toString());
                double root=Math.sqrt(d);
                Toast.makeText(MainActivity.this, "Square Root of "+d+" is:"+root, Toast.LENGTH_LONG).show();
                tvResult.setText("Square Root of "+d+" is:"+root);
                tts.speak("Square Root of "+d+" is:"+root,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumber.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Text Filed cannot be empty! ", Toast.LENGTH_SHORT).show();
                    etNumber.requestFocus();
                    return;
                }
                double c=Double.parseDouble(etNumber.getText().toString());
                double cube=c*c*c;
                Toast.makeText(MainActivity.this, "Cube of Number"+c+" is:"+cube, Toast.LENGTH_LONG).show();
                tvResult.setText("Cube of Number"+c+" is:"+cube);
                tts.speak("Cube of Number"+c+" is:"+cube,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("jawaab",tvResult.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        tvResult.setText(savedInstanceState.getString("jawaab"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("tussi ja rahe ho ");
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
        alertDialog.setTitle("Arey kiya hua");
        alertDialog.show();
    }
}
