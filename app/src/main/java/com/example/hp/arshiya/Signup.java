package com.example.hp.arshiya;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    Button btn,t2;
    TextView t1;
    EditText email, pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btn= (Button)findViewById(R.id.button);
        t1= (TextView)findViewById(R.id.textView);
        t2= (Button) findViewById(R.id.textView2);
        email= (EditText)findViewById(R.id.editText);
        pw= (EditText)findViewById(R.id.editText2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup.this,Doctor_details.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       String email_id = email.getText().toString();
                                       String password = pw.getText().toString();
                                       if(email_id.equals("")||password.equals(""))
                                       {
                                           Toast.makeText(Signup.this, "Please enter all details to LogIN", Toast.LENGTH_SHORT).show();
                                       }
                                       else{
                                       Intent i = new Intent(Signup.this,Appoint.class);
                                       startActivity(i);}
                                   }
                               }
            ); }
    }