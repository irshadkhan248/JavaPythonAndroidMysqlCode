package com.example.callrequestpermission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber = findViewById(R.id.etNumber);
        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = etNumber.getText().toString();

                if (etNumber.length() != 10) {
                    etNumber.setError("invalid number");
                    etNumber.setText("");
                    etNumber.requestFocus();
                    return;
                }
                int res = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
                if (res == PackageManager.PERMISSION_GRANTED) {
                    Intent p = new Intent(Intent.ACTION_CALL);
                    p.setData(Uri.parse("tel:" + phone));
                    startActivity(p);
                } else {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 123);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if ((requestCode == 123) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
            String phone = etNumber.getText().toString();

            if (etNumber.length() != 10) {
                etNumber.setError("invalid number");
                etNumber.setText("");
                etNumber.requestFocus();
                return;
            }
            int res = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
            if (res == PackageManager.PERMISSION_GRANTED) {
                Intent p = new Intent(Intent.ACTION_CALL);
                p.setData(Uri.parse("tel:" + phone));
                startActivity(p);
            }
        }
    }
}
