package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Doctor_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8;
        EditText editText1, editText2, editText3, editText4, editText5, editText6;
        RadioButton btn1, btn2;
        Button btn;
        setContentView(R.layout.activity_doctor_details);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView4);
        textView3 = (TextView) findViewById(R.id.textView2);
        textView4 = (TextView) findViewById(R.id.textView6);
        textView5 = (TextView) findViewById(R.id.textView8);
        textView6 = (TextView) findViewById(R.id.textView9);
        textView7 = (TextView) findViewById(R.id.textView10);
        textView8 = (TextView) findViewById(R.id.textView11);
        editText1 = (EditText) findViewById(R.id.editText2);
        editText2 = (EditText) findViewById(R.id.editText4);
        editText3 = (EditText) findViewById(R.id.editText1);
        editText4 = (EditText) findViewById(R.id.editText3);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        final String e1,e2,e3,e4,e5,e6;
        e1=editText1.getText().toString();
        e2=editText2.getText().toString();
        e3=editText3.getText().toString();
        e4=editText4.getText().toString();
        e5=editText5.getText().toString();
        btn = (Button) findViewById(R.id.button);
        btn1 = (RadioButton) findViewById(R.id.btn1);
        btn2 = (RadioButton) findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
        public void onClick(View view)
        {
        Intent i = new Intent(Doctor_details.this, Appoint.class);
        startActivity(i);

    }
});
    }
}



