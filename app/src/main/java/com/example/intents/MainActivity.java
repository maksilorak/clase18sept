package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre,cedula,nacimiento;
    Button A,B,C;

    String voto,name, id,naci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        cedula = findViewById(R.id.cedula);
        nacimiento = findViewById(R.id.nacimiento);
        A = findViewById(R.id.opcionA);
        B = findViewById(R.id.opcionB);
        C= findViewById(R.id.opcionC);


        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto = "A";
                name = nombre.getText().toString();

                Intent enviarDatos = new Intent(MainActivity.this,Resultados.class);
                enviarDatos.putExtra("voto",voto);
                enviarDatos.putExtra("nombre",name);
                enviarDatos.putExtra("cedula",cedula.getText().toString());
                startActivity(enviarDatos);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto = "B";
                name = nombre.getText().toString();

                Intent enviarDatos = new Intent(MainActivity.this,Resultados.class);
                enviarDatos.putExtra("voto",voto);
                enviarDatos.putExtra("nombre",name);
                enviarDatos.putExtra("cedula",cedula.getText().toString());
                startActivity(enviarDatos);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto = "C";
                name = nombre.getText().toString();

                Intent enviarDatos = new Intent(MainActivity.this,Resultados.class);
                enviarDatos.putExtra("voto",voto);
                enviarDatos.putExtra("nombre",name);
                enviarDatos.putExtra("cedula",cedula.getText().toString());
                startActivity(enviarDatos);
            }
        });



    }


}