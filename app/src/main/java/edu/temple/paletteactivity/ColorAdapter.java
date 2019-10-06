package edu.temple.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;

    String[] choice;

    public ColorAdapter(Context context, String[] choice) {
        this.context = context;
        this.choice = choice;
    }
    @Override
    public int getCount(){
        return choice.length;
    }
    @Override
    public Object getItem(int position){
        return choice[position];
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView instanceof View){
            textView = (TextView) convertView;
        } else {
            textView = new TextView(context);
        }
        textView.setTextSize(23);
        textView.setTextColor(Color.BLACK);
        textView.setText(choice[position]);
        textView.setBackgroundColor(Color.WHITE);
        return textView;
    }
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView view;
        if (convertView instanceof View){
            view = (TextView)convertView;
        } else {
            view = new TextView(context);
        }
        view.setText(choice[position]);
        try {
            view.setBackgroundColor(Color.parseColor(view.getText().toString()));
            view.setTextColor(Color.BLACK);
        }
        catch (Exception e){
            view.setBackgroundColor(Color.WHITE);
            view.setTextColor(Color.BLACK);
        }

        view.setTextSize(50);

        return view;
    }
}
