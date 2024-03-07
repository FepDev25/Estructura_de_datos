package cap8ListasEnlazadas.enlacedoble;

public class IteradorLista {
    private Nodo actual;
    
    public IteradorLista (ListaDoble ld){
        actual = ld.getCabeza();
    }
    
    public Nodo siguiente(){
        Nodo a;
        a = actual;
        if (actual != null){
            actual = actual.adelante;
        }
        return a;
    }
}
