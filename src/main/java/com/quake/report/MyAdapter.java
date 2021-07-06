package com.quake.report;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    public MyAdapter(Context context, int resource, ArrayList<ListItem>list) {
        super(context,resource, list);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListItem obj=(ListItem)getItem(position);
        View LIW=convertView;
        if(LIW==null)
            LIW= LayoutInflater.from(getContext()).inflate(R.layout.design,parent,false);
        TextView magnitude=(TextView)LIW.findViewById(R.id.mag);

        GradientDrawable magnitudeCircle = (GradientDrawable)magnitude.getBackground();

        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(Double.parseDouble(obj.getMag()));

        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);



        TextView loc1=(TextView)LIW.findViewById(R.id.loc1);
        TextView loc2=(TextView)LIW.findViewById(R.id.loc2);
        TextView date=(TextView)LIW.findViewById(R.id.date);
        TextView time=(TextView)LIW.findViewById(R.id.t);
        magnitude.setText(obj.getMag());
        loc1.setText(obj.getLoc1());
        loc2.setText(obj.getLoc2());
        date.setText(obj.getDate());
        time.setText(obj.getTime());
        return  LIW;
    }
    int getMagnitudeColor(double magnitude)
    {
        int cid;
        if(magnitude>0.0&&magnitude<=1.0)
            cid=R.color.magnitude1;
        else if(magnitude>1&&magnitude<=2)
            cid=R.color.magnitude2;
        else if(magnitude>2&&magnitude<=3)
            cid=R.color.magnitude2;
        else if(magnitude>3&&magnitude<=4)
            cid=R.color.magnitude3;
        else if(magnitude>4&&magnitude<=5)
            cid=R.color.magnitude4;
        else if(magnitude>5&&magnitude<=6)
            cid=R.color.magnitude5;
        else if(magnitude>6&&magnitude<=7)
            cid= R.color.magnitude6;
        else if(magnitude>7&&magnitude<=8)
            cid= R.color.magnitude7;
        else if(magnitude>8&&magnitude<=9)
            cid= R.color.magnitude8;
        else 
            cid=R.color.magnitude9;
        return ContextCompat.getColor(getContext(),cid);


    }

}
