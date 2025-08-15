package com.alura.conversorDeMonedas.modelos;

public class Monedas {

    private String monedaOrigen;
    private String monedaDestino;

    public Monedas(String monedaOrigen, String monedaDestino) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public Monedas() {

    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }


}
