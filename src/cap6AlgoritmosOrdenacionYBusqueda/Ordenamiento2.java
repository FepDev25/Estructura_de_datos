package cap6AlgoritmosOrdenacionYBusqueda;

public class Ordenamiento2 {
    public static void main(String[] args) {
        // Ordenacion por quicksort
        double[] numeros = {6, 9, 1, 2, 8, 0, 3,-1};
        imprimirConMensaje(numeros, "Desordenado Quicksort:");
        quicksort(numeros, 0, numeros.length-1);
        imprimirConMensaje(numeros, "Ordenado Quicksort:");
        System.out.println("");
    }
    
    public static void imprimirConMensaje(double[] array, String mensaje) {
        System.out.println(mensaje);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static void imprimir(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    
    public static void quicksort(double [] array, int primero, int ultimo){
        // Para ejemplo: {6, 9, 1, 2, 8, 0, 3,-1}
        int i, j, central;
        double pivote;
        // Equivale al elemento del centro del array
        central = (primero + ultimo) / 2; // Ej: (0+7)/2 = 3
        // Entonces el pivote sera el numero cituado en el indice del central
        pivote = array[central]; // En el ejemplo: array[3] = 2
        i = primero; // i es igual a 0
        j = ultimo; // j es igual a 7
        do{
            // Mientras los elementos desde array[0]++ sean manores al pivote, incrementar
            while (array[i] < pivote) i++;
            // Mientras los elementos desde array[7]-- sean manores al pivote, decrementar
            while (array[j] > pivote) j--;
            // Lo anterior se hace para que se compruebe que el pivote es el numero central
            
            // Si se encuentran numeros desordenados entre las dos sublistas, intercambiar
            if (i <= j){
                // Se intercambia y se incrementa y decremente respectivamente
                intercambiar(array, i, j);
                i++;
                j--;
            }
        // Hacer el bucle mientras i sea menor igual a j
        // Este proceso se repite hasta que i y j se cruzan
        } while(i <= j); 
        
        if (primero < j){
            // Se realiza nuevamente quicksort con la sublista izquierda, los menores al pivote
            quicksort(array, primero, j);
        } 
        if (i < ultimo){
            // Se realiza nuevamente quicksort con la sublista derecha, los mayores al pivote
            quicksort(array, i, ultimo);
        }
    }
    
    public static void intercambiar(double[] array, int i, int j) {
        double aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
