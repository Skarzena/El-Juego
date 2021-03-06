package com.example.myapplication;

import android.widget.ImageView;

import java.util.TimerTask;

public class MoverCocheMorado extends TimerTask {

    private ImageView imgPasada;
    private int Y = -500;
    private boolean generado = false;

    public MoverCocheMorado(ImageView imgPasada){
        this.imgPasada = imgPasada;
        imgPasada.setY(Y);
    }

    @Override
    public void run() {
        if(generado == false && GenerarAleatorio.getAleatorio() == 3){
            generado = true;
        }
        if(Y < 2000 && generado == true){
            imgPasada.setY(Y);
            Y+=5;
        }else if(Y >= 2000 && generado == true){
            generado = false;
            imgPasada.setY(-500);
            Y = -500;
        }
    }
}
