# Actividad 7 - Tipos abstractos de datos y estructuras de datos


### Ejercicio 61

> Explique la diferencia entre **tipo abstracto de datos** (TAD) y **estructura de datos**

Un **tipo abstracto de datos** (TAD) es un modelo lógico que **define** un conjunto de datos y las **operaciones** que se pueden realizar sobre ellos, **sin especificar cómo** se implementan esas operaciones; es una **abstracción** orientada al usuario. (= "el qué")

Una **estructura de datos** es una **implementacion** concreta de un TAD que **organiza y almacena** los **datos en memoria** para facilitar su manipulación eficiente.

En resumen : **TAD** = "el qué", **estructura de datos** = "el cómo"

## 1. Listas

### Ejercicio 62

> Explique **qué es una lista** y cuáles son sus **operaciones típicas**.

Una **lista** es una **estructura de datos lineal** que **almacena elementos** en una secuencia **ordenada**.

Sus operaciones tipica incluyen **inserción** (al principio, final o en una posición específica), **eliminacion**, **busqueda**, **acceso** por índice y **recorrido** de elementos. Tambien suelen incluir operaciones para obtener el **tamaño** de la lista y **verificar** si está **vacía**.



### Ejercicio 63

> Explique las diferentes **formas** de **implementar** una **lista**.

- Lista **estática**: Una lista de **tamaño fijo**.

- Lista **dinámica**: se implementa como un array dinamico, es decir, su **tamaño** es ajustado **automaticamente** (por ej. un ArrayList).

    Algunos tipos comunes de este tipo de listas:

    - Lista **enlazada simple**: se compone de nodos, donde cada nodo contiene un dato y referencia al siguiente nodo.

    - Lista **doblemente enlazada**: igual que la lista enlazada, pero a diferencia de esta, referencia hacia el **nodo anterior** también (acceso bidireccional)

    - Lista **circular** = igual que una lista enlazada pero el ultimo nodo apunta al primero

### Ejercicio 64

> Explique las **ventajas** e **inconvenientes** del **ArrayList** frente al **LinkedList**.

**ArrayList**
- Ventajas:
    - Acceso **rapido** por **indice**
    - Mas **eficiente** para **almacenar datos consecutivos**

- Inconvenientes:
    - Inserción / eliminación de elementos **en el medio o al inicio** son operaciones **lentas** (se necesita desplazar elementos).

**LinkedList**
- Ventajas:
    - Inserción / eliminación **rapidas en cualquier posición** de la lista (no se necesita desplazar datos gracias a las refs.)
    - **No** tiene **restricciones de tamaño** (no necesita **redimensionar** su estructura)

- Inconvenientes:
    - Acceso **mas lento** por **indice**
    - Mayor **consumo de memoria** (se necesita almacenar mas referencias)
    - **Menos eficiente** para **recorrer todos los elementos** (al estar dispersos y conectados por refs. / no almacenados de manera contigua)

### Ejercicio 65

> Examine los siguientes códigos fuente e identifique la relación
entre ellos

> 1. [Collection.java](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/Collection.java)
> 2. [List.java](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/List.java)
> 3. [ArrayList.java](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/ArrayList.java)
> 4. [LinkedList.java](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/LinkedList.java)


## 2. Pilas

### Ejercicio 66

> Explique **qué es una pila** y cuáles son sus **operaciones típicas**

Una **pila** es una **estructura de datos lineal** donde el **último** elemento en ser **agregado** es el **primero** en ser **retirado**.

Operaciones típicas de una pila:

- **Push** : **inserta** un elemento en la cima
- **Pop** : **elimina** el elemento en la cima y lo devuelve
- **Size** : devuelve la **talla** de la pila
- **Top** : devuelve el primer elemento (en la cima) **sin eliminarlo**
- **isEmpty** : **verifica** si la pila está **vacía**


### Ejercicio 67

> Indique dos **aplicaciones** en que se **utilzan** pilas

Algunos ejemplos de aplicacion que hacen uso de pilas pueden ser:

- **Gestión de llamadas a funciones**: se usan en este contexto para almacenar información sobre **llamadas a funciones** comi variables locales o direcciones de retorno, permitiendo manejar la ejecución de funciones / recursividad de manera eficiente.

- **Algoritmos de busqueda en profundidad** (= depth-first search o DFS) : Las pilas se utilizan para llevar **un seguimiento** de los **nodos visitados** y controlar el proceso de exploracion en grafos/arboles.

### Ejercicio 68

> Explique la **relación** existente entre el **TAD lista** y el **TAD pila**

Podemos ver una **pila** como un tipo especializado de lista en la que la diferencia principal se encuentra en su **comportamiento específico**: el **último en ser insertado** es el **primero en salir**.

Mientras que en una **lista** se pueden **acceder y manipular** elementos en **cualquier posición**, en una **pila** solo se puede acceder al **último elemento agregado**.
