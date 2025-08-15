package com.alura.conversorDeMonedas.modelos;

public class Resultado extends Monedas{
    private String resultado;
    private String todayRate;
    private String date;
    private Double monto;

    public Resultado(Double monto, String resultado, String todayRate, String monedaOrigen, String monedaDestino) {
        super(monedaOrigen, monedaDestino);
        this.monto = monto;
        this.resultado = resultado;
        this.todayRate = todayRate;
        this.date = java.time.LocalDate.now().toString();
    }
    public Resultado() {

    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public String getTodayRate() {
        return todayRate;
    }
    public void setTodayRate(String todayRate) {
        this.todayRate = todayRate;
    }
    public String getDate() {
        return date;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
