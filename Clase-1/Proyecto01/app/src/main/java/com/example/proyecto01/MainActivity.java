package com.example.proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void presionar (View v){
        Toast.makeText(this, "Se ha presionado el BOTON 1", Toast.LENGTH_SHORT).show();
    }

    public void presionar2 (View v){
        Toast.makeText(this, "Se ha presionado otro boton", Toast.LENGTH_SHORT).show();
    }
}