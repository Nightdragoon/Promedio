package com.joaquinemmanuel.promedio;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class PhysicsProyectHelper implements  IPhysicsProyectHelper{

    public PhysicsProyectHelper (){

    }

    @Override
    public ArrayList<Float> obtenerNumeros(ArrayList<EditText> editTexts) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Float> floats = new ArrayList<>();
        for (EditText i : editTexts){
            String e = i.getText().toString();
            strings.add(e);

        }
        for (String i : strings){
            if (!i.isEmpty()){
                float e = Float.parseFloat(i);
                floats.add(e);
            }
        }
        return floats;
    }

    @Override
    public Float hacerOperacion(ArrayList<Float> num) {
        float result = 0;
        for (Float i : num){
            result += i;
        }
        float metros = result/(num.size());


        return  metros;

    }

    public void iniciarBoton(ArrayList<EditText> editTexts , TextView textView){
        ArrayList<Float> floats;
        float result = hacerOperacion(obtenerNumeros(editTexts));
        textView.setText(String.format("%.2f" , result));

    }
}
