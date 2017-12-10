package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class assign_doctor extends AppCompatActivity {
    TextView txtview;
    Button check;
    RadioGroup rg;
    RadioButton choice1;
    RadioButton choice2;
    String[] str={"Dr.Keserwani","Dr. Deepak Chopra","Dr. Vikas Dwivedi","Dr. Abhilek Shrivastav","Dr. Bhavika gidwani"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_doctor);
        txtview=(TextView)findViewById(R.id.txtview);
        rg=findViewById(R.id.radioGroup);
        choice1=findViewById(R.id.choice1);
        choice2=findViewById(R.id.choice2);
        check=findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        choice1=(RadioButton)findViewById(i);
                        if(choice2.isChecked()==true)
                        {
                            Intent intent=new Intent(assign_doctor.this,chat.class);
                            startActivity(intent);
                        }
                        String gen=choice1.getText().toString();*/
                 if(choice1.isChecked()){
                  ListView listView = (ListView) findViewById(R.id.list);
                  listView.setVisibility(View.VISIBLE);
                  ArrayAdapter adapter = new ArrayAdapter(assign_doctor.this, android.R.layout.simple_list_item_1, str);
                  listView.setAdapter(adapter);
                  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                      @Override
                      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                          Intent intent=new Intent(assign_doctor.this,chat.class);
                          startActivity(intent);
                      }
                  });
                 }
                if(choice2.isChecked())
                {
                    Intent intent=new Intent(assign_doctor.this,chat.class);
                    startActivity(intent);
                }


            }
        });
    }
}
