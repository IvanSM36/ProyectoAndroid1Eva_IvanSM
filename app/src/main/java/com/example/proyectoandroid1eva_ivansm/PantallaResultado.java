package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PantallaResultado extends AppCompatActivity {

    private TextView txtedad;
    private TextView txtgenero;
    private TextView txtprovincia;
    private TextView txtaciertos;
    private TextView txtfallo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultado);

        txtedad = (TextView)findViewById(R.id.txtViewResulEdad);
        txtgenero = (TextView)findViewById(R.id.txtViewResulGenero);
        txtprovincia = (TextView)findViewById(R.id.txtViewResulProvincia);
        txtaciertos = (TextView)findViewById(R.id.txtViewResulAcierto);
        txtfallo = (TextView)findViewById(R.id.txtViewResulFallo);

        Bundle datos = getIntent().getExtras();

        String e = datos.getString("edad");
        String gen = datos.getString("genero");
        String prov = datos.getString("provincia");
        String pos = datos.getString("aciertos");
        String neg = datos.getString("fallos");

        txtedad.setText(e);
        txtgenero.setText(gen);
        txtprovincia.setText(prov);
        txtaciertos.setText(pos);
        txtfallo.setText(neg);
    }

    //Metodo que redirecciona a Pantalla de datos
    public void volverRealizarTest(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}