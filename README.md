# Kata 2
__Autora__: Elena Díaz Batista  
__Enlace a video explicativo__: https://drive.google.com/file/d/1AcUqNuEk3lEerzvJBixJh3mnZIxgdKvH/view?usp=drive_link 

---

## 1. Objetivo de la entrega
El objetivo principal de esta kata es practicar cómo un programa recibe datos a través de 
streams, cómo se valida y cómo se produce una salida. El principal objetivo es entender el funcionamiento
de la entrada y salida de un programa Java y la localización de las fronteras entre datos 
externos, transformación y salida.

---

## 2. Requisitos y configuración
### Dependencias y entorno de desarrollo
__JDK__: Oracle OpenJDK 25.0.1  
__IDE Recomendado__: IntelliJ IDEA  
__Sistema de Construcción__: Maven  
__Sistema de Control de Versiones__: Git  

### Paquete base
El código fuente se encuentra en el paquete:   
software.ulpgc.katas

---

## 3. Estructura del proyecto y clases principales
Dentro del paquete principal software.ulpgc.katas nos encontramos:
- __Paquete io__: contiene la interfaz EmployeeReader y sus implementaciones FileEmployeeReader y UrlEmployeeReader
  que sirven para leer los datos de los empleados y transformarlos a un objeto valido
- __Paquete model__: contiene las clases Employee y Gender que modelan a los empleados y su género.
- __Clase Main__: permite leer desde una URL o un archivo y mostrar la información por pantalla
- __Clase Main2__: permite leer desde una URL y guardar en un archivo

---

## 4. Compilación y ejecución
Desde IntelliJ IDEA:
1. Abrir la carpeta raíz kata2 en IntelliJ IDEA.
2. Navegar a src/main/java/software/ulpgc/katas/Main.java o a src/main/java/software/ulpgc/katas/Main2.java 
3. Ejecutar la clase utilizando el shortcut Shift + F10 o el icono de ejecución del entorno.

---

## 5. Clonar
1. Abrir IntelliJ IDEA
2. Si tienes un proyecto abierto haz: File > Close Project
3. En la pantalla principal ve a: Clone Repository
4. En el campo URL introduce la dirección del repositorio
5. Haz clic en clone
6. Si es necesario verifica la configuración del JDK

---

## 6. Flujo Git y repetición
La kata se ha repetido 3 veces, visibles en las distintas ramas develop_numeroDeRepeticion

---

## 7. Verificación de funcionamiento
Se adjuntan tres imágenes, en la primera se muestra la clase Main en la que se va a leer desde un fichero,
en la segunda se muestran los datos del fihcero,
y en la tercera se muestra la salida por pantalla al ejecutar, como podemos ver el resultado es el esperado (se muestra la información de los empleados).
<img width="1385" height="297" alt="image" src="https://github.com/user-attachments/assets/5f7b0c6b-e31a-4aa1-bd5a-20849d67155e" />
<img width="1410" height="743" alt="image" src="https://github.com/user-attachments/assets/e492d0d4-c7f5-412c-b68d-4a30cfb12efd" />
<img width="805" height="682" alt="image" src="https://github.com/user-attachments/assets/1c0677e6-74e1-4a21-bb8d-6da0e3f44d87" />


