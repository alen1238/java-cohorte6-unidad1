# Ejercicios de Programación en Java


Estos ejercicios están diseñados para practicar **condicionales (`if`,
`switch`)**, **ciclos (`while`, `do-while`)**, y **validaciones de
datos** en Java mediante dos contextos realistas: - Un **sistema
bancario** - Un **sistema industrial de producción**

------------------------------------------------------------------------

# PARTE 1 --- SISTEMA BANCARIO

## Contexto

El Banco DevSenior está desarrollando un sistema de consola para
permitir a los clientes realizar operaciones básicas.

Datos iniciales del sistema:

-   Número de cuenta válido: **12345**
-   Clave: **2026**
-   Saldo inicial: **1,000,000**

------------------------------------------------------------------------

## Ejercicio 1 --- Validación de Login

El sistema debe permitir al usuario ingresar al sistema bancario.

### Requisitos

1.  Solicitar al usuario:

    -   Número de cuenta
    -   Clave

2.  Validar que los datos coincidan con:

    -   Cuenta: `12345`
    -   Clave: `2026`

3.  El usuario solo tiene **3 intentos** para ingresar correctamente.

4.  Si los datos son correctos:

```{=html}             
    Ingresando al sistema...
```

5.  Si falla los 3 intentos:

```{=html}
    Ha eccedido el número de intentos. Cuenta bloqueada.
```

### Conceptos que se practican

-   `while`
-   `if / else`
-   contadores
-   validación de datos

### Imagen del proceso

![Proceso de Login](images/login.png)

------------------------------------------------------------------------

## Ejercicio 2 --- Menú del Sistema

Una vez que el usuario ha iniciado sesión correctamente, el sistema debe
mostrar un menú de operaciones.

### Menú

    1. Consultar saldo
    2. Transferir dinero
    3. Retirar dinero
    4. Salir

### Requisitos

-   El menú debe repetirse usando **do-while**
-   El usuario puede realizar varias operaciones hasta elegir **Salir**
-   Utilizar **switch** para controlar las opciones

### Imagen del proceso

![Menu del sistema](images/menu.png)

------------------------------------------------------------------------

## Ejercicio 3 --- Consulta de Saldo

Cuando el usuario seleccione la opción **1**, el sistema debe mostrar:

    Su saldo actual es: $________

### Requisitos

-   No modificar el saldo
-   Solo mostrar el valor actual

### Imagen del proceso

![Consulta de saldo](images/saldo.png)

------------------------------------------------------------------------

## Ejercicio 4 --- Transferencia Bancaria

Cuando el usuario seleccione **Transferir dinero**:

### El sistema debe solicitar

-   Número de cuenta destino
-   Monto a transferir

### Validaciones

1.  El monto debe ser **mayor que 0**
2.  El monto **no puede ser mayor al saldo disponible**

### Si la transferencia es válida

-   Descontar el monto del saldo
-   Mostrar:

```{=html}
    Transferencia realizada con éxito
    Saldo restante: $____
```
### Si la transferencia es inválida

Mostrar uno de los siguientes mensajes:

    Monto inválido

o

    Saldo insuficiente

### Imagen del proceso

![Transferencia bancaria](images/transferencia.png)

------------------------------------------------------------------------

## Ejercicio 5 --- Cierre de Operaciones

Cuando el usuario elija **Salir**, el sistema debe mostrar:

    Gracias por usar Banco DevSenior
    Saldo final: $_____
    Sesión finalizada

### Imagen del proceso

![Cierre de sesion](images/cierre.png)

------------------------------------------------------------------------

# PARTE 2 --- SISTEMA INDUSTRIAL

## Contexto

Una empresa tiene una **planta automatizada de producción de piezas
metálicas**.

El sistema controla el uso de materia prima y la producción del turno.

Datos iniciales:

-   Stock de materia prima: **500 kg**
-   Materia prima por pieza: **25 kg**
-   Producción máxima por turno: **20 piezas**

------------------------------------------------------------------------

## Ejercicio 6 --- Validación de Operario

El sistema debe validar al operario antes de iniciar el turno.

### Datos válidos

-   Código de empleado: **4567**
-   Turno permitido: **1, 2 o 3**

### Requisitos

1.  Solicitar código de empleado
2.  Solicitar número de turno
3.  Permitir máximo **3 intentos**
4.  Si falla:

```{=html}
    Acceso denegado
```
### Imagen del proceso

![Login industrial](images/login-industrial.png)

------------------------------------------------------------------------

## Ejercicio 7 --- Menú de Producción

Si el operario inicia sesión correctamente:

    1. Producir piezas
    2. Ver stock de materia prima
    3. Reportar daño de máquina
    4. Cerrar turno

### Requisitos

-   Usar **do-while**
-   Permitir repetir operaciones

### Imagen del proceso

![Menu industrial](images/menu-industrial.png)

------------------------------------------------------------------------

## Ejercicio 8 --- Producción de Piezas

Si el usuario elige producir piezas:

### El sistema debe solicitar

Cantidad de piezas a fabricar.

### Cálculo

    materiaNecesaria = piezas * 25

### Validaciones

1.  Las piezas deben ser **mayores que 0**
2.  No pueden superar **20 piezas**
3.  Debe haber suficiente materia prima

### Si la producción es válida

    Producción realizada con éxito
    Stock restante: ___ kg

### Imagen del proceso

![Produccion industrial](images/produccion.png)

------------------------------------------------------------------------

## Ejercicio 9 --- Reporte de Daño

Si el operario reporta daño:

    Máquina en mantenimiento
    Producción detenida

### Requisito

Usar una variable **boolean** para controlar el estado de la máquina.

### Imagen del proceso

![Maquina en mantenimiento](images/mantenimiento.png)

------------------------------------------------------------------------

## Ejercicio 10 --- Cierre de Turno

Al cerrar el turno el sistema debe mostrar:

-   Total de piezas producidas
-   Materia prima restante
-   Estado final de la máquina

### Imagen del proceso

![Cierre de turno](images/cierre-turno.png)

------------------------------------------------------------------------

# Reto Final

Mejorar el sistema agregando:

-   Historial de operaciones
-   Validación de montos máximos
-   Registro de errores
-   Simulación de varios usuarios
