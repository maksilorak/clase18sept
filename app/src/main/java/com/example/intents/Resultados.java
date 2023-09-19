package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    String voto,phoneNumber, email;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        name = findViewById(R.id.name);

        Intent recibirDatos = getIntent();
        voto = recibirDatos.getStringExtra("voto");
        name.setText(voto);
    }
}