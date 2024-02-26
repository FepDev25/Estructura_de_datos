package cap6AlgoritmosOrdenacionYBusqueda;

public class AlgOrdenacionYBusqueda {

    // La ordenación o clasificación de datos (sort, en inglés) es una operación 
    // consistente en disponer un conjunto —estructura— de datos en algún determinado orden 
    // con respecto a uno de los campos de los elementos del conjunto.
    public static void main(String[] args) {
        // Ordenacion por intercambio (burbuja). Menos eficiente pero simple
        int[] numeros = {6, 9, 1, 0, 8, 2, 3};
        imprimirConMensaje(numeros, "Desordenado Burbuja:");
        burbuja(numeros);
        imprimirConMensaje(numeros, "Ordenado Burbuja:");
        System.out.println("");

        // ***************************
        // Ordencion por Seleccion
        int[] numeros2 = {6, 9, 1, 0, 8, 2, 3};
        imprimirConMensaje(numeros2, "Desordenado Seleccion:");
        seleccion(numeros2);
        imprimirConMensaje(numeros2, "Ordenado Seleccion:");
        System.out.println("");

        // ***************************
        // Ordencion por Inserción
        int[] numeros3 = {6, 9, 1, 0, 8, 2, 3};
        imprimirConMensaje(numeros3, "Desordenado Inserción:");
        inserción(numeros3);
        imprimirConMensaje(numeros3, "Ordenado Inserción:");
        System.out.println("");
    }

    public static void imprimirConMensaje(int[] array, String mensaje) {
        System.out.println(mensaje);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    // Metodo Burbuja
    public static void burbuja(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    System.out.println("Intercambio: " + array[i] + " es mayor que " + array[j]);
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                    contador++;
                }
            }
        }
        System.out.println("Pasadas: " + contador);
    }

    // Metodo Seleccion
    public static void seleccion(int[] array) {
        int indiceCambio;
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            indiceCambio = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indiceCambio] > array[j]) {
                    indiceCambio = j;
                }
            }
            if (indiceCambio != i) {
                System.out.println("El menor en la pocision " + i + " es " + array[indiceCambio]);
                int aux = array[i];
                array[i] = array[indiceCambio];
                array[indiceCambio] = aux;
                contador++;
            }
        }
        System.out.println("Pasadas: " + contador);
    }
    
    // Metodo Inserción
    public static void inserción(int[] array) {
        int j, aux;
        int contador = 0;
        for (int i = 1; i < array.length; i++) {
            j = i;
            aux = array[i];
            while((j > 0) && (aux < array[j-1])){
                array[j] = array[j-1];
                j--;
            }
            array[j] = aux;
            contador++;
        }
        System.out.println("Pasadas: " + contador);
    }
}
