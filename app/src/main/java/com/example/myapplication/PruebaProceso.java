package com.example.myapplication;

import android.widget.TextView;

import java.util.TimerTask;

public class PruebaProceso extends TimerTask {

    private TextView lblpasada;
    private int X = 1100;

    public PruebaProceso(TextView lbl){
        this.lblpasada = lbl;
        lblpasada.setX(X);
    }

    @Override
    public void run() {
        if(X >= -150){
            lblpasada.setX(X-1);
            X-=1;
        }else{
            lblpasada.setX(1100);
            X=1100;
        }
    }
}
