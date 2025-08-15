# 💱 Conversor de Monedas en Java

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=java)  
![Gson](https://img.shields.io/badge/Gson-2.10.1-blue)  
![API](https://img.shields.io/badge/API-ExchangeRate--API-green)  
![License](https://img.shields.io/badge/license-Educativo-lightgrey)

Este es un **conversor de monedas por consola** desarrollado en **Java**, que convierte entre diferentes divisas en tiempo real usando el endpoint **Pair Conversion** de [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🚀 Características

- ✅ Conversión entre **USD**, **EUR**, **ARS**, **MXN** y **PEN**.  
- ✅ Datos en **tiempo real**.  
- ✅ Interfaz de consola clara y sencilla.  
- ✅ Código limpio y fácil de extender.

---

## 📦 Instalación rápida

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/AleinxDot/conversorDeMonedas-alura.git
   ```

2. **Agrega Gson**  
   - **Maven**:
     ```xml
     <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.10.1</version>
     </dependency>
     ```
   - **O descarga el JAR** desde: [https://github.com/google/gson](https://github.com/google/gson)  

3. **Configura tu API Key** en el código.

4. **Compila y ejecuta**

## ⚙️ Funcionamiento

El programa llama al endpoint:

```
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{monedaOrigen}/{monedaDestino}/{cantidad}
```

- `{API_KEY}` → Tu clave de ExchangeRate-API.  
- `{monedaOrigen}` → Código de la moneda origen (ej. `USD`).  
- `{monedaDestino}` → Código de la moneda destino (ej. `PEN`).  
- `{cantidad}` → Monto a convertir.

El JSON recibido se procesa con **Gson** y se muestra el resultado.

---


## 📄 Licencia

Este proyecto es **educativo**.  
Puedes modificarlo y adaptarlo libremente para tus necesidades.


## Nota

Necesitas una API Key válida de ExchangeRate-API para que el programa funcione correctamente.
