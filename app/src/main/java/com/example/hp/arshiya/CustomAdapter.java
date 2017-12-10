package com.example.hp.arshiya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ashi on 24-11-2017.
 */

public class CustomAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    String[] names;
    TextView textView;
    int[] images;
    ImageView imageView;
    public CustomAdapter(Context context, String[] names,int[] images)
    {
        this.context=context;
        this.images=images;
        this.names=names;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return names.length;
    }
    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        convertview=layoutInflater.inflate(R.layout.doctors,null);
        textView=convertview.findViewById(R.id.doctors_name);
        textView.setText(names[i]);
        imageView=convertview.findViewById(R.id.image);
        imageView.setImageResource(images[i]);
        return convertview;
    }
}
