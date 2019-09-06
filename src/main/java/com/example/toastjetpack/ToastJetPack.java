package com.example.toastjetpack;

import android.content.Context;
import android.widget.Toast;

public class ToastJetPack {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

}
