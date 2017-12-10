package com.example.hp.arshiya;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by ashi on 25/11/17.
 */

class MyAsync extends AsyncTask <String,Void,Void>{
    Context context;
    String name;
    //String url="http://10.0.2.2/insertdata.php?name=";
    MyAsync(Context context)
    {
        this.context=context;

    }
    @Override
    protected Void doInBackground(String... strings) {
        String final_url= strings[0];
        try {
            URL preurl = new URL(final_url);
            HttpURLConnection con = (HttpURLConnection)preurl.openConnection();
            con.setRequestMethod("GET");
            int response = con.getResponseCode();
            if (response==200)
            {
                System.out.println("Data Loaded Successfully");
            }
        }catch (Exception ex
                )
        {
            Log.i("Exceptiion", ex.toString());
        }
        return null;
    }
}
