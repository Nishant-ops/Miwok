package com.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolor;
    WordAdapter(Activity context, ArrayList<Word> Words, int paint)
    {
        super(context,0,Words);
        mcolor=paint;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {


        View listitemGroup=convertView;
        if(listitemGroup==null)
        {
            listitemGroup=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
     Word currentWord=getItem(position);

     TextView t1=(TextView) listitemGroup.findViewById(R.id.miwok_text_view);
     t1.setText(currentWord.getmMiwok_transalation());


     TextView t2=(TextView) listitemGroup.findViewById(R.id.default_text_view);
     t2.setText(currentWord.getmDefault_transalation());

     ImageView I=(ImageView) listitemGroup.findViewById(R.id.image_view);

     if(currentWord.hasimage())
     I.setImageResource(currentWord.getImageresourceID());
     else
         I.setVisibility(View.GONE);

     View color=listitemGroup.findViewById(R.id.text);
     int c= ContextCompat.getColor(getContext(),mcolor);
     color.setBackgroundColor(c);
     return listitemGroup;

             }
}


