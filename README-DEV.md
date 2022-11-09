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

1. Construir instalador

```
cd ..\..\innosetup
iscc setupscript.iss
```

El setup generado es guardado en la carpeta `output`

# Apendice A: Instalar JDK

Si tiene Java 11 instalado, no necesita instalarlo. Si tiene otra versión debe eliminarla antes de continuar.

1. Abrir una terminal Powershell con privilegios de administrador.
2. Instale jdk con:

```
choco install openjdk11 -y
```

Si tenia alguna terminal abierta, cierrela y vuelvala a abrir.

# Apendice B: Instalar launch4j
**TODO**

# Apendice C: Instalar Inno Setup

1. Abrir una terminal Powershell con privilegios de administrador
2. Instale Inno Setup con:

```
choco install innosetup -y
```

3. Dirigirse a Inicio -> Editar las variables de Entorno del Sistema
4. Presionar Variables de entorno...
5. Dentro de Variables del Sistema buscar Path y presionar Editar...
6. Agregar la ruta de Inno Setup al final de la variable (por defecto C:\Program Files (x86)\Inno Setup 6)

# Apendice D: Instalar Chocolatey

1. Abrir una terminal Powershell con privilegios de administador y ejecute:

```
Set-ExecutionPolicy AllSigned
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```

2. En una terminal cualquiera, verificar con:

```
 choco -? 
```
