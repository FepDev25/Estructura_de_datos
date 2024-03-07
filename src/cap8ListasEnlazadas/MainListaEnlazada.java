package cap8ListasEnlazadas;

import cap8ListasEnlazadas.enlacesimple.Lista;

public class MainListaEnlazada {
    /*
    Una colección de elementos (denominados nodos) dispuestos uno a continuación de otro, cada uno de ellos 
    conectado al siguiente por un “enlace” o “referencia”.
     Clasificacion:
    • Listas  simplemente  enlazadas. Cada nodo (elemento) contiene un único enlace que lo conecta al nodo siguiente o 
     nodo sucesor. La lista es eficiente en recorridos directos (“adelante”).
    • Listas doblemente enlazadas. Cada nodo contiene dos enlaces, uno a su nodo predecesor y otro a su nodo sucesor. 
     La lista es eficiente tanto en recorrido directo (“adelante”) como en recorrido inverso (“atrás”).
    • Lista circular simplemente enlazada. Una lista enlazada simplemente en la que el último elemento (cola) se enlaza 
      al primer elemento (cabeza) de tal modo que la lista puede ser recorrida de modo circular (“en anillo”).
    • Lista  circular  doblemente  enlazada. Una lista doblemente enlazada en la que el último elemento se enlaza al 
      primer elemento y viceversa. Esta lista se puede recorrer de modo circular (“en anillo”) tanto en dirección
      directa (“adelante”) como inversa (“atrás”). */
    
    public static void main(String[] args) {
        Lista<Integer> numeros = new Lista();
        numeros.agregarUltimo(4);
        numeros.agregarUltimo(2);
        numeros.agregarUltimo(1);
        numeros.agregarUltimo(22);
        numeros.agregarUltimo(7);
        numeros.agregarUltimo(6);
        numeros.agregarUltimo(9);
        numeros.agregarUltimo(0);
        numeros.agregarPrimero(100);
        numeros.agregarConIndice(34, 3);
        numeros.imprimir();
        numeros.eliminar(22);
        numeros.imprimir();
        numeros.buscarElemento(100);
        numeros.buscarElementoEnPosicion(3);
    }
}
