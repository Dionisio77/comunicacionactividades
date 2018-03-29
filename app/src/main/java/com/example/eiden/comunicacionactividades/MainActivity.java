package com.example.eiden.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bVerificar = (Button) findViewById(R.id.button01);
        bVerificar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText etNombre = (EditText) findViewById(R.id.nombre);
                String nombre = etNombre.getText().toString();

                Intent intent = new Intent(MainActivity.this,RespuestaActivity.class);
                intent.putExtra("nombre",nombre);
                startActivityForResult(intent,1);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
