package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button= findViewById(R.id.butchat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(home.this,chat.class);
                startActivity(intent);

            }
        });
        Button button1=findViewById(R.id.butcal);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,Absent.class);
                startActivity(intent);

            }
        });

        Button button2=findViewById(R.id.butdri);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,driverinformation.class);
                startActivity(intent);


            }
        });

        ImageButton imageButton=findViewById(R.id.profile);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,profileinfo.class);
                startActivity(intent);



            }
        });
    }
}