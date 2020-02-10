package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;

import java.util.TimerTask;

import static com.example.myapplication.MainActivity.cocheAzul;
import static com.example.myapplication.MainActivity.gameOver;
import static com.example.myapplication.MainActivity.piloto;
import static com.example.myapplication.MainActivity.timer;

public class Colisiones extends TimerTask {

    @Override
    public void run() {
        colisionCocheAzul(cocheAzul);
    }

    private void colisionCocheAzul(ImageView cocheAzul){
        if((piloto.getY() <= cocheAzul.getY()+112 && piloto.getY() >= cocheAzul.getY()) && ((piloto.getX() >= cocheAzul.getX() && piloto.getX() <= cocheAzul.getX()+51)) ||
                (piloto.getY()+112 <= cocheAzul.getY()+111 && piloto.getY()+112 >= cocheAzul.getY()) && ((piloto.getX() >= cocheAzul.getX() && piloto.getX() <= cocheAzul.getX()+51))){
            gameOver.setVisibility(View.VISIBLE);
            timer.cancel();
        }
    }
}
