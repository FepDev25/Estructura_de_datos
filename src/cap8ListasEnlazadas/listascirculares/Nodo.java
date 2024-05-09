package cap8ListasEnlazadas.listascirculares;

public class Nodo <T>{
    T dato;
    Nodo enlace;
    
    public Nodo(T dato){
        this.dato = dato;
        this.enlace = this;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
}
