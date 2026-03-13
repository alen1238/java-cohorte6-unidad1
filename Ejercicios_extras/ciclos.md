# Guía para Elegir entre Ciclos `for` y `while`

Cuando aprendemos programación, una de las dudas más comunes es:

> **¿Debo usar `for` o `while`?**

Aunque muchas veces ambos pueden resolver el mismo problema, **cada uno es más natural en ciertos tipos de situaciones**.  
Esta guía presenta **principios prácticos** para elegir correctamente.

---

# 1. Usa `for` cuando sabes cuántas veces repetir

El ciclo `for` es ideal cuando **el número de repeticiones es conocido antes de empezar el ciclo**.

## Señales en el enunciado

Si el problema dice frases como:

- "del 1 al 10"
- "10 veces"
- "para cada elemento"
- "recorrer una lista"
- "los primeros 100 números"

probablemente debes usar **`for`**.

## Ejemplo

**Problema**

Mostrar los números del 1 al 10.

# 2. Usa while cuando no sabes cuántas repeticiones habrá

El ciclo while es útil cuando la repetición depende de una condición que puede cambiar durante la ejecución.

Señales en el enunciado

"hasta que"

"mientras"

"seguir intentando"

"hasta que el usuario ingrese..."

"hasta encontrar..."

Estas frases suelen indicar while.

Ejemplo

Problema

Pedir una contraseña hasta que sea correcta.



# Serie de Ejercicios: Ciclos `while` y `for`

Esta serie de ejercicios está diseñada para **practicar el uso de ciclos `for` y `while`** de forma progresiva.  
Cada ejercicio incluye **preguntas guía** para ayudar a razonar antes de escribir el código.

---

# Ejercicio 1 — Contar del 1 al 10

## Enunciado
Escribe un programa que muestre en pantalla los números **del 1 al 10** en orden.

## Preguntas guía

- ¿Sabes exactamente cuántas veces debe repetirse el ciclo?
- Si conoces el número exacto de repeticiones, ¿qué tipo de ciclo suele ser más apropiado?
- ¿Cuál sería la **variable de control** del ciclo?
- ¿Cuál es su **valor inicial**?
- ¿Cuál es la **condición para que el ciclo continúe**?
- ¿Cómo se **actualiza la variable** en cada iteración?

## Objetivo conceptual

- Identificar cuándo utilizar un **ciclo `for`**.

---

# Ejercicio 2 — Contar del 10 al 1

## Enunciado
Escribe un programa que imprima los números **del 10 al 1** en orden descendente.

## Preguntas guía

- ¿El número de repeticiones es conocido desde el inicio?
- ¿La variable de control aumenta o disminuye?
- ¿Cuál sería el valor inicial?
- ¿Cuál sería la condición para detener el ciclo?
- ¿Cómo cambia la variable en cada iteración?

## Objetivo conceptual

- Uso de **ciclo `for` con decremento**.

---

# Ejercicio 3 — Mostrar números pares del 1 al 20

## Enunciado
Escribe un programa que muestre **todos los números pares entre 1 y 20**.

## Preguntas guía

- ¿Cuántos números hay entre 1 y 20?
- ¿Es necesario recorrer todos los números o podrías avanzar de otra forma?
- ¿Cuál podría ser el **incremento de la variable de control**?
- ¿Qué condición define si un número es **par**?

## Objetivo conceptual

- Control del incremento y uso de condiciones.

---

# Ejercicio 4 — Repetir un mensaje varias veces

## Enunciado
Pide al usuario un número `n` y muestra el mensaje:
```text
Estoy aprendiendo ciclos
```

exactamente `n` veces.

## Preguntas guía

- ¿Se conoce el número de repeticiones antes de comenzar el ciclo?
- ¿Qué variable representa cuántas veces se ha repetido el mensaje?
- ¿Cuál será el valor inicial de esa variable?
- ¿Cuál es la condición que indica cuándo detener el ciclo?

## Objetivo conceptual

- Uso de ciclos con **repeticiones definidas por el usuario**.

---

# Ejercicio 5 — Sumar números del 1 al 100

## Enunciado
Escribe un programa que calcule la **suma de todos los números del 1 al 100**.

Ejemplo de salida:
```text
La suma es: 5050
```

## Preguntas guía

- ¿Cuántas veces debe ejecutarse el ciclo?
- ¿Qué variable almacenará la **suma acumulada**?
- ¿Cuál será su valor inicial?
- ¿Qué ocurre con la suma en cada iteración?

## Objetivo conceptual

- Introducir la idea de **acumulador**.

---

# Ejercicio 6 — Adivinar un número

## Enunciado
El programa tiene un número secreto (por ejemplo `7`).  
El usuario debe seguir ingresando números hasta adivinarlo.

Cuando lo adivine, el programa debe mostrar:
```text
¡Correcto!
```

## Preguntas guía

- ¿Sabes cuántas veces el usuario intentará adivinar?
- Cuando no se conoce el número de repeticiones, ¿qué ciclo es más conveniente?
- ¿Cuál sería la **condición para que el ciclo continúe**?
- ¿Qué variable cambia en cada intento?

## Objetivo conceptual

- Identificar cuándo usar **`while`**.

---

# Ejercicio 7 — Sumar números hasta que el usuario diga 0

## Enunciado
Pide números al usuario y **súmalos**.

El programa debe detenerse cuando el usuario ingrese **0**.

## Preguntas guía

- ¿Se conoce cuántos números ingresará el usuario?
- ¿Qué valor indica que el ciclo debe terminar?
- ¿Qué variable almacenará la suma?
- ¿Cuándo debe actualizarse la suma?

## Objetivo conceptual

- Uso de **condición de parada controlada por el usuario**.

---

# Ejercicio 8 — Tabla de multiplicar

## Enunciado
Pide al usuario un número y muestra su **tabla de multiplicar del 1 al 10**.

Ejemplo:
```text
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
```

## Preguntas guía

- ¿Cuántas operaciones deben hacerse?
- ¿Qué variable representa el multiplicador?
- ¿Cuál es el rango de valores que debe recorrer?
- ¿Qué ciclo se ajusta mejor a este problema?

## Objetivo conceptual

- Uso de **ciclo `for` para recorridos conocidos**.

---

# Ejercicio 9 — Factorial de un número

## Enunciado
Pide al usuario un número `n` y calcula su **factorial**.

Ejemplo:
```text
5! = 120
```

## Preguntas guía

- ¿Cuántas multiplicaciones deben realizarse?
- ¿Qué variable almacenará el resultado acumulado?
- ¿Cuál es el valor inicial adecuado?
- ¿Qué operación se realiza en cada iteración?

## Objetivo conceptual

- Uso de **acumulador multiplicativo**.

---

# Ejercicio 10 — Validar contraseña

## Enunciado
El usuario debe ingresar la contraseña correcta:
```text
python123
```

El programa seguirá pidiendo la contraseña **hasta que sea correcta**.

## Preguntas guía

- ¿Se conoce cuántos intentos hará el usuario?
- ¿Qué condición determina que el ciclo termine?
- ¿Qué tipo de ciclo es más apropiado?
- ¿Qué variable almacena la entrada del usuario?

## Objetivo conceptual

- Uso de **`while` para validación**.

---

# Ejercicio 11 — Promedio de notas

## Enunciado
Un profesor desea calcular el promedio de **5 notas** ingresadas por el usuario.

## Preguntas guía

- ¿Se conoce cuántas notas se deben ingresar?
- ¿Qué variable almacenará la suma de las notas?
- ¿Cuándo se calcula el promedio?
- ¿Cuál sería la fórmula del promedio?

## Objetivo conceptual

- Uso de ciclos para **procesar datos repetitivos**.

---

# Ejercicio 12 — Menú interactivo

## Enunciado
Crear un programa que muestre el siguiente menú hasta que el usuario elija salir.
```text
1 Saludar

2 Mostrar fecha

3 Salir
```

## Preguntas guía

- ¿Se conoce cuántas veces se mostrará el menú?
- ¿Qué opción indica que el programa debe terminar?
- ¿Qué ciclo permite repetir indefinidamente hasta que ocurra una condición?
- ¿Dónde se debe pedir la opción al usuario?

## Objetivo conceptual

- Uso de **`while` para programas interactivos**.

