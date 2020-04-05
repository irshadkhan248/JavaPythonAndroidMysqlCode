package com.example.weigthcontroler;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etWeight;
    FloatingActionButton fabDial;
    Button btnShare,btnWhatsApp,btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWeight=findViewById(R.id.etWeight);
        btnShare=findViewById(R.id.btnShare);
        btnEmail=findViewById(R.id.btnEmail);
        btnWhatsApp=findViewById(R.id.btnWhatsApp);
        fabDial=findViewById(R.id.fabDial);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String w=etWeight.getText().toString();
                if(w.length()==0){
                    Toast.makeText(MainActivity.this, "weight is empty", Toast.LENGTH_SHORT).show();
                    etWeight.requestFocus();
                    return;
                }
                Intent a=new Intent(Intent.ACTION_SEND);
                a.setType("text/plain");
                a.putExtra(Intent.EXTRA_TEXT," my weight is "+w);
                startActivity(a);
            }
        });
        btnWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String w=etWeight.getText().toString();
                if(w.length()==0){
                    Snackbar.make(view,"weight is empty",Snackbar.LENGTH_SHORT).show();
                    etWeight.requestFocus();
                    return;
                }
                Intent a=new Intent(Intent.ACTION_SEND);
                a.setType("text/plain");
                a.setPackage("com.whatsapp");
                a.putExtra(Intent.EXTRA_TEXT," my weight is "+w);
                try{
                startActivity(a);}
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "download whatsapp", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String w=etWeight.getText().toString();
                if(w.length()==0){
                    etWeight.setError("invalid weight");
                    etWeight.requestFocus();
                    return;
                }
                Intent a=new Intent(Intent.ACTION_SENDTO);
                a.setData(Uri.parse("mailto:"+"kamalsir@ymail.com"));
                a.putExtra(Intent.EXTRA_TEXT," my weight is "+w);
                a.putExtra(Intent.EXTRA_SUBJECT,"kamal ka msg");
                startActivity(a);
            }
        });
        fabDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:"+"9322272186"));
                startActivity(a);
            }
        });
    }//end of OnCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.m1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (R.id.aboutus==item.getItemId()){
            Toast.makeText(this, "APP by KAMAL Sir ji", Toast.LENGTH_SHORT).show();
        }
        if (R.id.website==item.getItemId()){
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://"+"www.google.com"));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
