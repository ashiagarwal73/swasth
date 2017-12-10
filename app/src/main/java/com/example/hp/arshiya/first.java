package com.example.hp.arshiya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
            final Thread myThread = new Thread()
            {
                @Override
                public void run()
                {

                    try
                    { sleep(4000);
                        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }

                }
            };
            myThread.start();





        }
    }

