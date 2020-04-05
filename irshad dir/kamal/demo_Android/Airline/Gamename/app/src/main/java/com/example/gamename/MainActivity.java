package com.example.gamename;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;

    Button btnSave;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        btnSave=findViewById(R.id.btnSave);
        sp=getSharedPreferences("myp1",MODE_PRIVATE);
        String n=sp.getString("n","");
        if (n.length()!=0){
            Intent a=new Intent(MainActivity.this,Gamectivity.class);
            startActivity(a);
            finish();
        }
        else {
            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String n=etName.getText().toString();
                    if(n.length()==0){
                        etName.setError("name is empty");
                        etName.requestFocus();
                        return;
                    }
                    SharedPreferences.Editor editor=sp.edit();
                    editor.putString("n",n);
                    editor.commit();
                    Intent a=new Intent(MainActivity.this,Gamectivity.class);
                    startActivity(a);
                    finish();

                }
            });
        }

    }
}
