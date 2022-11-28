package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    private Button btnEmpezar;
    private VideoView fondoBienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpezar = (Button) findViewById(R.id.btnEmpezar);

    }

    public void irPantallaDatos (View view) {

        Intent i = new Intent(this, PantallaDatos.class);

        startActivity(i);
    }
}