package com.example.eiden.comunicacionactividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Eiden on 28/12/2017.
 */

public class RespuestaActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resouesta);

        String nombre = getIntent().getStringExtra("nombre");

        TextView tvTitulo = (TextView) findViewById(R.id.hola);
        tvTitulo.setText("Hola " + nombre + " ¿Aceptas las condiciones?");

        Button bAceptar = (Button)findViewById(R.id.button02);
        bAceptar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setResult(RESULT_OK);
                finish();

            }
        });
        Button bRechazar = (Button)findViewById(R.id.button03);
        bAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
            }
        });

        }





    }

