package cap3ArraysCadenas;

public class ArraysMultidimencionales {

    public static void main(String[] args) {
        // Los arrays multidimensionales son aquellos que tienen más de una dimensión y, en conse- cuencia, más de un índice.
        char pantalla[][];
        int puestos[][];
        double[][] matrizAux;

        pantalla = new char[80][24]; // matriz con 80 filas y 24 columnas
        puestos = new int[10][5]; // matriz de 10 filas por 5 columnas 
        final int N = 4;
        matrizAux = new double[N][N]; // matriz cuadrada de N*N elementos

        // Inicializacion
        int tabla1[][] = {{51, 52, 53}, {54, 55, 56}};
        int tabla2[][] = {{1, 2, 3},
        {4, 5, 6}};
        // Diferente numero de elementos
        double tb[][] = {{1.5, -2.5}, {5.0, -0.0, 1.5}};
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = {100, 39, 15, 78, 13};
        int[] d = {2, 1, 0, -1};
        int mtb[][] = {a, b, c, d};
        for (int i = 0; i < mtb.length; i++) {
            for (int j = 0; j < mtb[i].length; j++) {
                System.out.print(mtb[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        // Creación de arrays bidimensionales de distinto número de elementos por fila.
        int[][] matriz = new int[3][0];
        int fila1[] = {1, 4, 8, 1, 0, 10};
        int fila2[] = {28, 11};
        int fila3[] = {100, 200, 300, 400, 500};
        matriz[0] = fila1;
        matriz[1] = fila2;
        matriz[2] = fila3;

        // Acceso a elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
