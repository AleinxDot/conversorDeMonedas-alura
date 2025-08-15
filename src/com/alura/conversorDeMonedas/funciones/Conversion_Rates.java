package com.alura.conversorDeMonedas.funciones;

import com.alura.conversorDeMonedas.modelos.Monedas;
import com.alura.conversorDeMonedas.modelos.Resultado;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Conversion_Rates {

    public Resultado conversor(String monedaOrigen, String monedaDestino, double cantidad) {

        //Realizando conversion usando el endpoint de Pair Conversion de ExchangeRate-API

        //API Key de ExchangeRate-API y URL del endpoint
        String API_KEY = "a54298f6eb779f4f04380818";
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino + "/" + cantidad;

        System.out.println("Convirtiendo " + cantidad + " " + monedaOrigen + " a " + monedaDestino);

        //Consumiendo el endpoint y obteniendo el resultado siguiendo el ejemplo de ExchangeRate-API
        JsonElement root = null;
        try {
            URL endpoint = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) endpoint.openConnection();
            JsonParser jp = new JsonParser();
            root = jp.parse(new InputStreamReader((InputStream) connection.getContent()));
            connection.connect();
        } catch (MalformedURLException e) {
            throw new RuntimeException("URL mal formada: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JsonObject jsonobj = root.getAsJsonObject();

        //Obteniendo los datos del JSON
        String resultado = jsonobj.get("conversion_result").getAsString();
        String todayRate = jsonobj.get("conversion_rate").getAsString();

        return  new Resultado(cantidad,resultado, todayRate,monedaOrigen,monedaDestino);
    }

    public Monedas obtenerConversionRates(int opcion){
        Monedas monedas = new Monedas();
        //Asignando las monedas a convertir segun la opcion elegida
        switch (opcion) {
            case 1:
                monedas = new Monedas("USD", "EUR");
                break;
            case 2:
                monedas = new Monedas("EUR", "USD");
                break;
            case 3:
                monedas = new Monedas("USD", "ARS");
                break;
            case 4:
                monedas = new Monedas("ARS", "USD");
                break;
            case 5:
                monedas = new Monedas("USD", "MXN");
                break;
            case 6:
                monedas = new Monedas("MXN", "USD");
                break;
            case 7:
                monedas = new Monedas("USD", "PEN");
                break;
            case 8:
                monedas = new Monedas("PEN", "USD");

                break;
            case 0:
                System.out.println("Gracias por usar el conversor de monedas");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
        }

        return monedas;
    }
}
