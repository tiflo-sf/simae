# 0. Clonar el repositorio

1. Abrir una terminal Powershell.
2. Dirigirse a la carpeta donde se quiera clonar el repositorio.
3. Clone el repositorio con: 

```
git clone https://github.com/tiflo-sf/simae
cd simae
```

# 1. Construcción del JAR

Debe tener instalado JDK de acuerdo a las instrucciones del apendice A

Ejecute gradle con la instrucción shadowJar:

```
.\gradlew clean shadowJar
```

El jar fue generado en el directorio **simae\build\libs**

# 2. Construir .exe

Debe estar instalado el programa Launch4j de acuerdo al apendice B.

Ejecutar Launch4j para generar el archivo .exe

```
java -jar "C:\Program Files (x86)\Launch4j\launch4j.jar" launch4j\simae.xml 
```

El archivo ejecutable generado es: **launch4j\output\simae.exe**

# 3. Construir JRE para el instalador

1. Ejecutar jdeps para obtener las dependencias:

```
jdeps --list-deps --ignore-missing-deps .\simae\build\libs\simae-0.2.1-alpha.jar
```

Lo cual muestra las siguientes dependencias:

```
   java.base
   java.desktop
   java.logging
   java.prefs
   java.scripting
   java.xml
   jdk.unsupported
```

2. Generar JRE

```
cd .\launch4j\output
jlink.exe --compress=2 --module-path ..\jmods --add-modules "java.base,java.desktop,java.logging,java.prefs,java.scripting,java.xml,jdk.unsupported" --output jre
```

# 4. Construir el instalador

Debe tener instalado Inno Setup de acuerdo a las instrucciones del apendice C



# Apendice A: Instalar JDK

Si tiene Java 11 instalado, no necesita instalarlo. Si tiene otra versión debe eliminarla antes de continuar.

1. Abrir una terminal Powershell con privilegios de administrador.
2. Instale jdk con:

```
choco install openjdk11 -y
```

Si tenia alguna terminal abierta, cierrela y vuelvala a abrir.

# Apendice B: Instalar launch4j

# Apendice C: Instalar Inno Setup

# Apendice D: Instalar Chocolatey

