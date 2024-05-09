package cap8ListasEnlazadas.listascirculares;

public class ListaCircular <T>{
    
    private Nodo lc;
    
    public ListaCircular(){
        this.lc = null;
    }
    
    public Nodo insertar(T entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (lc != null){
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return nuevo;
    }
    
    public void eliminar(T entrada) {
    Nodo actual;
    boolean encontrado = false;
    actual = lc; // Comienza desde el primer nodo de la lista circular

    // Recorre la lista circular hasta que se encuentra el nodo con el valor de entrada
    while ((actual.enlace != lc) && (!encontrado)) {
        encontrado = (actual.enlace.dato.equals(entrada)); // Verifica si el siguiente nodo contiene el valor de entrada

        if (!encontrado) {
            actual = actual.enlace; // Avanza al siguiente nodo si no se ha encontrado el valor de entrada
        }
    }
    
    // Verifica el último nodo después de salir del bucle
    encontrado = (actual.enlace.dato.equals(entrada));

    // Si se encuentra el nodo con el valor de entrada, se procede a eliminarlo
    if (encontrado) {
        Nodo p;
        p = actual.getEnlace(); // este es el que se quiere eliminar
        
        // Caso especial: Si la lista tiene un solo nodo
        if (lc == lc.enlace) {
            lc = null; // Vacía la lista
        } else {
            // Caso general: La lista tiene más de un nodo
            // Verifica si el nodo a eliminar es el primer nodo
            if (p == lc) {
                lc = actual; // Actualiza lc para que apunte al siguiente nodo después del nodo a eliminar
            }
            actual.enlace = p.enlace; // Omite el nodo a eliminar enlazando el nodo anterior con el siguiente nodo después del nodo a eliminar
        }
    }
}


    public Nodo getLc() {
        return lc;
    }

    public void setLc(Nodo lc) {
        this.lc = lc;
    }
    
    public void imprimir() {
    if (lc == null) {
        System.out.println("La lista circular está vacía");
        return;
    }

    Nodo aux = lc;
    System.out.print("[ ");
    do {
        System.out.print(aux.dato + " ");
        aux = aux.enlace;
    } while (aux != lc);
    System.out.print("]");
    System.out.println();
}

    
}
