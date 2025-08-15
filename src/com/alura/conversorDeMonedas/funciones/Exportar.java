package com.alura.conversorDeMonedas.funciones;

import com.alura.conversorDeMonedas.modelos.Resultado;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exportar {
    public void exportarResultados(List<Resultado> resultados){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(resultados);

        try {
            FileWriter escritura = new FileWriter("conversiones.json");
            escritura.write(json);
            escritura.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
