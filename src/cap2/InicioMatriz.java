package cap2;

public class InicioMatriz {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3, 3);
        matriz.asignar(1, 0, 0);
        matriz.asignar(4, 1, 0);
        matriz.asignar(7, 2, 0);
        matriz.asignar(2, 0, 1);
        matriz.asignar(5, 1, 1);
        matriz.asignar(8, 2, 1);
        matriz.asignar(3, 0, 2);
        matriz.asignar(6, 1, 2);
        matriz.asignar(9, 2, 2);
        matriz.imprimirMatriz();
        
        Matriz matriz2 = new Matriz(3, 3);
        matriz2.asignar(1, 0, 0);
        matriz2.asignar(4, 1, 0);
        matriz2.asignar(7, 2, 0);
        matriz2.asignar(2, 0, 1);
        matriz2.asignar(5, 1, 1);
        matriz2.asignar(8, 2, 1);
        matriz2.asignar(3, 0, 2);
        matriz2.asignar(6, 1, 2);
        matriz2.asignar(9, 2, 2);
        matriz2.imprimirMatriz();
        
        Matriz matriz3;
        matriz3 = matriz.sumar(matriz2);
        matriz3.imprimirMatriz();
        
        Matriz matriz4;
        matriz4 = matriz3.productoEscalar(10);
        matriz4.imprimirMatriz();
    }
}
