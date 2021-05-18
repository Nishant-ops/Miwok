 package com.example.miwok;

import android.media.Image;
import android.widget.ImageView;

public class Word {
    private String mDefault_transalation;
    private String mMiwok_transalation;
    private int imageresourceID=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    private int AudioresourceID;


   public Word(String defaulttransalation,String Miwoktransalation,int id)
   {
       mDefault_transalation=defaulttransalation;
       mMiwok_transalation=Miwoktransalation;
       AudioresourceID=id;
   }

   public Word(String defaulttransalation,String Miwoktransalation,int id,int mid)
   {
       mDefault_transalation=defaulttransalation;
       mMiwok_transalation=Miwoktransalation;
       imageresourceID=id;
       AudioresourceID=mid;
   }

   public String getmDefault_transalation()
   {
       return mDefault_transalation;
   }

   public String getmMiwok_transalation()
   {
       return mMiwok_transalation;
   }

    public int getImageresourceID() {
        return imageresourceID;
    }

    public int getAudioresourceID() {
        return AudioresourceID;
    }

    public boolean hasimage()
    {
        if(imageresourceID==-1)
            return false;
        else
            return true;
    }
}
