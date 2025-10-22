# 📦 Optimización de apilamiento de contenedores (Knapsack problem)

Este proyecto implementa en **Java** una variación del **algoritmo de la mochila** para resolver el problema de maximizar el número de contenedores que se pueden apilar sin superar las restricciones de peso de cada uno.  

---

## 📖 Descripción del problema

Cada contenedor está definido por dos parámetros:
- **Peso propio** (`peso`)  
- **Capacidad máxima soportada encima** (`pesoMax`)  

El objetivo es encontrar la **mayor cantidad de contenedores apilables** cumpliendo la restricción:  
> La suma de los pesos de los contenedores situados encima nunca debe superar el `pesoMax` del contenedor actual.  

---

## ⚙️ Tecnologías utilizadas
- Lenguaje: **Java 11+**  
- Herramientas: compilación estándar con `javac`  

---

## 🚀 Compilación y ejecución

### Compilación
```bash
javac ContainerStacking.java
```
### Ejecución

```bash
java ContainerStacking 
```
---

## 📂 Formato del archivo de entrada

- Para que el programa funcione es necesario que el archivo de entrada se encuentre en el mismo directorio que **el archivo .java**.
- El archivo debe llamarse **entrada.txt** y tener el siguiente formato:

  - La primera línea contiene el **número total de contenedores**.

  - Cada línea siguiente contiene un par **peso pesoMax** para cada contenedor.

- Ejemplo:

```bash
5
10 20
5 10
7 25
8 15
12 30
```

---

## 📊 Salida del programa

- El programa calcula:

  - El número máximo de contenedores que se pueden apilar.

  - Los contenedores que forman parte de la configuración óptima de apilamiento que cumple las restricciones.

- Ejemplo de salida:

```bash
Numero de contenedores: 3
Contenedor 3
Contenedor 4
Contenedor 7
```

---

## ✨ Aprendizaje

- Este proyecto me permitió:

  - Aplicar técnicas de análisis y diseño de algoritmos.

  - Implementar una variación del problema de la mochila en Java.

  - Practicar el uso de estructuras de datos y ordenación para optimizar resultados.

  - Modelar problemas reales (logística y apilamiento) mediante algoritmos clásicos.

---
 
## 👤 Autor

- Marcau Alonso Ulloa (@marcau04)
- Marcos Cámara Vicente
