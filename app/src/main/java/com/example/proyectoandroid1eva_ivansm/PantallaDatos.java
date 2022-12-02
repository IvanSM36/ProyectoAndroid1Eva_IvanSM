package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PantallaDatos extends AppCompatActivity {

    private Spinner spinGenero;
    private Spinner spinProvincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_datos);

        spinGenero = (Spinner)findViewById(R.id.spinGenero);
        spinProvincia = (Spinner)findViewById(R.id.spinProvincias);

        ArrayAdapter<CharSequence> arrayGenero = ArrayAdapter.createFromResource(this, R.array.genero, R.layout.spinner_item);
        spinGenero.setAdapter(arrayGenero);
        //Camabiamos el estilo del desplegable del spinner que seria el array
        arrayGenero.setDropDownViewResource(R.layout.spinner_dropdown_item);

        ArrayAdapter<CharSequence> arrayProvincia = ArrayAdapter.createFromResource(this, R.array.provincias, R.layout.spinner_item);
        //Camabiamos el estilo del desplegable del spinner que seria el array
        arrayProvincia.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinProvincia.setAdapter(arrayProvincia);
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

    //Metodo que abre el activity pantalla de test
    public void irPantallaTest (View view) {
        Intent i = new Intent(this, PantallaTest.class);
        startActivity(i);
    }
}