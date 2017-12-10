package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
public class patient_detailss extends AppCompatActivity {


    TextView t1, t2, t3, t4, t5, t6, t7, t8,warn;
    EditText e1, e2,e3, e4, e5;
    RadioGroup rad;
    Button b1, b2;
    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_detailss);

        t1= (TextView)findViewById(R.id.t1);
        t2= (TextView)findViewById(R.id.t2);
        t3= (TextView)findViewById(R.id.name);
        t4= (TextView)findViewById(R.id.age);
        t5= (TextView)findViewById(R.id.gender);
        t6= (TextView)findViewById(R.id.add);
        t7= (TextView)findViewById(R.id.no);
        t8= (TextView)findViewById(R.id.warn);
        e1= (EditText)findViewById(R.id.e1);
        e2= (EditText)findViewById(R.id.e2);
        e3= (EditText)findViewById(R.id.e3);
        e4= (EditText)findViewById(R.id.e4);
        e5= (EditText)findViewById(R.id.e5);
        b1= (Button)findViewById(R.id.search);
        b2= (Button)findViewById(R.id.submit);
        warn=findViewById(R.id.warn);
        rad= (RadioGroup)findViewById(R.id.radioGroup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Aadhar_No =e1.getText().toString();
                if(Aadhar_No.equals("")) {
                    Toast.makeText(patient_detailss.this, "Enter Aadhar Number" + Aadhar_No, Toast.LENGTH_SHORT).show();
                }
                MyAsync my = new MyAsync(getBaseContext());
                my.execute("http://10.0.2.2/Aadhar.php?name="+Aadhar_No);
                warn.setVisibility(View.VISIBLE);
                warn.setText("No such patient exist,Please register!");
                //Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
                //Intent intent= new Intent(this,. class);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Aadhar_No =e1.getText().toString();
                //Toast.makeText(patient_detailss.this, Aadhar_No+"", Toast.LENGTH_SHORT).show();
                String name= e2.getText().toString();
                //MyAsync my = new MyAsync(getBaseContext());
                //my.execute("//10.0.2.2/name.php?name=name");
                String age= e3.getText().toString();

                //my.execute("//10.0.2.2/age.php?name=age");
                String address= e5.getText().toString();
                //my.execute("//10.0.2.2/address.php?name=address");
                String phone_no= e4.getText().toString();
                //MyAsync my1 = new MyAsync(getBaseContext());
                //my1.execute("http://10.0.2.2/phone.php?name="+phone_no);
                // my.execute("http://10.0.2.2/phone.php?name="+phone_no);//implement like this
                rad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        r1=(RadioButton)findViewById(i);
                        String gen=r1.getText().toString();
                        //MyAsync my1 = new MyAsync(getBaseContext());
                       // my1.execute("http://10.0.2.2/gender.php?name="+gen);

                    }
                });

                //Toast.makeText(MainActivity.this, "u clicked me", Toast.LENGTH_SHORT).show();
                if(name.equals("")||age.equals("")||address.equals(""))
                {
                    Toast.makeText(patient_detailss.this, "Complete all Details please", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(patient_detailss.this, disease_select.class);
                    startActivity(i);
                }
            }
        });
    }
}
