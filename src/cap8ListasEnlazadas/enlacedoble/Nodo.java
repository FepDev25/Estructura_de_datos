package cap8ListasEnlazadas.enlacedoble;

public class Nodo <T>{
    T dato;
    Nodo adelante;
    Nodo atras;
    
    public Nodo(T dato){
        this.dato = dato;
        this.adelante = null;
        this.atras = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getAdelante() {
        return adelante;
    }

    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    
    
}
