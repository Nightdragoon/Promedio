package com.joaquinemmanuel.promedio;

import android.widget.EditText;

import java.util.ArrayList;

public interface IPhysicsProyectHelper {
    public ArrayList<Float> obtenerNumeros(ArrayList<EditText> editTexts);
    public Float hacerOperacion(ArrayList<Float> num);
}
