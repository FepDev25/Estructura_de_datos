package cap8ListasEnlazadas.enlacedoble;

public class ListaDoble<T> {

    private Nodo cabeza; // Nodo que representa la cabeza de la lista

    // Constructor de la clase ListaDoble
    public ListaDoble() {
        this.cabeza = null; // Inicializa la cabeza como nulo al crear una nueva lista
    }

    // Método para insertar un nuevo nodo al principio de la lista
    public Nodo insertarCabeza(T entrada) {
        Nodo nuevo = new Nodo(entrada); // Crea un nuevo nodo con el valor de entrada
        nuevo.adelante = cabeza; // El nuevo nodo apunta hacia la cabeza actual de la lista

        if (cabeza != null) {
            cabeza.atras = nuevo; // Si la cabeza no es nula, el nodo anterior a la cabeza apunta al nuevo nodo
        }

        cabeza = nuevo; // Actualiza la cabeza para que apunte al nuevo nodo
        return nuevo; // Retorna el nodo recién insertado
    }

    // Método para insertar un nuevo nodo después de un nodo dado
    public Nodo insertarDespues(Nodo anterior, T entrada) {
        Nodo nuevo = new Nodo(entrada); // Crea un nuevo nodo con el valor de entrada
        nuevo.adelante = anterior.adelante; // El nuevo nodo apunta al nodo siguiente al nodo anterior

        if (anterior.adelante != null) {
            anterior.adelante.atras = nuevo; // Si el nodo anterior no es el último nodo, el nodo siguiente al nuevo nodo apunta al anterior nodo
        }
        
        anterior.adelante = nuevo; // El nodo anterior apunta al nuevo nodo como su nodo siguiente
        nuevo.atras = anterior; // El nuevo nodo apunta al nodo anterior como su nodo anterior
        return anterior; // Retorna el nodo anterior
    }

    // Método para eliminar un nodo que contiene un elemento específico
    public void eliminar(T elemento) {
        Nodo actual = cabeza; // Inicializa el nodo actual como la cabeza de la lista
        boolean encontrado = false; // Bandera para indicar si se ha encontrado el elemento a eliminar

        // Recorre la lista hasta que se encuentra el elemento o se llega al final de la lista
        while (actual != null && !encontrado) {
            encontrado = actual.dato.equals(elemento); // Compara el dato del nodo actual con el elemento buscado
            if (!encontrado) {
                actual = actual.adelante; // Avanza al siguiente nodo si no se ha encontrado el elemento
            }
        }

        if (actual != null) {
            if (actual == cabeza) {
                cabeza = actual.adelante; // Actualiza la cabeza si el nodo a eliminar es la cabeza
                if (cabeza != null) {
                    cabeza.atras = null; // Establece el nodo anterior a la nueva cabeza como nulo si no es el último nodo
                }
            } else if (actual.adelante != null) {
                actual.atras.adelante = actual.adelante; // Conecta el nodo anterior al nodo siguiente del nodo a eliminar
                actual.adelante.atras = actual.atras; // Conecta el nodo siguiente al nodo anterior del nodo a eliminar
            } else {
                actual.atras.adelante = null; // Establece el nodo anterior al nodo a eliminar como el nuevo nodo final de la lista
            }
        }
    }
    
    // Método para buscar un elemento en la lista y mostrar su posición
    public void buscarLista(int destino) {
        Nodo actual = cabeza; // Inicializa el nodo actual como la cabeza de la lista
        boolean encontrado = false; // Bandera para indicar si se ha encontrado el elemento buscado
        int contador = 0; // Contador para llevar la cuenta de la posición del elemento

        // Recorre la lista hasta que se encuentra el elemento o se llega al final de la lista
        while (actual != null && !encontrado) {
            contador++; // Incrementa el contador en cada iteración
            encontrado = actual.getDato().equals(destino); // Compara el dato del nodo actual con el elemento buscado
            if (!encontrado) {
                actual = actual.adelante; // Avanza al siguiente nodo si no se ha encontrado el elemento
            }
        }

        if (actual != null) {
            System.out.println("Valor " + destino + " encontrado. Nodo N" + contador); // Muestra la posición del elemento encontrado
        } else {
            System.out.println("Elemento no encontrado"); // Muestra un mensaje si el elemento no se encuentra en la lista
        }
    }

    // Métodos getter y setter para la cabeza de la lista
    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    // Método para imprimir los elementos de la lista
    public void imprimir() {
        Nodo aux = this.cabeza; // Inicializa un nodo auxiliar como la cabeza de la lista
        System.out.print("[ ");
        while (aux != null) { // Recorre la lista mientras el nodo auxiliar no sea nulo
            System.out.print(aux.dato + " "); // Imprime el dato del nodo auxiliar
            aux = aux.adelante; // Avanza al siguiente nodo
        }
        System.out.print("]");
        System.out.println();
    }
}
