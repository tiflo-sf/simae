---
title: Funcionamiento
has_children: false
nav_order: 2
---
# Funcionamiento

## ¿Qué hace SIMAE?

A continuación se presenta un ejemplo del funcionamiento de la herramienta **SIMAE**. 

Dado el siguiente archivo de entrada, denominado `Nodo.java`

```java {.line-numbers}
import java.util.List;
import java.util.ArrayList;

public class Nodo {
    private String etiqueta;
    private List<Nodo> vecinos = new ArrayList<Nodo>();
    private boolean visitado = false;

    void dfs() {
        visitado = true;
        for (Nodo vecino : vecinos) {
            if (!vecino.visitado) {
                vecino.dfs();
            }
        }
    }
}
```

Este código fuente presenta diferentes estructuras gramaticales en forma anidada, en particular contiene: 
- definición de la clase `Nodo`
  * definición del método `dfs()`
    - estructura de control iterativa `for`
      * estructura de control condicional `if`

Al procesar el archivo `Nodo.java` con **SIMAE**, el código del archivo es modificado agregando marcas en forma de comentarios que describen su estructura.

La salida obtenida para el archivo anterior será:

```java {.line-numbers}
import java.util.List;
import java.util.ArrayList;

public class Nodo /*/CIERRA EN LINEA 17/*/{
    private String etiqueta;
    private List<Nodo> vecinos = new ArrayList<Nodo>();
    private boolean visitado = false;

    void dfs()/*/CIERRA EN LINEA 16/*/ {
        visitado = true;
        for (Nodo vecino : vecinos)/*/CIERRA EN LINEA 15/*/ {
            if (!vecino.visitado)/*/CIERRA EN LINEA 14/*/ {
                vecino.dfs();
            }/*/CIERRA if (!vecino.visitado) DE LINEA 12/*/
        }/*/CIERRA for (Nodo vecino : vecinos) DE LINEA 11/*/
    }/*/CIERRA void dfs() DE LINEA 9/*/
}/*/CIERRA class Nodo DE LINEA 4/*/
```

Como puede leerse, las marcas insertadas describen las líneas de apertura y cierre de las diferentes estructuras gramaticales.

Para leer las marcas en el código, el programador ciego utiliza un editor de texto (ya sea genérico o como parte de un IDE) junto con el lector de pantalla que emplea habitualmente. El lector de pantalla traduce a voz el contenido de la línea de código activa, indicando su número de línea, de manera que las marcas brindan información contextual asistiendo al programador para posicionarse, navegar e interpretar el código. 

> **Importante:** En el lenguaje Java, el delimitador utilizado para indicar el inicio y fin de las marcas es `/*/`. Para utilizar **SIMAE** el programador debe evitar rigurosamente incluir comentarios delimitados con `/*/`, ya que los mismos (si existieran) serán eliminados automáticamente por la herramienta antes de marcar el archivo de entrada. 

## Lenguajes soportados

La herramienta soporta el marcado y desmarcado de Java, C++ y Python, y se planifica incorporar otros como R, Go, C# y Javascript.

## Descripción técnica

> _En construcción, próximamente encontrará más detalles técnicos aquí..._

Para generar la herramienta se utilizó el lenguaje de programación Java con una interfaz gráfica utilizando el paquete JavaFX. Se utilizó ANTLR como compilador de gramáticas para el marcado estructural del código fuente.
