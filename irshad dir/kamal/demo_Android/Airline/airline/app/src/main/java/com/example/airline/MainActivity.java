package com.example.airline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rgAirline;
    RatingBar rabRating;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgAirline=findViewById(R.id.rgAirline);
        rabRating=findViewById(R.id.rabRating);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=rgAirline.getCheckedRadioButtonId();
                RadioButton rb=findViewById(id);
                String airline=rb.getText().toString();

                String rating=String.valueOf(rabRating.getRating());
                
                String msg=" airline "+airline+"\n"+"rating "+rating;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT,msg);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
    }
}
