---
title: Instalación
has_children: false
nav_order: 3
---
# Instalación

##### Contenidos
- [Instalación básica](#instalacion-basica)
- [Integración en ZinjaI IDE](#integracion-en-zinjaI)
 

## Instalación básica <a name ="instalacion-basica"/>

### Paso 1. Instalación de Runtime Java

**SIMAE** es una aplicación **Java**, y requiere instalar previamente el **Java Development Kit (JDK)** versión 11 o posterior.

> Para instalar Java, las principales versiones disponibles son:
> - [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
> - [OpenJDK](http://jdk.java.net/archive/)

Al estar basado en Java, **SIMAE** es compatible con **_Windows_**, **_macOS X_** y **_Linux_**, entre otras plataformas. 

Verifique que Java está funcionando en su sistema, para ello abra una consola que le permita escribir comandos:

```bash
java --version
```

Si le muestra un número de versión 11 o superior, su instalación está lista para el siguiente paso.

### Paso 2. Descarga de SIMAE

Descargar la última versión de la herramienta desde el apartado [Releases](https://github.com/tiflo-sf/simae/releases) del repositorio.

|Release|Enlace directo|Fecha de publicación|
|---|---|---|
|0.2.1\-alpha| [simae-0.2.1-alpha.zip](https://github.com/tiflo-sf/simae/releases/download/v0.2.1-alpha/simae-0.2.1-alpha.zip)| 2022\-06\-13|

Crear una carpeta para la instalación de SIMAE. La carpeta se denominará `C:\simae\` 

> **Nota:** Utilizaremos en el resto de estas instrucciones la convención MS Windows para rutas de archivos.  Si tiene OS X o GNU/Linux utilice la que corresponde a su sistema operativo.

Descomprimir el archivo `.zip` en la carpeta `C:\simae\`

Renombrar el archivo `.jar` que se encuentra en `C:\simae\` a `C:\simae\simae.jar`.


## Integración en ZinjaI (opcional) <a name="integracion-en-zinjaI"/>

El entorno integrado de desarrollo [ZinjaI](http://zinjai.sourceforge.net/) está orientado a estudiantes de programación que están tomando un curso inicial en la temática. A continuación se incluyen instrucciones para integrar la herramienta **SIMAE** en el [IDE ZinjaI](http://zinjai.sourceforge.net/).

Básicamente, se configura una macro de manera que el código fuente en el archivo activo se marque automáticamente con una combinación de teclas o _hotkey_.

### En ZinjaI:

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
Comando: java -jar c:\simae\simae.jar "${CURRENT_SOURCE}" -sl=es
Directorio de trabajo: vacio (no escribir nada)
Acción antes de ejecutar: Guardar el fuente actual
Ejecución asíncrona: NO
Salida (std y err): Ocultas
Acción luego de ejecutar: Recargar fuente actual
Mostrar en la barra de herramientas: SI
````

Finalmente, la macro se encuentra agregada al IDE.

![Pestaña de ZinjaI con macros añadidas](https://user-images.githubusercontent.com/42981462/175972523-b1d526d3-3f07-47a2-89b4-4497816c8647.png)


