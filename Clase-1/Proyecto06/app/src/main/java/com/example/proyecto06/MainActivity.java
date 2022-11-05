package com.example.proyecto06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //refereciamos los elementos para cambiar contenido

    private ImageView imgv1, imgv2, imgv3, imgv4, imgv5, imgv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casteamos los elementos

        imgv1 = findViewById(R.id.imgv1);
        imgv2 = findViewById(R.id.imgv2);
        imgv3 = findViewById(R.id.imgv3);
        imgv4 = findViewById(R.id.imgv4);
        imgv5 = findViewById(R.id.imgv5);
        imgv6 = findViewById(R.id.imgv6);

    }

    public void tirar (View v){

        //cambiamos la img segun valor aleatorio entre 1 y 6, como vamos a mostrar 6 dados generamos 6 valores
        int valor1 = 1+(int)(Math.random()*6);
        int valor2 = 1+(int)(Math.random()*6);
        int valor3 = 1+(int)(Math.random()*6);
        int valor4 = 1+(int)(Math.random()*6);
        int valor5 = 1+(int)(Math.random()*6);
        int valor6 = 1+(int)(Math.random()*6);


        //usamos un Swich para ir cambiando aleatoriamente la img

        switch (valor1) {
            case 1: imgv1.setImageResource(R.drawable.d1);break;
            case 2: imgv1.setImageResource(R.drawable.d2);break;
            case 3: imgv1.setImageResource(R.drawable.d3);break;
            case 4: imgv1.setImageResource(R.drawable.d4);break;
            case 5: imgv1.setImageResource(R.drawable.d5);break;
            case 6: imgv1.setImageResource(R.drawable.d6);break;

        }
        switch (valor2) {
            case 1: imgv2.setImageResource(R.drawable.d1);break;
            case 2: imgv2.setImageResource(R.drawable.d2);break;
            case 3: imgv2.setImageResource(R.drawable.d3);break;
            case 4: imgv2.setImageResource(R.drawable.d4);break;
            case 5: imgv2.setImageResource(R.drawable.d5);break;
            case 6: imgv2.setImageResource(R.drawable.d6);break;
        }

        switch (valor3) {
            case 1: imgv3.setImageResource(R.drawable.d1);break;
            case 2: imgv3.setImageResource(R.drawable.d2);break;
            case 3: imgv3.setImageResource(R.drawable.d3);break;
            case 4: imgv3.setImageResource(R.drawable.d4);break;
            case 5: imgv3.setImageResource(R.drawable.d5);break;
            case 6: imgv3.setImageResource(R.drawable.d6);break;
        }

        switch (valor4) {
            case 1: imgv4.setImageResource(R.drawable.d1);break;
            case 2: imgv4.setImageResource(R.drawable.d2);break;
            case 3: imgv4.setImageResource(R.drawable.d3);break;
            case 4: imgv4.setImageResource(R.drawable.d4);break;
            case 5: imgv4.setImageResource(R.drawable.d5);break;
            case 6: imgv4.setImageResource(R.drawable.d6);break;
        }

        switch (valor5) {
            case 1: imgv5.setImageResource(R.drawable.d1);break;
            case 2: imgv5.setImageResource(R.drawable.d2);break;
            case 3: imgv5.setImageResource(R.drawable.d3);break;
            case 4: imgv5.setImageResource(R.drawable.d4);break;
            case 5: imgv5.setImageResource(R.drawable.d5);break;
            case 6: imgv5.setImageResource(R.drawable.d6);break;
        }

        switch (valor6) {
            case 1: imgv6.setImageResource(R.drawable.d1);break;
            case 2: imgv6.setImageResource(R.drawable.d2);break;
            case 3: imgv6.setImageResource(R.drawable.d3);break;
            case 4: imgv6.setImageResource(R.drawable.d4);break;
            case 5: imgv6.setImageResource(R.drawable.d5);break;
            case 6: imgv6.setImageResource(R.drawable.d6);break;
        }
    }
}