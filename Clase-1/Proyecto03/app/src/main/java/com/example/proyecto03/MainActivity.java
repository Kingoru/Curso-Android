package com.example.proyecto03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2;
    private RadioButton rbSuma, rbResta;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);

        rbSuma = findViewById(R.id.rbSuma);
        rbResta = findViewById(R.id.rbResta);

        tv1 = findViewById(R.id.tv1);
    }

    public void calcular (View v){

        //creamos variables que van a obtener el texto intruducido en los edt1 y 2 y lo convertimos en string
        String op1 = edt1.getText().toString();
        String op2 = edt2.getText().toString();

        //convertimos lo guardado en las variables s1 y s2 en enteros y lo guardamos en nuevas variables

        int v1 = Integer.parseInt(op1);
        int v2 = Integer.parseInt(op2);

        //Condicional para evaluar la opcion seleccionada

        if (rbSuma.isChecked()){
            int suma = v1 + v2;
            tv1.setText("La suma es: " + suma);
        }else
            if(rbResta.isChecked()){
                int resta = v1 - v2;
                tv1.setText("La resta es: " + resta);
            }
    }
}