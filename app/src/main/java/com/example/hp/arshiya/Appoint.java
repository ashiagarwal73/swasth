package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Appoint extends AppCompatActivity {
    ListView listView;
    String[] str={"Mr.Raj yadav","Miss Vrinda Goyal","Mr. Rahul Gupta","Miss Ruhani Gautam"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoint);
        listView=findViewById(R.id.list);
        ArrayAdapter aa=new ArrayAdapter(Appoint.this, android.R.layout.simple_list_item_1,str);
        listView.setAdapter(aa);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in=new Intent(Appoint.this,chat.class);
                startActivity(in);
            }
        });
    }
}
