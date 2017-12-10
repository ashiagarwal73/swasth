package com.example.hp.arshiya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chat extends AppCompatActivity {
    ListView listView;
    String[] str={"hi","how are you?"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        listView=findViewById(R.id.chatlist);
        ArrayAdapter adapter = new ArrayAdapter(chat.this, android.R.layout.simple_list_item_1, str);
        listView.setAdapter(adapter);
    }
}
