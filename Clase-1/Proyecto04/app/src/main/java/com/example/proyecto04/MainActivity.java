package com.example.proyecto04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2;
    private CheckBox cbSumar, cbRestar;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casteamos los elementos

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);

        cbSumar = findViewById(R.id.cbSumar);
        cbRestar = findViewById(R.id.cbRestar);

        tv1 = findViewById(R.id.tv1);
    }

    public void calcular(View v){

        int v1 = Integer.parseInt(edt1.getText().toString());
        int v2 = Integer.parseInt(edt2.getText().toString());

        if(cbSumar.isChecked()){
            int suma = v1 + v2;
            tv1.setText("El resultado es: " + suma);
        }else
            if(cbRestar.isChecked()){
                int resta = v1 - v2;
                tv1.setText("El resultado es: " + resta);
            }

    }
}