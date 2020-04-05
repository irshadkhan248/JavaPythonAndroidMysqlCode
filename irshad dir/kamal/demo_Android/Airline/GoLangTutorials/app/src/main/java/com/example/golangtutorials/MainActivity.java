package com.example.golangtutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvChapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvChapters=findViewById(R.id.lvChapters);
        ArrayList<String>chapters=new ArrayList<>();
        chapters.add("C1 INTRODUCTION");
        chapters.add("C2 FUNDAMENTALS");
        chapters.add("C3 INPUT/OUTPUT");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,chapters);
        lvChapters.setAdapter(arrayAdapter);

        lvChapters.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent a=new Intent(MainActivity.this,ChapterActivity.class);
                a.putExtra("position",position);
                startActivity(a);

            }
        });
    }
}
