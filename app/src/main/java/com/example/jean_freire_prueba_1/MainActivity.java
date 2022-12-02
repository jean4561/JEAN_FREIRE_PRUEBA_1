package com.example.jean_freire_prueba_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editTextNombre;
    EditText editTextApellido;
    EditText editTextDividendo;
    EditText editTextDivisor;
    EditText editTextParteEntera;
    EditText editTextResiduo;
    EditText editTextInvertido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Nombres(View view){

    }
    public void Dividir(View view){

    float dividendo =Integer.parseInt(editTextDividendo.toString());
    float divisor   =Integer.parseInt(editTextDivisor.toString());


        int i;
        for (i=0;dividendo!=divisor;++i);{
            dividendo+=divisor;
        }

        editTextInvertido.setText(i);
    }


    public void Enteros(View view){
        int dividendoe =Integer.parseInt(editTextDividendo.toString());
        int divisore   =Integer.parseInt(editTextDivisor.toString());


        int i;
        for (i=0;dividendoe!=divisore;++i);{
            dividendoe+=divisore;
        }

        editTextInvertido.setText(i);

    }
}