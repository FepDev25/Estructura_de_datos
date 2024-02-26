package cap2;

public class Bolsa {
    
    static int M = 20;
    private Object [] cto;
    private int cardinal;
    private int capacidad;
    
    public Bolsa(){
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;
        System.out.println("Constructor vacio");
    }
    
    public Bolsa(Object elemento){
        System.out.println("Constructor con elemento");
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;
        agregarElemento(elemento);
    }
    
    public void agregarElemento(Object elemento){
        if (cardinal == capacidad){
            Object [] nueva = new Object[capacidad + M];
            for (int i = 0; i < capacidad; i++) {
                nueva[i] = cto[i];
            }
            cto = nueva;
            capacidad += M;
            System.gc();
        }
        cto[cardinal++] = elemento;
        System.out.println("Se ha agregado el elemento: " + elemento);
    }
    
    public boolean bolsaVacia(){
        return (cardinal == 0);
    }
    
    public boolean dentro(Object elemento){
        if (!bolsaVacia()){
            for (int i = 0; i < cardinal; i++) {
                if (cto[i] == elemento){
                    return true;
                }
            }
        }
        return false;
    }
    
    public int cuantos(Object elemento){
        int contador = 0;
        if (dentro(elemento)){
            for (int i = 0; i < cardinal; i++) {
                if (cto[i] == elemento){
                    contador += 1;
                }
            }
        }
        return contador;
    }
    
    public Bolsa unionBolsa(Bolsa b2){
        Bolsa bolsaNueva = new Bolsa();
        for (int i = 0; i < cardinal; i++) {
            bolsaNueva.agregarElemento(cto[i]);
        }
        bolsaNueva.cardinal = cardinal;
        
        for (int i = 0; i < b2.cardinal; i++) {
            bolsaNueva.agregarElemento(b2.cto[i]);
        }
        
        return bolsaNueva;
    }
    
    public void imprimirBolsa(){
        for (int i = 0; i < cardinal; i++) {
            System.out.print(cto[i] + " ");
        }
        System.out.println("");
    }
    
}
