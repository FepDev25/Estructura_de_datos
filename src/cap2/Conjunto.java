package cap2;

public class Conjunto {
    
    static int M = 20;
    private Object [] cto;
    private int cardinal;
    private int capacidad;
    
    public Conjunto(){
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;
    }
    
    public Conjunto(Object elemento){
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;
        agregarElemento(elemento);
    }
    
    // Determinar si esta vacio
    public boolean esVacio(){
        return (cardinal == 0);
    }
    
    // Agregar elementos si n esta en el conjunto
    public void agregarElemento(Object elemento){
        if (!pertenece(elemento)){
            // Verificar pocisiones libres
            if (cardinal == capacidad){
                Object [] nuevoCto;
                nuevoCto = new Object[capacidad + M];
                for (int k = 0; k < capacidad; k++) {
                    nuevoCto[k] = cto[k];
                }
                capacidad += M;
                cto = nuevoCto;
                System.gc(); // devuelve la memoria no referenciada
            }
            cto[cardinal++] = elemento;
            System.out.println("Elemento agregado: " + elemento);
        }
    }
    
    // Retirar elementos si n esta en el conjunto
    public void retirarElemento(Object elemento){
        if (pertenece(elemento)){
            int k = 0;
            while (!cto[k].equals(elemento)){
                k ++; // Obtengo la pocision del elemento
            }
            for (; k  < cardinal; k++){
                cto[k] = cto[k+1];
            }
            cardinal --;
            System.out.println("Elemento retirado: " + elemento);
        } else{
            System.out.println("El elemento no pertenece al conjunto");
        }
    }
    
    // Buscar si un elemento pertenece al conjunto
    public boolean pertenece(Object elemento){
        int k = 0;
        boolean encontrado = false;
        while (k < cardinal && !encontrado){
            encontrado = cto[k].equals(elemento);
            k ++;
        }
        return encontrado;
    }
    
    // Obtener cardinal
    public int cardinal(){
        return this.cardinal;
    }
    
    // Union de dos conjuntos
    public Conjunto unionConjunto(Conjunto c2){
        Conjunto union = new Conjunto();
        // Copiar el primer conjunto
        for (int k = 0; k < cardinal; k++) {
            union.cto[k] = cto[k];
        }
        union.cardinal = cardinal;
        // Agregar los no incluidos del c2
        for (int k = 0; k < c2.cardinal; k++) {
            union.agregarElemento(c2.cto[k]);
        }
        System.out.println("Se han unido los conjuntos");
        
        return union;
    }
    
    public Object elemento (int n) throws Exception{
        if (n <= cardinal){
            return cto[--n];
        } else{
            throw new Exception("Fuera de rango");
        }
    }
    
    public void imprimirConjunto(){
        for (int k = 0; k < cardinal; k++) {
            System.out.print(cto[k] + " ");
        }
        System.out.println("");
    }
}
