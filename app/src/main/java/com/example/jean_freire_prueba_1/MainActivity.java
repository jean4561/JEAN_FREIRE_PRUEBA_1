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
    float resultado =dividendo/divisor;

    }
    public void Enteros(View view){
        int dividendo =Integer.parseInt(editTextDividendo.toString());
        int divisor   =Integer.parseInt(editTextDivisor.toString());
        int resultado =dividendo/divisor;
    }
}