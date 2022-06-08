---
title: Instalación
has_children: false
nav_order: 3
---
# Instalación

##### Contenidos
- [Instalación básica](#instalacion-basica)
- [Integración en ZinjaI IDE](#integracion-en-zinjaI)
- [Instrucciones de compilación](#instrucciones-de-compilacion)
 

## Instalación básica <a name ="instalacion-basica"/>

Descargar la última versión de la herramienta (archivo `.jar`) desde el apartado [Releases](https://github.com/tiflo-sf/simae/releases) del repositorio.

**SIMAE** es una aplicación **Java**, y requiere instalar previamente el **Java Developers Kit (JDK)** versión 11 o posterior.

> Para instalar Java, las principales versiones disponibles son:
> - [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
> - [OpenJDK](http://jdk.java.net/archive/)

Al estar basado en Java, **SIMAE** es compatible con **_Windows_**, **_macOS X_** y **_Linux_**, entre otras plataformas. 

## Integración en ZinjaI <a name="integracion-en-zinjaI"/>

El entorno integrado de desarrollo [ZinjaI](http://zinjai.sourceforge.net/) está orientado a estudiantes de programación que están tomando un curso inicial en la temática. A continuación se incluyen instrucciones para integrar la herramienta **SIMAE** en el [IDE ZinjaI](http://zinjai.sourceforge.net/).

Básicamente, se configura una macro de manera que el código fuente en el archivo activo se marque automáticamente con una combinación de teclas o _hotkey_.

### En ZinjaI:

0) Guardar el jar en un lugar accesible

Se propone como paso cero guardar el .jar generado en el título anterior en `C:\Simae` o `/home/simae` con el nombre `simae.jar` de manera que se pueda acceder fácilmente en la configuración de la macro.

1) Agregar hotkey

Dentro de las opciones desplegables en la parte superior:

```
Archivo->Preferencias...
```

* En las opciones de la izquierda presionar General
* Presionar Personalizar atajos de teclado
* En el buscador escribir "herramienta"
* Hacer click en el botón "..." a la derecha de "Herramientas -> Herramientas Personalizables -> 0
* Presionar las teclas que se quieran usar como hotkey (se recomienda la combinación Control + Shift + A)
* Presionar aceptar y no salir del menú preferencias

2) Agregar al menú las herramientas

* En las opciones de la izquierda presionar Barras de herramientas.
* Activar la opción "Herramientas".
* Presionar modificar, buscar la opción "0:" y activarla si no está activada.
* Aceptar, Aceptar

3) Agregar una "Herramienta personalizable"

Dentro de las opciones desplegables en la parte superior:

```
Herramientas->Herramientas Personalizables->Configurar (generales)...
```

Y para agregar la macro usamos esta configuración:

```
Nombre: simae
Comando: java -jar <DirecciónDeSIMAE> "${CURRENT_SOURCE}"
Directorio de trabajo: vacio (no escribir nada)
Acción antes de ejecutar: Guardar el fuente actual
Ejecución asíncrona: NO
Salida (std y err): Ocultas
Acción luego de ejecutar: Recargar fuente actual
Mostrar en la barra de herramientas: SI
````

**IMPORTANTE: reemplazar <DirecciónDeSIMAE> por la dirección donde se encuentra el software. En caso de cumplir el paso 0 será `C:/simae/simae.jar` o `/home/simae/simae.jar`**

Finalmente, la macro se encuentra agregada al IDE.

![Pestaña de ZinjaI con macros añadidas](https://gitlab.com/Patacon/patacon.gitlab.io/-/raw/main/images/simae-macro.png)


## Instrucciones de compilación <a name="instrucciones-de-compilacion"/>

### Construcción <a name="Construccion"/>
0. Instalar dependencias
```shell=
sudo apt install git
sudo apt install openjdk-11-jre-headless
```

1. Clonar proyecto
```shell=
git clone https://github.com/tiflo-sf/simae
cd SIMAE
```
2. Ejecutar build
```shell=
gradle build
```

### Ejecución <a name="Ejecucion"/>

1. Clonar proyecto
```shell=
git clone https://github.com/tiflo-sf/simae
cd SIMAE
```
2. Ejecutar run
```shell=
gradle run
```

### Producción de JAR <a name="Produccion-de-JAR"/>

1. Clonar proyecto
```shell=
git clone https://github.com/tiflo-sf/simae
cd SIMAE
```
2. Ejecutar shadowJar
```shell=
gradle shadowJar
```

*El jar se generará en `simae/build/libs` con el nombre `simae-all`*


### IntelliJ Idea IDE para compilar <a name="IntelliJ-Idea-IDE-para-compilar"/>

1. Dentro de un terminal instalar Intellij Idea 
```shell=
sudo snap install intellij-idea-ultimate --classic
```
2. Activar IntelliJ
3. Clonar repositorio
```shell=
git clone https://github.com/tiflo-sf/simae
cd SIMAE
```
4. Dentro de IntelliJ ir a Open y seleccionar el proyecto
    ![](https://i.imgur.com/OO64PeR.png)
5. Abrir proyecto como Gradle Project e indicar que se confía en el mismo.
6. Dentro de IntelliJ ir a Add Configuration... y crear una configuración que ejecute el comando "clean run"
    ![](https://i.imgur.com/mw6ECiq.png)
7. Presionando el botón de play o shift+F10 compilar y ejecutar la herramienta
