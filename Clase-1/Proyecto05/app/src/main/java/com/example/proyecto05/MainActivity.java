package com.example.proyecto05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch sw1,sw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casteamos los elementos
        sw1 = findViewById(R.id.sw1);
        sw2 = findViewById(R.id.sw2);
    }

    public void datosMoviles(View v){
        if (sw1.isChecked()){
            Toast.makeText(this, "Datos Moviles Activados", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Datos Moviles Desactivados", Toast.LENGTH_SHORT).show();
        }
    }

    public void wifi(View v){
        if(sw2.isChecked()){
            Toast.makeText(this, "Wifi Activado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wifi Desactivados", Toast.LENGTH_SHORT).show();
        }
    }
}