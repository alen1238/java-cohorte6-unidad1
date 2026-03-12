# Ejercicios pedagógicos de modularidad en Java

Estos ejemplos muestran cómo un bloque de código que mezcla varias responsabilidades puede dividirse en **métodos pequeños y claros**. Deberás identificar los bloques separables y llevar el ejercicio hacia una versión modular.

------------------------------------------------------------------------

# Ejercicio 1 --- Registro de usuario

##  Versión no modular

``` java
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Bienvenido " + nombre + ", registro permitido.");
        } else {
            System.out.println("Lo sentimos " + nombre + ", debes ser mayor de edad.");
        }

    }

}
```

Problema: el `main` mezcla varias responsabilidades:

-   solicitar nombre
-   solicitar edad
-   determinar si puede registrarse
-   mostrar mensaje

------------------------------------------------------------------------

# Ejercicio 2 --- Sistema de descuentos

##  Versión no modular

``` java
double precio = 120000;

double descuento = 0;

if (precio > 100000) {
    descuento = precio * 0.10;
}

double total = precio - descuento;

System.out.println("Precio original: " + precio);
System.out.println("Descuento: " + descuento);
System.out.println("Total: " + total);
```

------------------------------------------------------------------------

# Ejercicio 3 --- Cálculo de salario

##  Versión no modular

``` java
double horas = 45;
double valorHora = 10000;

double salarioBase = horas * valorHora;

double bono = 0;

if (horas > 40) {
    bono = 20000;
}

double salarioTotal = salarioBase + bono;

System.out.println("Salario total: " + salarioTotal);
```

------------------------------------------------------------------------

# Ejercicio 4 --- Validación de contraseña

##  Versión no modular

``` java
Scanner sc = new Scanner(System.in);

System.out.println("Ingrese contraseña:");
String pass = sc.nextLine();

if(pass.length() >= 8){
    System.out.println("Contraseña válida");
}else{
    System.out.println("Contraseña muy corta");
}
```
------------------------------------------------------------------------

# Ejercicio 5 --- Promedio de temperaturas

##  Versión no modular

``` java
double t1 = 20;
double t2 = 24;
double t3 = 22;

double promedio = (t1 + t2 + t3) / 3;

if(promedio > 25){
    System.out.println("Clima caliente");
}else{
    System.out.println("Clima templado");
}
```
------------------------------------------------------------------------

# Ejercicio 6 --- Conversión de moneda

##  Versión no modular

``` java
double pesos = 50000;

double tasa = 4000;

double dolares = pesos / tasa;

System.out.println("Pesos: " + pesos);
System.out.println("Dólares: " + dolares);
```

##  Versión modular

``` java
double dolares = convertirPesosADolares(pesos, tasa);

mostrarConversion(pesos, dolares);
```

------------------------------------------------------------------------

# Patrón conceptual que debes aprender

En muchos programas aparecen las mismas etapas:

**Código no modular**

-   datos
-   cálculos
-   decisiones
-   salida

Todo mezclado en el mismo lugar.

**Código modular**

-   `pedirDatos()`
-   `calcularAlgo()`
-   `tomarDecision()`
-   `mostrarResultado()`

Cada paso se convierte en **un método con una responsabilidad clara**.

------------------------------------------------------------------------

# Regla pedagógica para recordar

> Cuando tu programa empieza a parecer una historia con muchos párrafos,
> cada párrafo probablemente debería ser **un método diferente**.
