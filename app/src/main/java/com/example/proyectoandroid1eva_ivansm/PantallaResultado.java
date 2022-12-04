package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaResultado extends AppCompatActivity {

    // Declaramos las variables
    private TextView txtedad;
    private TextView txtgenero;
    private TextView txtprovincia;
    private TextView txtaciertos;
    private TextView txtfallo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultado);

        // Inicializamos las variables con los botones
        txtedad = (TextView)findViewById(R.id.txtViewResulEdad);
        txtgenero = (TextView)findViewById(R.id.txtViewResulGenero);
        txtprovincia = (TextView)findViewById(R.id.txtViewResulProvincia);
        txtaciertos = (TextView)findViewById(R.id.txtViewResulAcierto);
        txtfallo = (TextView)findViewById(R.id.txtViewResulFallo);

        // Con bundle recogemos los datos del activity anterior
        Bundle datos = getIntent().getExtras();

        //  Guardamos los datos del activity anterior en variables
        String e = datos.getString("edad");
        String gen = datos.getString("genero");
        String prov = datos.getString("provincia");
        String pos = datos.getString("aciertos");
        String neg = datos.getString("fallos");

        //Mostramos los datos de las variables en los textView
        txtedad.setText(e);
        txtgenero.setText(gen);
        txtprovincia.setText(prov);
        txtaciertos.setText(pos);
        txtfallo.setText(neg);
    }

    //////////////// Action Bar ////////////////
    //Metodo para mostrar y ocultar el ActionBar
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }

    //Metodo para asignar las funciones de los items del Action Bar
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item01){
            Intent i = new Intent(this, PantallaAyudas.class);
            startActivity(i);
            Toast.makeText(this, "Ayuda", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item02){
            Intent i = new Intent(this, PantallaAcercde.class);
            startActivity(i);
            Toast.makeText(this,"Acerca de ...", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    //////////////////////////////////////////////

    //Metodo que redirecciona a Pantalla de datos
    public void volverRealizarTest(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}