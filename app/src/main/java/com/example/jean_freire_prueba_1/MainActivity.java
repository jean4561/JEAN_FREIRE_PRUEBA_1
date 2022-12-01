package com.example.jean_freire_prueba_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editTextNombre;
    EditText editTextApellido;
    EditText editTextDividendo;
    EditText editTextDivisor;
    EditText editTextParteEntera;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}