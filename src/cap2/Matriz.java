package cap2;

public class Matriz {

    private int filas;
    private int columnas;
    private int[][] matriz;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new int[filas][columnas];
    }

    public void asignar(int elemento, int fila, int columna) {
        if (fila > this.filas || columna > this.columnas) {
            System.out.println("Numero de fila o columna invalido");
        } else {
            matriz[fila][columna] = elemento;
        }
    }

    public void obtenerElemento(int elemento) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == elemento) {
                    System.out.println("Elemento encontrado en fila: " + i + " y columna: " + j);
                }
            }
        }
    }

    public Matriz sumar(Matriz m2) {

        if (m2.filas == this.filas && m2.columnas == this.columnas) {
            Matriz suma = new Matriz(this.filas, this.columnas);

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    suma.matriz[i][j] = this.matriz[i][j] + m2.matriz[i][j];
                }
            }
            return suma;
        } else {
            System.out.println("Las matrices no tienen las mismas dimensiones");
            return null;
        }
    }

    public Matriz productoEscalar(int escalar) {

        Matriz matrizEscalar = new Matriz(this.filas, this.columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizEscalar.matriz[i][j] = this.matriz[i][j] * escalar;
            }
        }

        return matrizEscalar;
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
