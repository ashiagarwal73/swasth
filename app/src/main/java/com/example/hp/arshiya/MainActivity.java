package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtview1;
    Button btn1;
    TextView txtview2;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtview1=(TextView)findViewById(R.id.txtview1);
        btn1=(Button)findViewById(R.id.btn1);
        txtview2=(TextView)findViewById(R.id.txtview2);
        btn2=(Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener( ){
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,patient_detailss.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener( ){
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(MainActivity.this,. class);
                Intent intent = new Intent(MainActivity.this,Signup.class);
                startActivity(intent);
            }
        });
    }
}