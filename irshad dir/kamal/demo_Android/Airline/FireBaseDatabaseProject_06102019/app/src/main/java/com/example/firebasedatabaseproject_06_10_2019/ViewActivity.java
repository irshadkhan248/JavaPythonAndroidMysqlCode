package com.example.firebasedatabaseproject_06_10_2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {
ListView lvData;
ArrayList<Student>s=new ArrayList<>();
ArrayAdapter<Student>ad;
FirebaseDatabase database;
DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        lvData=findViewById(R.id.lvData);
        database=FirebaseDatabase.getInstance();
        myRef=database.getReference("student");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s.clear();
                for(DataSnapshot d:dataSnapshot.getChildren()){
                    Student data=d.getValue(Student.class);
                    s.add(data);
                }
                ad=new ArrayAdapter<Student>(ViewActivity.this,android.R.layout.simple_list_item_1,s);
                lvData.setAdapter(ad);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
