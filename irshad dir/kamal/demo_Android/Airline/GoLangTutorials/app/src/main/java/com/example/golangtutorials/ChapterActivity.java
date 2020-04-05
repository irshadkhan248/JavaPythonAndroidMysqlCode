package com.example.golangtutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ChapterActivity extends AppCompatActivity {
    TextView tvChapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        tvChapter=findViewById(R.id.tvChapter);
        Intent b=getIntent();
        int position=b.getIntExtra("position",0);
        HashMap<Integer,String>map=new HashMap<>();
        map.put(0,"c1.txt");
        map.put(1,"c2.txt");
        map.put(2,"c3.txt");

        String fn=map.get(position);
        Toast.makeText(this,fn, Toast.LENGTH_SHORT).show();

        StringBuffer sb=new StringBuffer();
        String line="";
        try{
            InputStreamReader isr=new InputStreamReader(getAssets().open(fn));
            BufferedReader br=new BufferedReader(isr);
            while ((line=br.readLine())!=null){
                sb.append(line+"\n");
            }
            tvChapter.setText(sb.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
