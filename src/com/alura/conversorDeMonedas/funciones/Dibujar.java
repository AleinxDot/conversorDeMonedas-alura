package com.alura.conversorDeMonedas.funciones;

import com.alura.conversorDeMonedas.modelos.Monedas;
import com.alura.conversorDeMonedas.modelos.Resultado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dibujar {

    public void interfazPrincipal(){

        System.out.println("===================================");
        System.out.println("  Conversor de Monedas Alura APP  ");
        System.out.println("===================================");
        System.out.println();
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("Seleccione la conversion que desea realizar:");
        System.out.println("1. Dolar a Euro");
        System.out.println("2. Euro a Dolar");
        System.out.println("3. Dolar a Peso Argentino");
        System.out.println("4. Peso Argentino a Dolar");
        System.out.println("5. Dolar a Peso Mexicano");
        System.out.println("6. Peso Mexicano a Dolar");
        System.out.println("7. Dolar a Sol Peruano");
        System.out.println("8. Sol Peruano a Dolar");
        System.out.println("0. Salir");
        System.out.println();

    }

    public void resultadoConversion(){

        double cantidad;
        List<Resultado> save = new ArrayList<>();
        Exportar exportar = new Exportar();

        Scanner optionChooser = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("===================================");
            System.out.print("Seleccione una opcion: ");
            int opcion = optionChooser.nextInt();
            System.out.println("===================================");

            Conversion_Rates conversion = new Conversion_Rates();
            //Obteniendo las monedas a convertir
            Monedas monedas = conversion.obtenerConversionRates(opcion);
            if (monedas.getMonedaOrigen() == null || monedas.getMonedaDestino() == null) {
                System.out.println("Por favor intente de nuevo.");
                continue;
            }
            System.out.println("Ingrese la cantidad a convertir de " + monedas.getMonedaOrigen() + " a " + monedas.getMonedaDestino() + ": ");
            cantidad = optionChooser.nextDouble();
            System.out.println("===================================");
            System.out.println();

            //Realizando la conversion
            Resultado resultado = conversion.conversor(monedas.getMonedaOrigen(), monedas.getMonedaDestino(), cantidad);

            //Imprimiendo el resultado
            System.out.println();
            System.out.println("Usted recibira: "+monedas.getMonedaDestino()+" "+resultado.getResultado());
            System.out.println("Tasa de cambio actual: " + resultado.getTodayRate() +"      Fecha de la tasa de cambio: " + resultado.getDate());

            // Guardando el resultado
            save.add(resultado);

            System.out.println("===================================");

            System.out.println("Desea realizar otra conversion? (S/N)");
            String respuesta = optionChooser.next();
            if (respuesta.equalsIgnoreCase("S")) {
                interfazPrincipal();
            } else if (respuesta.equalsIgnoreCase("N")) {
                //Exportamos el resultado a un archivo JSON
                exportar.exportarResultados(save);
                continuar = false;
                System.out.println("Gracias por usar el conversor de monedas Alura APP");
                System.out.println("Hasta luego!");
                System.out.println("Puede ver sus conversiones en el archivo conversiones.json");
            } else {
                System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }

    }

}
