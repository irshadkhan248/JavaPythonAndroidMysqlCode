package com.example.pizzaorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner  spnSize;
CheckBox cbCorn,cbTomato,cbCheese,cbOnion;
Button btnOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnSize=findViewById(R.id.spnSize);
        cbCorn=findViewById(R.id.cbCorn);
        cbCheese=findViewById(R.id.cbCheese);
        cbOnion=findViewById(R.id.cbOnion);
        cbTomato=findViewById(R.id.cbTomato);
        btnOrder=findViewById(R.id.btnOrder);

        final ArrayList<String>size=new ArrayList<>();
        size.add("Small");
        size.add("Medium");
        size.add("Large");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,size);

        spnSize.setAdapter(arrayAdapter);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=spnSize.getSelectedItemPosition();
                String s=size.get(id);
                String t="";
                if(cbCorn.isChecked() )t=t+"Corn";
                if(cbOnion.isChecked() )t=t+" Onion";
                if(cbCheese.isChecked() )t=t+"Cheese";
                if(cbTomato.isChecked() )t=t+"Tomato";
                String msg="Size "+s+"\n"+"top "+t;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT,msg);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
    }
}
