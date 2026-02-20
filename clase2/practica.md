# Ejercicio Guiado: Flujo básico de trabajo con Git y GitHub

## Objetivo del ejercicio
Practicar el flujo real de trabajo utilizado en proyectos de software con Git y GitHub desde la terminal de Visual Studio Code, aprendiendo a:

- Crear un repositorio remoto desde cero.
- Enlazarlo con un repositorio local.
- Trabajar con ramas.
- Fusionar cambios y subirlos al repositorio remoto.

---

## Escenario de trabajo

El estudiante trabajará con una carpeta local que contiene un archivo de texto:

mi-primer-repo/
└── notas.txt

Contenido inicial del archivo `notas.txt`:

Este archivo contiene mis primeras notas con Git.

---

## PARTE 1 — Crear un repositorio en GitHub desde cero

### Paso 1. Crear el repositorio remoto (en GitHub)

1. Ingresar a GitHub.
2. Clic en **New repository**.
3. Configurar:
   - Repository name: `mi-primer-repo`
   - Visibility: Public o Private
   - No marcar *Initialize with README*
4. Crear el repositorio.

Al finalizar, GitHub mostrará una pantalla con los comandos necesarios para enlazar un repositorio local con el repositorio remoto. Esos comandos se usarán más adelante.

---

## PARTE 2 — Enlazar el repositorio remoto con uno local

### Paso 2. Abrir la carpeta del proyecto en VS Code

1. Abrir Visual Studio Code.
2. Ir a **File → Open Folder**.
3. Seleccionar la carpeta `mi-primer-repo`.

---

### Paso 3. Abrir la terminal integrada en VS Code

Desde VS Code, abrir la terminal de cualquiera de estas formas:

- Menú: **Terminal → New Terminal**
- Atajo de teclado:
  - Windows / Linux: `Ctrl + Shift + ñ`
  - macOS: `Cmd + ñ`

La terminal se abrirá en la parte inferior y quedará ubicada directamente en la carpeta del proyecto.

---

### Paso 4. Inicializar Git en el proyecto local

```bash
git init
```
Inicializa un repositorio Git en la carpeta actual, creando la carpeta oculta .git.

### Paso 5. Verificar el estado del repositorio
```bash
git status
```
Muestra el estado de los archivos y permite ver si hay archivos sin seguimiento.

### Paso 6. Agregar el archivo al área de preparación (staging)
```bash
git add notas.txt
```
Indica a Git que el archivo debe incluirse en el próximo commit.

### Paso 7. Crear el primer commit
```bash
git commit -m "Primer commit: archivo notas.txt"
```
Guard un punto de control con el estado actual del archivo.
### Paso 8. Enlazar el repositorio local con el remoto y subir los cambios
Los siguientes comandos aparecen automáticamente en GitHub justo después de crear el repositorio remoto. Debes copiarlos desde allí y ejecutarlos en la terminal:
```bash
git branch -M main
git remote add origin https://github.com/USUARIO/mi-primer-repo.git //esta línea cambia con el nombre y usuario de la cuenta github
git push -u origin main
```
Estos comandos realizan lo siguiente:

* Cambian el nombre de la rama principal a `main.`

* Enlazan el repositorio local con el repositorio remoto llamado `origin.`

* Suben el primer commit al repositorio remoto.


## PARTE 3 — Crear una rama y modificar el archivo
### Paso 9. Crear y cambiar a una nueva rama
```bash
git checkout -b rama-edicion
```
Crea una nueva rama y se cambia a ella automáticamente.

### Paso 10. Modificar el archivo `notas.txt`
Agregar una nueva línea al archivo:

Este texto fue agregado desde una nueva rama.
### Paso 11. Verificar los cambios
```bash
git status
```
Confirma que el archivo fue modificado en la rama actual.
### Paso 12. Preparar y confirmar los cambios
```bash
git add notas.txt
git commit -m "Edición del archivo desde rama-edicion"
```
Guarda los cambios realizados en la nueva rama.
## PARTE 4 — Fusionar ramas y subir los cambios
### Paso 13. Volver a la rama principal
```bash
git checkout main
```
Cambia nuevamente a la rama principal.
### Paso 14. Fusionar la rama secundaria con la principal
```bash
git merge rama-edicion
```
Integra los cambios realizados en `rama-edicion` dentro de la rama `main.`

### Paso 15. Subir los cambios finales al repositorio remoto
```bash
git push origin main
```
Actualiza el repositorio remoto con la versión final del proyecto