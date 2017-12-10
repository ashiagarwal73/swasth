package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class disease_select extends AppCompatActivity {
    String[] doctors={"Heart Health","Kidney Health","Mental Health","Liver Health","Bone Health"};
    int[] images={R.drawable.heartproblem,R.drawable.kidney,R.drawable.brain,R.drawable.liverhealth,R.drawable.bone};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_select);
        listView=(ListView) findViewById(R.id.type_of_doctors);
                CustomAdapter customAdapter=new CustomAdapter(this,doctors,images);
                listView.setAdapter(customAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(disease_select.this,assign_doctor.class);
                        startActivity(intent);
            }
        });
    }
}
