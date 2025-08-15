# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java. Permite convertir entre diferentes monedas utilizando el endpoint **Pair Conversion** de [ExchangeRate-API](https://www.exchangerate-api.com/).

## Características

\- Conversión entre USD, EUR, ARS, MXN y PEN.  
\- Consumo de datos en tiempo real desde ExchangeRate-API.  
\- Interfaz sencilla por consola.

## Tecnologías utilizadas

\- Java  
\- Gson para el manejo de JSON  
\- ExchangeRate-API (endpoint Pair Conversion)
## Requisitos

- **Java 8** o superior
- **Gson** (para manejo de JSON)
  
Puedes agregar Gson al proyecto descargando el JAR desde [https://github.com/google/gson](https://github.com/google/gson) o usando un gestor de dependencias como Maven o Gradle.

Ejemplo Maven:

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
```

## Cómo funciona

El programa realiza una petición HTTP al endpoint:

`https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{monedaOrigen}/{monedaDestino}/{cantidad}`

Donde:  
\- `{API_KEY}` es tu clave de acceso a la API.  
\- `{monedaOrigen}` y `{monedaDestino}` son los códigos de las monedas.  
\- `{cantidad}` es el monto a convertir.

La respuesta se procesa y muestra el resultado de la conversión.

## Ejecución

1. Clona el repositorio.
2. Asegúrate de tener Java instalado.
3. Ejecuta el programa desde tu IDE o consola.

## Nota

Necesitas una API Key válida de ExchangeRate-API para que el programa funcione correctamente.

## Licencia

Este proyecto es solo para fines educativos.
