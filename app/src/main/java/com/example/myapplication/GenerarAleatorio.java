package com.example.myapplication;

import java.util.Random;
import java.util.TimerTask;

public class GenerarAleatorio extends TimerTask {

    private static int aleatorio;

    @Override
    public void run() {
        Random r = new Random();
        aleatorio = r.nextInt(5);
    }

    public static int getAleatorio(){
        return aleatorio;
    }
}
