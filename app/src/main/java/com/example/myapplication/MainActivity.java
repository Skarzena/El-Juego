package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    public static Timer timer = new Timer();
    private TextView lblSaludo;
    public static ImageView piloto ,cocheAzul, cocheVerde, cocheNaranja, cocheMorado, fondoUno;
    public static TextView gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
        procesos();
    }

    void procesos(){
        cocheAzul = findViewById(R.id.coche_azul);
        cocheVerde = findViewById(R.id.coche_verde);
        cocheNaranja = findViewById(R.id.coche_naranja);
        cocheMorado = findViewById(R.id.coche_morado);
        fondoUno = findViewById(R.id.fondo_uno);
        gameOver = findViewById(R.id.game_over);

        MoverCocheAzul moverCocheAzul = new MoverCocheAzul(cocheAzul);
        MoverCocheVerde moverCocheVerde = new MoverCocheVerde(cocheVerde);
        MoverCocheNaranja moverCocheNaranja = new MoverCocheNaranja(cocheNaranja);
        MoverCocheMorado moverCocheMorado = new MoverCocheMorado(cocheMorado);

        timer.schedule(moverCocheAzul, 0,12);
        timer.schedule(moverCocheVerde,0,8);
        timer.schedule(moverCocheNaranja,0,20);
        timer.schedule(moverCocheMorado,0,15);
        timer.schedule(new GenerarAleatorio(), 1000,1000);

        GenerarFondo generarFondo = new GenerarFondo(fondoUno);

        timer.schedule(new Colisiones(),1,1);
    }

    void initButtons(){

        piloto = findViewById(R.id.piloto);

        final Button btnDerechaDos = findViewById(R.id.btn_derecha_dos);

        btnDerechaDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(piloto.getX() <= 900){
                    piloto.setX(piloto.getX()+50);
                }

            }
        });

        final Button btnIzquierdaDos = findViewById(R.id.btn_izquierda_dos);
        btnIzquierdaDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(piloto.getX() >= 50) {
                    piloto.setX(piloto.getX() - 50);
                }
            }
        });

    }


}
