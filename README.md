# Actividad 7 - Tipos abstractos de datos y estructuras de datos

## Ejercicios

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

La relación entre estos códigos fuente es la siguiente:

- **Collection**: es la **interfaz raíz** que define operaciones básicas para **todas las colecciones**.

- **List**:  es una **interfaz** que extiende **Collection**, añadiendo métodos específicos para **listas ordenadas**.

- **ArrayList**: es una **clase** que **implementa List** usando un **array dinámico**.

- **LinkedList**: es una **clase** que **implementa List** usando una estructura de **lista enlazada**.

## 2. Pilas

### Ejercicio 66

> Explique **qué es una pila** y cuáles son sus **operaciones típicas**

Una **pila** es una **estructura de datos lineal** donde el **último** elemento en ser **agregado** es el **primero** en ser **retirado** (LIFO).

Operaciones típicas de una pila:

- **Push** : **inserta** un elemento en la cima
- **Pop** : **elimina** el elemento en la cima y lo devuelve
- **Size** : devuelve la **talla** de la pila
- **Top o Peek** : devuelve el **primer elemento** (en la cima) **sin eliminarlo**
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

### Ejercicio 69

> Examine el código fuente de las clases [Stack.java](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/Stack.java) y [Vector.java](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/Vector.java). Identifique la relación entre ellos y con ArrayList.java

La clase **Stack** en Java extiende la clase **Vector**. Esto significa que Stack hereda todas las propiedades y métodos de Vector y añade su propio comportamiento específico para implementar una estructura de datos de tipo **pila** (LIFO).

**Vector** y **ArrayList** son similares en que ambos usan una redimensión dinamica, pero **Vector** está sincronizado (= con lo cual más lento), mientras que **ArrayList** no lo está (= con lo cual más eficiente)

Nota: esto de sincronización es mas bien util para concurrencia (multi-threading), un ArrayList será menos eficiente que un Vector **en un entorno concurrente**.


### Ejercicio 70

> Ejecute y explique el siguiente código:

```
import java.util.Stack;
public class DemoPilas  {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(1);
        pila.push(2);

        System.out.println(pila);
        System.out.println(pila.peek());

        pila.pop();

        System.out.println(pila);
    }
}
```
Para ejecutar el codigo use el comando : ```cd pruebas/ && javac Main.java && java Main```

Este codigo
- Crea una pila con dos elementos **1 y 2**, con lo cual la pila despues de crearla se ve así : `[1, 2]`
- Hacemos un print de su **elemento en la cima** (**sin eliminarlo**) mediante `peek()` : devuelve  `2`
- Eliminamos el elemento en la cima ``2``(el ultimo en ser añadido) mediante `pop()`.
- Finalmente hacemos un print de la **pila**, y obtenemos esto : ``[1]``

```
Pila: [1, 2]
Peek de la pila: 2
Pila tras pop: [1]
```

## 3. Colas

### Ejercicio 71

> Explique qué es una cola y cuáles son sus operaciones típicas

Una **cola** es una **estructura de datos lineal** donde el **primer** elemento en ser **agregado** es el **primero** en ser **retirado** (FIFO).

Operaciones típicas de una cola:

- **Enqueue** : **inserta** un elemento **al final** de la cola
- **Dequeue** : **elimina** y devuelve el elemento **del frente** de la cola
- **Front o Peek** : devuelve el elemento **del frente** de la cola sin eliminarlo

Visualización
```
A B C D E F G H I

"Viene uno nuevo a la fila chicos! , se llama J "

A B C D E F G H I J
                  ^
                  J se tiene que poner al final ! (enqueue)

A B C D E F G H I J
^
A fue el primero en entrar, sale el primero ! (dequeue)


B C D E F G H I J
```

### Ejercicio 72

> Indique tipos de aplicaciones en que se utilicen colas

- Sistemas de **notificaciones y mensajería** en tiempo real: Garantizan un manejo **ordenado y eficiente** de mensajes
- Gestión de **pedidos en sistemas de e-commerce**: se utilizan para **procesar pedidos** en el **orden exacto** en que se reciben, asegurando que cada transacción se maneje de manera **justa y secuencial**, desde la confirmación del pedido hasta el envío.
- Sistemas de **impresión**: los trabajos de impresión se colocan en una cola y se procesan en **el orden de llegada**

### Ejercicio 73

> Examine el código de la clase [ArrayDeque](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/ArrayDeque.java) y explique cómo aplica la aritmética modular

El **ArrayDeque** (implementecion de **cola de doble extremo** basada en un **array redimensionable**) utiliza **aritmética modular** para implementar una estructura de datos **circular** eficiente:

- Los indices `head` y `tail` se actualizan con **operaciones modulares** al añadir o eliminar elementos.

    Por ej.: `tail = (tail + 1) & (array.length - 1)` mantiene `tail` dentro de los límites del redimensionamiento **sin desbordar**.

- Esta técnica permite "envolver" los índices, reutilizando espacios vacíos y manteniendo una estructura circular.

- Se usa en operaciones como `addFirst`, `addLast`, `removeFirst`, `removeLast`, y **cálculo de tamaño**.

Ejemplo de `addFirst` :
```
        ...
        Deque<Integer> DQ = new ArrayDeque<Integer>();

        // Add numbers to end of Deque
        DQ.addFirst(1);
        DQ.addFirst(2);
        DQ.addFirst(3);
        DQ.addFirst(4);

        System.out.println("Deque: " + DQ);
```
Output ```Deque: [4, 3, 2, 1]``` (añadimos elementos al principio en un array redimensionado automaticamente)

[Fuente del ejemplo](https://www.geeksforgeeks.org/deque-addfirst-method-in-java-with-examples/)

### Ejercicio 74

> Ejecute y explique el siguiente código, y compare su comportamiento con el programa del [ejercicio 70](#ejercicio-70)

```
import java.util.ArrayDeque;

public class DemoColas
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> cola = new ArrayDeque<>();

        cola.add(1);
        cola.add(2);

        System.out.println(cola);
        System.out.println(cola.peek());
        System.out.println(cola.poll());
        System.out.println(cola);
    }
}
```

Para ejecutar el codigo use el comando : ```cd pruebas/ && javac Main.java && java Main```


Este codigo
- Crea una cola (**ArrayDeque**) con dos elementos **1 y 2**, con lo cual la cola despues de crearla se ve así : `[1, 2]`
- Hacemos un print de su **elemento del frente** (**sin eliminarlo**) mediante `peek()` : devuelve  `1`
- Eliminamos **primer elemento / del frente** ``1``(el primero en ser añadido) mediante `poll()`.
- Finalmente hacemos un print de la **cola**, y obtenemos esto : ``[2]``

```
Cola: [1, 2]
Peek de la cola: 1
1                        <- el elemento eliminado con poll()
Cola tras poll: [2]
```

La diferencia con el [ejercicio 70](#ejercicio-70) donde haciamos lo mismo con pilas, es que, como vemos, en las colas (**FIFO**) el **primer elemento en ser añadido** ha sido el **primer elemento en ser eliminado**, mientras que en las pilas (**LIFO**) el **ultimo elemento en ser añadido** fue el **primer elemento en ser eliminado**.