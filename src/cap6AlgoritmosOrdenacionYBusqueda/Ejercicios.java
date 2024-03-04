package cap6AlgoritmosOrdenacionYBusqueda;

public class Ejercicios {
    public static void main(String[] args) {
        int array [] = {-1,2,2,3,4,6,-1,5,6};
        imprimir(array, "Con duplicados:");
        imprimir(eliminarDuplicados(array), "Sin duplicados:");
        
        int array2 [] = {-1,-1,3,3,4,5,7,7,8,9,10,10,11,12,13,14,14,15,16,17,17,18,19,19,20};
        imprimir(array2, "Con duplicados ordenados:");
        imprimir(eliminarDuplicadosOrdenado(array2), "Sin duplicados ordenados:");
        
    }
    
    // *************************************************
    // Escribir un método que elimine los elementos duplicados de un array.
    public static int[] eliminarDuplicados(int array[]){
        int arraySinDuplicados[] = new int [array.length];
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if(!comprobar(arraySinDuplicados, array[i])){
                System.out.println("Elemento unico, agregado: " + array[i]);
                arraySinDuplicados[indice] = array[i];
                indice ++;
            } else{
                System.out.println("Elemento duplicado: " + array[i]);
            }
        }
        return arraySinDuplicados;
    }
    
    public static boolean comprobar(int array[], int num){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }
    // **************************************************
    
    // Escribir un método que elimine los elementos duplicados de un array ordenado.
    public static int[] eliminarDuplicadosOrdenado(int array[]){
        // Mas eficiente que cuando no estan ordenados
        int arraySinDuplicados[] = new int [array.length];
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length-1)){
                System.out.println("Agregando ultimo: " + array[i]);
                arraySinDuplicados[indice] = array[i];
                indice ++;
            } else if (array[i] != array[i+1]){
                System.out.println("No hay duplicado en el siguiente, agregando: " + array[i]);
                arraySinDuplicados[indice] = array[i];
                indice ++;
            } else{
                System.out.println("Duplicado al siguiente, array[i] = " + array[i] + " y array[i+1] = " + array[i+1]);
            }
        }
        return arraySinDuplicados; 
    }
    // **************************************************
    
    
    public static void imprimir(int [] array, String mensaje){
        System.out.println(mensaje);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
