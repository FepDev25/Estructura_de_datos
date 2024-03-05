package cap8ListasEnlazadas;

public class Nodo <T>{
    T dato;
    Nodo enlace;
    
    public Nodo(T dato){
        this.dato = dato;
        this.enlace = null;
    }
    
    public Nodo(T dato, Nodo enlace){
        this.dato = dato;
        this.enlace = enlace;
    }
    
    public T getDato(){
        return this.dato;
    }
    
    public Nodo getEnlace(){
        return this.enlace;
    }
    
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}
