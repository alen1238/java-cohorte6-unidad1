# Ejercicio: Sistema de cálculo de envío de paquetes

## Contexto

Una empresa de mensajería necesita desarrollar un programa en **Java**
que permita calcular el **costo total de enviar un paquete**.

El costo del envío depende de tres factores principales:

-   **Peso del paquete**
-   **Distancia del envío**
-   **Impuestos del servicio**

Deberás construir diferentes **métodos independientes**
que luego serán ensamblados para resolver el problema completo.

Cada parte del cálculo debe implementarse en **métodos separados**.

------------------------------------------------------------------------

# Flujo general del programa

El programa debe seguir este flujo:

1.  Solicitar al usuario el **peso del paquete**
2.  Solicitar al usuario la **distancia del envío**
3.  Calcular el **costo por peso**
4.  Calcular el **costo por distancia**
5.  Calcular el **impuesto**
6.  Calcular el **costo total del envío**
7.  Mostrar un **resumen del envío**

Cada uno de estos pasos debe implementarse utilizando **métodos
independientes**.

------------------------------------------------------------------------

# Módulo 1 -- Cálculo del costo por peso

El costo depende del peso del paquete.

  Peso del paquete   Costo
  ------------------ ---------
  0 -- 1 kg          \$5000
  1 -- 5 kg          \$10000
  Más de 5 kg        \$15000

El método debe:

-   recibir el **peso**
-   determinar el costo correspondiente
-   **retornar el valor del costo**

Firma sugerida:

``` java
public static double calcularCostoPeso(double peso)
```

------------------------------------------------------------------------

# Módulo 2 -- Cálculo del costo por distancia

El costo también depende de la distancia del envío.

  Distancia       Costo
  --------------- ---------
  0 -- 50 km      \$3000
  50 -- 200 km    \$7000
  Más de 200 km   \$12000

El método debe:

-   recibir la **distancia**
-   determinar el costo correspondiente
-   **retornar el valor del costo**

Firma sugerida:

``` java
public static double calcularCostoDistancia(double distancia)
```

------------------------------------------------------------------------

# Módulo 3 -- Cálculo del impuesto

El servicio tiene un **impuesto del 19%** sobre el costo base.

El **costo base** se calcula así:

    costoPeso + costoDistancia

El método debe:

-   recibir el **costo base**
-   calcular el impuesto
-   **retornar el valor del impuesto**

Firma sugerida:

``` java
public static double calcularImpuesto(double costoBase)
```

------------------------------------------------------------------------

# Módulo 4 -- Cálculo del total del envío

El total del envío corresponde a la suma de:

    costoPeso + costoDistancia + impuesto

El método debe:

-   recibir los valores necesarios
-   calcular el total
-   **retornar el total del envío**

Firma sugerida:

``` java
public static double calcularTotal(double costoPeso, double costoDistancia, double impuesto)
```

------------------------------------------------------------------------

# Módulo 5 -- Mostrar el resumen del envío

Este método debe mostrar en pantalla:

-   Peso del paquete
-   Distancia del envío
-   Costo por peso
-   Costo por distancia
-   Impuesto
-   Total a pagar

Este método **no debe retornar ningún valor**, solo mostrar la
información.

Firma sugerida:

``` java
public static void mostrarResumen(
    double peso,
    double distancia,
    double costoPeso,
    double costoDistancia,
    double impuesto,
    double total
)
```

------------------------------------------------------------------------

# Integración final

El método `main` debe:

1.  Solicitar los datos al usuario
2.  Llamar a cada uno de los métodos
3.  Guardar los resultados
4.  Mostrar el resumen final

La idea principal del ejercicio es que cada método represente **un
módulo independiente del sistema**.

Una vez que todos los métodos estén implementados, el programa completo
funcionará como la **integración de todos los módulos**.
