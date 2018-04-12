package com.example.diegosanabriabecerra.diegocalcfinanciera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        EditText e3 = (EditText) findViewById(R.id.num3);
        TextView t1 = (TextView) findViewById(R.id.result);
        int valorInversion = Integer.parseInt(e1.getText().toString());
        int periodo = Integer.parseInt(e2.getText().toString());
        int tasaInversion = Integer.parseInt(e3.getText().toString());






Double respuesta = valorFinal(valorInversion, periodo, tasaInversion);




       t1.setText(Double.toString(respuesta));
    // double pruebaExpo =   Math.pow( 5, 2);
      //  t1.setText(Double.toString(pruebaExpo));

    }

    public Double valorFinal(int valorPresente, int periodos, double tasaInteres)
    {
            double porcentaje = tasaInteres/100;
            double tasaInt = porcentaje+1;
            double exponencial = Math.pow(tasaInt,periodos);
      //  Double VF =  ( Math.pow((( tasaInt)), ((periodos))));
            Double VF = valorPresente * exponencial;
        return VF;

    }


}
