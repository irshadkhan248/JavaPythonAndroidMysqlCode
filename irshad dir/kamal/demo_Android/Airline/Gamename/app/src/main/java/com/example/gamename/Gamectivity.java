package com.example.gamename;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Gamectivity extends AppCompatActivity {
    TextView tvNmae;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamectivity);
        tvNmae=findViewById(R.id.etView);
        sp=getSharedPreferences("myp1",MODE_PRIVATE);
        String n=sp.getString("n","");
        tvNmae.setText("Welcome "+n);
    }
}
