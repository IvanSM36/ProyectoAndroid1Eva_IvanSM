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

    private EditText editTxtedad;
    private Spinner spinGenero;
    private Spinner spinProvincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_datos);

        editTxtedad = (EditText)findViewById(R.id.editTxtEdad);
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

        String edad = editTxtedad.getText().toString();
        String genero = spinGenero.getSelectedItem().toString();
        String provincia = spinProvincia.getSelectedItem().toString();

        // Si la edad esta vacia saldra un mensaje toast
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
            Intent resultadoDatos = new Intent(this, PantallaTest.class);

            String e = (editTxtedad.getText().toString());
            String gen = spinGenero.getSelectedItem().toString();
            String prov = spinProvincia.getSelectedItem().toString();

            resultadoDatos.putExtra("edad", e);
            resultadoDatos.putExtra("genero", gen);
            resultadoDatos.putExtra("provincia", prov);

            startActivity(resultadoDatos);
        }

    }
}