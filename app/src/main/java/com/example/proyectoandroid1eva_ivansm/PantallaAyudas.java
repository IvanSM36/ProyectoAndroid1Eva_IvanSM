package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaAyudas extends AppCompatActivity {

    private TextView txtScroll;
    private LinearLayout linearScroll;
    private Button botonAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_ayudas);

        txtScroll = (TextView)findViewById(R.id.txtViewScroll);
        txtScroll.setMovementMethod(new ScrollingMovementMethod());

        botonAtras = (Button)findViewById(R.id.btnAtras);
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
    //////////////// Action Bar ////////////////

    //Metodo que hace que el boton al que se le aplique redireccione al activity pantalla de datos
    public void irPantallaDatos (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}