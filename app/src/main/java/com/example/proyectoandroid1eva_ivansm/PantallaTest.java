package com.example.proyectoandroid1eva_ivansm;

import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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

    //RadioButon
    private RadioButton radiobtn01;
    private RadioButton radiobtn02;
    private RadioButton radiobtn03;
    private RadioButton radiobtn04;
    private RadioButton radiobtn05;
    private RadioButton radiobtn06;
    private RadioButton radiobtn07;

    //CheckBox
    private CheckBox checkBox01;
    private CheckBox checkBox02;
    private CheckBox checkBox03;

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

        radiobtn01 = (RadioButton)findViewById(R.id.radioBtnNimbus);
        radiobtn02 = (RadioButton)findViewById(R.id.radioBtnAlohomora);
        radiobtn03 = (RadioButton)findViewById(R.id.radioBtnLeviosa);
        radiobtn04 = (RadioButton)findViewById(R.id.radioBtnGato);
        radiobtn05 = (RadioButton)findViewById(R.id.radioBtnOculus);
        radiobtn06 = (RadioButton)findViewById(R.id.radioBtnNagini);
        radiobtn07 = (RadioButton)findViewById(R.id.radioBtSerpientes);

        checkBox01 = (CheckBox)findViewById(R.id.checkBoxAnillo);
        checkBox02 = (CheckBox)findViewById(R.id.checkBoxCopa);
        checkBox03 = (CheckBox)findViewById(R.id.checkBoxanDiadema);

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

    //Metodo que redirecciona a Pantalla de datos
    public void pregunta1atras(){
        Intent i = new Intent(this, PantallaDatos.class);
        startActivity(i);
    }

    public void pregunta1siguiente(View view){
        f1.setVisibility(GONE); //Oculta frame1
        f2.setVisibility(View.VISIBLE); //Muestra frame2
    }

    public void pregunta2atras(View view){
        f2.setVisibility(GONE); //Oculta frame2
        f1.setVisibility(View.VISIBLE); //Muestra frame1
    }

    public void pregunta2siguiente(View view){
        f2.setVisibility(GONE); //Oculta frame2
        f3.setVisibility(View.VISIBLE); // Muestra frame3
    }

    public void pregunta3atras(View view){
        f3.setVisibility(GONE); //Oculta frame3
        f2.setVisibility(View.VISIBLE); //Muestra frame2
    }

    public void pregunta3siguiente(View view){
        f3.setVisibility(GONE); //Oculta frame3
        f4.setVisibility(View.VISIBLE); //Muestra frame 4
    }

    public void pregunta4atras(View view){
        f4.setVisibility(GONE); //Oculta frame4
        f3.setVisibility(View.VISIBLE); //Muestra frame3
    }

    public void pregunta4siguiente(View view){
        f4.setVisibility(GONE); //Oculta frame4
        f5.setVisibility(View.VISIBLE); //Muestra frame5
    }

    public void pregunta5atras(View view){
        f5.setVisibility(GONE);
        f4.setVisibility(View.VISIBLE);
    }
    public void pregunta5siguiente(View view){
        f5.setVisibility(GONE);
        f6.setVisibility(View.VISIBLE);
    }

    public void pregunta6atras(View view){
        f6.setVisibility(GONE);
        f5.setVisibility(View.VISIBLE);
    }

    public void pregunta6siguiente(View view){
        f6.setVisibility(GONE);
        f7.setVisibility(View.VISIBLE);
    }

    public void pregunta7atras(View view){
        f7.setVisibility(GONE);
        f6.setVisibility(View.VISIBLE);
    }

    public void pregunta7siguiente(View view){
        f7.setVisibility(GONE);
        f8.setVisibility(View.VISIBLE);
    }

    public void pregunta8atras(View view){
        f8.setVisibility(GONE);
        f7.setVisibility(View.VISIBLE);
    }

    public void pregunta8Finalizar(View view){
        //Recogemos los datos de la pantalla datos para luego pasarlos al activity PantallaResultado
        Bundle datos = getIntent().getExtras();
        Intent resultado = new Intent(this, PantallaResultado.class);

        String e = datos.getString("edad");
        String gen = datos.getString("genero");
        String prov = datos.getString("provincia");

        String pos = Integer.toString(comprobarAciertos());
        String neg = Integer.toString(comprobarfallos());

        resultado.putExtra("edad", e);
        resultado.putExtra("genero",gen);
        resultado.putExtra("provincia",prov);
        resultado.putExtra("aciertos", pos);
        resultado.putExtra("fallos", neg);
        startActivity(resultado);
    }

    public int comprobarAciertos(){
        //Comprobamos los aciertos y los fallos del test
        if(radiobtn01.isChecked())
            aciertos++;
        if(radiobtn02.isChecked())
            aciertos++;
        if(radiobtn03.isChecked())
            aciertos++;
        if(radiobtn04.isChecked())
            aciertos++;
        if(radiobtn05.isChecked())
            aciertos++;
        if(radiobtn06.isChecked())
            aciertos++;
        if(radiobtn07.isChecked())
            aciertos++;
        if(checkBox01.isChecked() && checkBox02.isChecked() && checkBox03.isChecked())
            aciertos++;

     return aciertos;
    }

    public int comprobarfallos(){
        //Comprobamos los aciertos y los fallos del test
        if(!radiobtn01.isChecked())
            fallos++;
        if(!radiobtn02.isChecked())
            fallos++;
        if(!radiobtn03.isChecked())
            fallos++;
        if(!radiobtn04.isChecked())
            fallos++;
        if(!radiobtn05.isChecked())
            fallos++;
        if(!radiobtn06.isChecked())
            fallos++;
        if(!radiobtn07.isChecked())
            fallos++;
        if(!checkBox01.isChecked() && !checkBox02.isChecked() && !checkBox03.isChecked())
            fallos++;
        return fallos;
    }


}