package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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

        Button button = findViewById(R.id.go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = lusername.getText().toString();//stud1@test.com
                String p = lpassword.getText().toString();//123123
                FirebaseAuth.getInstance().signInWithEmailAndPassword(u,p)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    Intent intent=new Intent(MainActivity.this,home.class);
                                    startActivity(intent);

                                }
                                else{
                                    Toast.makeText(MainActivity.this, "LOGIN ailed", Toast.LENGTH_SHORT).show();
                                    Log.e("SGN","Login Failed");
                                }
                            }
                        });
               /* if(lusername.getText().toString().equals("sara") && lpassword.getText().toString().equals("123456")) {
                    Intent intent=new Intent(MainActivity.this,home.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "LOGIN Success", Toast.LENGTH_SHORT).show();
                                    Log.e("SGN","Login Success");
                } else {
                    Toast.makeText(MainActivity.this, "LOGAIN Faild", Toast.LENGTH_SHORT).show();
                }*/

            }
        });

    }


}