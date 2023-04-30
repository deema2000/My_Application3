package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText lusername;
    EditText lpassword;
    Button lbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lusername = findViewById(R.id.username);
          lpassword   = findViewById(R.id.pass);
        lbtn = findViewById(R.id.go);


                lbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(lusername.getText().toString().equals("sara") && lpassword.getText().toString().equals("123456")) {
                            Toast.makeText(MainActivity.this, "Logain sucessful", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "LOGAIN Faild", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        Button button = findViewById(R.id.go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,home.class);
                startActivity(intent);
            }
        });

    }


}