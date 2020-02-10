package com.example.myapplication;

import android.widget.ImageView;

import java.util.TimerTask;

public class GenerarFondo extends TimerTask {

    private static int ESTAD0 = 0;
    private ImageView fondoUno;

    public GenerarFondo(ImageView fondoUno){
        this.fondoUno = fondoUno;
    }

    @Override
    public void run() {
        if(ESTAD0 == 0){
            fondoUno.setImageResource(R.drawable.fondo_dos);
            ESTAD0 = 1;
        }else if(ESTAD0 == 1){
            fondoUno.setImageResource(R.drawable.fondo_uno);
            ESTAD0 = 0;
        }
    }
}
