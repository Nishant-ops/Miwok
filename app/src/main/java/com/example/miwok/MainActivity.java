package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void OpenNumberList(View view)
    {
        Intent i=new Intent(this,NumberActivity.class);
        startActivity(i);
    }
    public void OpenFamilyList(View view)
    {
        Intent i=new Intent(this,FamilyActivity.class);
        startActivity(i);
    }
    public void OpenPharseList(View view)
    {
        Intent i=new Intent(this,PharseActivity.class);
        startActivity(i);
    }
    public void OpenColorList(View view)
    {
        Intent i=new Intent(this,ColorActivity.class);
        startActivity(i);
    }
}