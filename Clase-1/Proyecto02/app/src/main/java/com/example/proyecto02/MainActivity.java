package com.example.proyecto02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaramos variables que nos van a servir de referencia para los elementos creados en la vista
    private EditText edt1, edt2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  Relaciono las Variables que creamos con los elementos que se
            encuentran en la vista con un findViewById
        */
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        tv1 = findViewById(R.id.tv1);
    }

    /*
            Creamos el metodo Sumar que va a tomar la informacion obtenida de los elementos
            y procedera a hacer la suma
     */
    public void sumar(View v){
        //creamos variables que van a obtener el texto intruducido en los edt1 y 2 y lo convertimos en string
        String s1 = edt1.getText().toString();
        String s2 = edt2.getText().toString();

        //convertimos lo guardado en las variables s1 y s2 en enteros y lo guardamos en nuevas variables

        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        //realizamos la suma
        int suma = v1 + v2;

        //Mostramos el resultado en el TextView
        tv1.setText("La suma es: " + suma);
    }
}