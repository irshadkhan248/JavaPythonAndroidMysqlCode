package com.example.mytourch;

import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStart,btnStop;
    boolean isFlaseOn;
    Camera camera;
    Camera.Parameters.params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart=findViewById(R.id.btnstart);
        btnStop=findViewById(R.id.btnstop);

    }
}
