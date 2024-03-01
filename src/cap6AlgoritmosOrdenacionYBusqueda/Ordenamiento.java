package cap6AlgoritmosOrdenacionYBusqueda;

public class Ordenamiento {

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

        // ***************************
        // Ordencion por Shell
        int[] numeros4 = {6, 4, 3, 5, 1, 0, 8, 10};
        imprimirConMensaje(numeros4, "Desordenado Shell:");
        shell(numeros4);
        imprimirConMensaje(numeros4, "Ordenado Shell:");
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
            while ((j > 0) && (aux < array[j - 1])) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = aux;
            contador++;
        }
        System.out.println("Pasadas: " + contador);
    }

    public static void shell(int[] array) {
        int intervalo, i, j, k;
        int n = array.length;

        // Calcula el intervalo inicial dividiendo la longitud del array entre 2
        intervalo = n / 2; // Ej: Lista de lengh 8, intervalo = 4

        // Bucle externo, itera hasta que el intervalo sea 0, es decir las divisiones, mitad, cuatro partes, ocho partes etc
        while (intervalo > 0) {
            // Bucle interno, recorre el array desde el intervalo hasta el final. En el ejemplo seria desde 4 hasta 8
            for (i = intervalo; i < n; i++) {
                j = i - intervalo; // Inicializa j en la posición anterior al intervalo. Ej: Cuando intervalo = 4, j seria: 4-4-0, 5-4=1, 6-4=2 y 7-4=3
                // Bucle interno mientras j sea mayor o igual a 0
                while (j >= 0) {
                    // Calcula la posición k. Ej: j=0,1,2,3 e intervalo=4, entonces k = 0+4=4, 1+4=5, 2+4=6 y 3+4=7.
                    // Asi se comparon todos los elementos de la mitad de la izquierda con los de la mitad de la derecha
                    // j=0 con k=4, j=1 con k=5, j=2 con k=6 y j=3 con k=7
                    k = j + intervalo;
                    // Compara los elementos en j y k, si están en el orden incorrecto, intercámbialos
                    if (array[j] <= array[k]) {
                        j -= 1; // Si los elementos se encuentran en orden, no intercambia y solo dsminuye j y cumpla la condicion
                    } else {
                        intercambiar(array, j, k); //  Si los elementos se encuentran desordenados, se intercambian
                        j -= intervalo; // Retrocede j por el intervalo
                    }
                }
            }
            // Reduce el intervalo a la mitad
            intervalo = intervalo / 2;
        }
    }

    // Función para intercambiar dos elementos en un array
    public static void intercambiar(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

}
