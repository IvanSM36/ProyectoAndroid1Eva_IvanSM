package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class PantallaTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_test);
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
            Toast.makeText(this, "Ayuda", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item02){
            Toast.makeText(this,"Acerca de ...", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}