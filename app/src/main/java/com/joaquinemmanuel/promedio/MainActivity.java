package com.joaquinemmanuel.promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    EditText botellaAcostada;
    EditText botellaParada;
    EditText humanoParado;
    EditText humanoAcostado;
    EditText escobaParada;
    EditText escobaAcostada;
    EditText edt7;
    EditText edt8;
    EditText edt9;
    EditText edt10;
    ArrayList<EditText> editTexts;
    Button btnResultado;
    PhysicsProyectHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botellaAcostada = findViewById(R.id.edtBotellaAcostada);
        botellaParada = findViewById(R.id.edtBotellaParada);
        humanoAcostado = findViewById(R.id.edtHumanoAcostado);
        humanoParado = findViewById(R.id.edtHumanoParado);
        escobaParada = findViewById(R.id.edtEscobaParada);
        escobaAcostada = findViewById(R.id.edtEscobaAcostada);
        edt7 = findViewById(R.id.edt7);
        edt8 = findViewById(R.id.edt8);
        edt9 = findViewById(R.id.edt9);
        edt10 = findViewById(R.id.edt10);
        btnResultado = findViewById(R.id.btnMaths);
        resultado = findViewById(R.id.tvResultado);
        helper = new PhysicsProyectHelper();
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llenarEditTexts();
                helper.iniciarBoton(editTexts , resultado);
            }
        });
    }

    public void llenarEditTexts(){
        editTexts = new ArrayList<>();
        editTexts.add(botellaAcostada);
        editTexts.add(botellaParada);
        editTexts.add(humanoAcostado);
        editTexts.add(humanoParado);
        editTexts.add(escobaAcostada);
        editTexts.add(escobaParada);
        editTexts.add(edt7);
        editTexts.add(edt8);
        editTexts.add(edt9);
        editTexts.add(edt10);
    }



}