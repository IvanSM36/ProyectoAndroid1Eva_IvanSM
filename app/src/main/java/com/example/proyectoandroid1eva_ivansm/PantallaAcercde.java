package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PantallaAcercde extends AppCompatActivity {

    private TextView txtScroll;
    private LinearLayout linearScroll;
    private Button botonAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_acercde);

        botonAtras = (Button)findViewById(R.id.btnAtras);
    }

    //Metodo que hace que el boton al que se le aplique redireccione al activity pantalla de datos
    public void irPantallaDatos (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}