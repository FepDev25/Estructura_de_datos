package cap6AlgoritmosOrdenacionYBusqueda;

public class AlgOrdenacionYBusqueda {
    // La ordenación o clasificación de datos (sort, en inglés) es una operación 
    // consistente en disponer un conjunto —estructura— de datos en algún determinado orden 
    // con respecto a uno de los campos de los elementos del conjunto.
    public static void main(String[] args) {
        // Ordenacion por intercambio (burbuja). Menos eficiente pero simple
        int [] numeros = {6,8,1,2,3,5,1};
        imprimirConMensaje(numeros, "Desordenado:");
        burbuja(numeros);
        imprimirConMensaje(numeros, "Ordenado:");
        
        
    }
    
    
    
    public static void imprimirConMensaje(int [] array, String mensaje){
        System.out.println(mensaje);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    // Metodo Burbuja
    public static void burbuja(int [] array){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    System.out.println("Cambio: " + array[i] + " es mayor que " + array[j]);
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                    contador++;
                }
            }
        }
        System.out.println("Pasadas: " + contador);
    }
}