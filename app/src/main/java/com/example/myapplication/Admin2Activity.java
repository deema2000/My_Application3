package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin2Activity extends AppCompatActivity {

    EditText lusername2;
    EditText lpassword2;
    Button lbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_2);


        lusername2 = findViewById(R.id.username2);
        lpassword2   = findViewById(R.id.pass2);
        lbtn2 = findViewById(R.id.go2);


        lbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lusername2.getText().toString().equals("sara") && lpassword2.getText().toString().equals("123456")) {
                    Toast.makeText(Admin2Activity.this, "Logain sucessful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Admin2Activity.this, "LOGAIN Faild", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button button = findViewById(R.id.go2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lusername2.getText().toString().equals("sara") && lpassword2.getText().toString().equals("123456")) {
                Intent intent=new Intent(Admin2Activity.this,Admin3Activity.class);
                startActivity(intent); }
                 else {
                        Toast.makeText(Admin2Activity.this, "LOGAIN Faild", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}