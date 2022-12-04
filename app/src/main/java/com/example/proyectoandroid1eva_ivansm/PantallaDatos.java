package com.example.proyectoandroid1eva_ivansm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class PantallaDatos extends AppCompatActivity {

    // Declaramos las variables
    private EditText editTxtedad;
    private Spinner spinGenero;
    private Spinner spinProvincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_datos);

        // Inicializamos las variables con los botones
        editTxtedad = (EditText)findViewById(R.id.editTxtEdad);
        spinGenero = (Spinner)findViewById(R.id.spinGenero);
        spinProvincia = (Spinner)findViewById(R.id.spinProvincias);

        // Creamos un ArrayAdapter que contendra los items del spinnerGenero que se encuentra en app/res/values/spinners.xml
        ArrayAdapter<CharSequence> arrayGenero = ArrayAdapter.createFromResource(this, R.array.genero, R.layout.spinner_item);
        // Cambiamos el estilo del desplegable del spinner que se encuentra en app/res/layout/spinner_dropdown_item.xml
        arrayGenero.setDropDownViewResource(R.layout.spinner_dropdown_item);
        // Introduce los items del spinner en el array
        spinGenero.setAdapter(arrayGenero);

        // Creamos un ArrayAdapter que contendra los items del spinnerProvincia
        ArrayAdapter<CharSequence> arrayProvincia = ArrayAdapter.createFromResource(this, R.array.provincias, R.layout.spinner_item);
        // Cambiamos el estilo del desplegable del spinner
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

        // Guardamos los datos de los componentes en variables
        String edad = editTxtedad.getText().toString();
        String genero = spinGenero.getSelectedItem().toString();
        String provincia = spinProvincia.getSelectedItem().toString();

        //Comprobamos si los campos estan vacios muestre un mensaje Toast y no deje avanzar
        if (edad.equals("")) {
            Toast.makeText(this, "Por favor, introduzca una edad", Toast.LENGTH_LONG).show();
            editTxtedad.requestFocus();
            // Si el genero esta vacio saldra un mensaje toast
        }else if(genero.equals("")){
            Toast.makeText(this, "Por favor, elige un genero", Toast.LENGTH_LONG).show();
            spinGenero.requestFocus();
            // Si la provincia esta vacia saldra un mensaje toast
        }else if(provincia.equals("")) {
            Toast.makeText(this, "Por favor, elige una provincia", Toast.LENGTH_LONG).show();
            spinProvincia.requestFocus();
            // Si no  pasaremos los datos al siguiente activity y nos redirige al siguiente activity
        }else {
            // Creamos un objeto Intent para pasar los datos a la siguiente activity
            Intent resultadoDatos = new Intent(this, PantallaTest.class);

            // Metemos los datos recogidos en el objeto Intent
            resultadoDatos.putExtra("edad", edad);
            resultadoDatos.putExtra("genero", genero);
            resultadoDatos.putExtra("provincia", provincia);

            //Lanzamos el siguiente activity
            startActivity(resultadoDatos);
        }

    }
}