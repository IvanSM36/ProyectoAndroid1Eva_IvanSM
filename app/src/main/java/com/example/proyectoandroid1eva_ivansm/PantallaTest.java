package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class PantallaTest extends AppCompatActivity {

    //Botones avanzar
    private Button btnSiguiente;
    private Button btnSiguiente2;
    private Button btnSiguiente3;
    private Button btnSiguiente4;
    private Button btnSiguiente5;
    private Button btnSiguiente6;
    private Button btnSiguiente7;
    private Button btnFinalizar;

    //Botones de retroceso
    private Button btnAtras;
    private Button btnAtras2;
    private Button btnAtras3;
    private Button btnAtras4;
    private Button btnAtras5;
    private Button btnAtras6;
    private Button btnAtras7;
    private Button btnAtras8;

    //Frames
    private FrameLayout f1;
    private FrameLayout f2;
    private FrameLayout f3;
    private FrameLayout f4;
    private FrameLayout f5;
    private FrameLayout f6;
    private FrameLayout f7;
    private FrameLayout f8;

    //contador respuestas
    private int aciertos = 0;
    private int fallos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_test);

        //////////////// Inicializamos los botones ////////////////
        btnSiguiente  = (Button)findViewById(R.id.btnSiguiente);
        btnSiguiente2 = (Button)findViewById(R.id.btnSiguiente2);
        btnSiguiente3 = (Button)findViewById(R.id.btnSiguiente3);
        btnSiguiente4 = (Button)findViewById(R.id.btnSiguiente4);
        btnSiguiente5 = (Button)findViewById(R.id.btnSiguiente5);
        btnSiguiente6 = (Button)findViewById(R.id.btnSiguiente6);
        btnSiguiente7 = (Button)findViewById(R.id.btnSiguiente7);
        btnFinalizar  = (Button)findViewById(R.id.btnFinalizar);

        btnAtras = (Button)findViewById(R.id.btnAtras);
        btnAtras2 = (Button)findViewById(R.id.btnAtras2);
        btnAtras3 = (Button)findViewById(R.id.btnAtras3);
        btnAtras4 = (Button)findViewById(R.id.btnAtras4);
        btnAtras5 = (Button)findViewById(R.id.btnAtras5);
        btnAtras6 = (Button)findViewById(R.id.btnAtras6);
        btnAtras7 = (Button)findViewById(R.id.btnAtras7);
        btnAtras8 = (Button)findViewById(R.id.btnAtras8);

        f1 = (FrameLayout) findViewById(R.id.frame1);
        f2 = (FrameLayout) findViewById(R.id.frame2);
        f3 = (FrameLayout) findViewById(R.id.frame3);
        f4 = (FrameLayout) findViewById(R.id.frame4);
        f5 = (FrameLayout) findViewById(R.id.frame5);
        f6 = (FrameLayout) findViewById(R.id.frame6);
        f7 = (FrameLayout) findViewById(R.id.frame7);
        f8 = (FrameLayout) findViewById(R.id.frame8);

        ///////////////////////////////////////////////////////////

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
            Toast.makeText(this,"Acerca de...", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    //////////////////////////////////////////////////////////





}