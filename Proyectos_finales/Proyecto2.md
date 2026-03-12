# Ejercicio: Sistema de registro de ventas de una tienda

## Contexto

Una pequeña tienda desea desarrollar un programa en **Java** que permita registrar las ventas realizadas durante el día y obtener algunas estadísticas básicas sobre los precios de los productos vendidos.

El objetivo del programa es **practicar el uso de variables, tipos de datos, ciclos y programación modular**.

---

# Objetivo del ejercicio

Desarrollar un programa en Java que permita:

- Registrar los precios de varios productos vendidos
- Calcular estadísticas básicas sobre las ventas
- Mostrar un resumen final de la información registrada

El programa debe estar organizado utilizando **métodos (programación modular)**.

---

# Flujo general del programa

El programa debe seguir los siguientes pasos:

1. Solicitar al usuario **cuántos productos se vendieron**.
2. Utilizar un **ciclo** para ingresar el **precio de cada producto**.
3. A medida que se ingresan los precios, el programa debe ir calculando:
   - El **total de ventas**
   - El **precio más alto**
   - El **precio más bajo**
4. Al finalizar el ingreso de datos, el sistema debe calcular el **precio promedio**.
5. Mostrar un **resumen final de las ventas**.

---

# Datos que se deben calcular

El sistema debe calcular los siguientes valores:

- **Total vendido**
- **Precio promedio de los productos**
- **Producto más caro**
- **Producto más barato**

---

# Requisitos técnicos

El programa debe utilizar:

- **Variables** para almacenar los datos
- **Tipos de datos adecuados** (`int`, `double`, etc.)
- **Ciclos** (`for` o `while`) para ingresar múltiples productos
- **Condicionales** para determinar el precio mayor y menor
- **Métodos** para dividir el programa en partes más pequeñas

---

# Ejemplo de ejecución
```text
¿Cuántos productos se vendieron?
4

Ingrese el precio del producto 1:
12000

Ingrese el precio del producto 2:
8500

Ingrese el precio del producto 3:
23000

Ingrese el precio del producto 4:
15000

----- RESUMEN DE VENTAS -----

Total vendido: 58500
Precio promedio: 14625
Producto más caro: 23000
Producto más barato: 8500
```


---

# Reglas del ejercicio

- Cada tarea importante del programa debe resolverse en **un método diferente**.
- El método `main` solo debe encargarse de **coordinar la ejecución del programa**.
- Evite escribir todo el programa dentro de `main`.

---

# Sugerencia de modularización

Se recomienda dividir el programa en métodos similares a los siguientes:

main()
solicitarCantidadProductos()
leerPrecios()
calcularTotalVentas()
calcularPromedio()
obtenerPrecioMayor()
obtenerPrecioMenor()
mostrarResultados()



Esta es solo una **sugerencia**, usted puede proponer otras formas de modularizar el programa.

---

# Desafío adicional (opcional)

Si termina antes o desea mejorar el programa, puede agregar:

- Mostrar el **número del producto más caro**
- Validar que el **precio ingresado no sea negativo**
- Permitir registrar **otro día de ventas**