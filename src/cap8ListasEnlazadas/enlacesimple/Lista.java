package cap8ListasEnlazadas.enlacesimple;

public class Lista<T> {

    private Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public void agregarPrimero(T dato) {
        if (this.primero == null) {
            this.primero = new Nodo(dato);
        } else {
            Nodo aux = this.primero;
            primero = new Nodo(dato);
            primero.enlace = aux;
        }
    }

    public void agregarUltimo(T dato) {
        if (this.primero == null) {
            this.primero = new Nodo(dato);
        } else {
            Nodo aux = this.primero;
            while (aux.enlace != null) {
                aux = aux.enlace;
            }
            aux.enlace = new Nodo(dato);
        }
    }

    public void agregarConIndice(T dato, int indice) {
        if (indice < 0) {
            throw new IllegalArgumentException("Índice no puede ser negativo");
        }
        if (indice == 0) {
            agregarPrimero(dato);
        } else {
            Nodo nuevoNodo = new Nodo(dato);
            Nodo aux = this.primero;
            for (int i = 0; i < indice - 1 && aux != null; i++) {
                aux = aux.enlace;
            }
            if (aux == null) {
                throw new IndexOutOfBoundsException("Índice fuera de límites");
            }
            nuevoNodo.enlace = aux.enlace;
            aux.enlace = nuevoNodo;
        }
    }

    public void eliminar(T dato) {
        if (this.primero != null) {
            if (this.primero.dato.equals(dato)) {
                this.primero = this.primero.enlace;
            } else {
                Nodo aux = this.primero;
                while (aux.enlace != null && !aux.enlace.dato.equals(dato)) {
                    aux = aux.enlace;
                }
                if (aux.enlace != null && aux.enlace.dato.equals(dato)) {
                    aux.enlace = aux.enlace.enlace;
                }
            }
        }
    }
    
    public Nodo buscarElemento(T dato){
        Nodo indice;
        for(indice = this.primero ; indice != null ; indice = indice.enlace){
            if (indice.dato == dato){
                System.out.println("Elemento encontrado");
                return indice;
            }
        }
        System.out.println("El elemento no existe");
        return null;
    }
    
    public Nodo buscarElementoEnPosicion(int posicion){
        Nodo indice;
        int i;
        if (posicion < 0){
            return null;
        }
        indice = primero;
        for (i = 1; (i < posicion) && (indice != null); i ++){
            indice = indice.enlace;
        }
        return indice;
    }
    
    public boolean esVacia(){
        return this.primero == null;
    }
    
    public void anular(){
        this.primero = null;
    }
   

    public void imprimir() {
        Nodo aux = this.primero;
        System.out.print("[ ");
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.enlace;
        }
        System.out.print("]");
        System.out.println();
    }

}
