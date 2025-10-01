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

javac ContainerStacking.java

### Ejecución

java ContainerStacking <fichero_entrada>

'''bash
<fichero_entrada> → Archivo .txt con la definición de los contenedores.

'''

Ejemplo:

java OrdenacionContenedores contenedores.txt
