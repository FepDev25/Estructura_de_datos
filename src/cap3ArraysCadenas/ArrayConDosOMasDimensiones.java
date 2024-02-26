package cap3ArraysCadenas;

public class ArrayConDosOMasDimensiones {

    public static void main(String[] args) {
        int equipos[][][] = new int[3][15][10];
        int pagina, linea, columna;
        final int PAGINAS = 500;
        final int LINEAS = 45;
        final int COLUMNAS = 80;
        char libro[][][] = new char[PAGINAS][LINEAS][COLUMNAS];
        
        char i = '0';
        for (pagina = 0; pagina < PAGINAS; ++pagina){
            for (linea = 0; linea < LINEAS; ++linea){
                for (columna = 0; columna < COLUMNAS; ++columna){
                    libro[pagina][linea][columna] = i;
                }
                i+=1;
            }
            System.out.println("");
        }
        for (pagina = 0; pagina < PAGINAS; ++pagina){
            for (linea = 0; linea < LINEAS; ++linea){
                for (columna = 0; columna < COLUMNAS; ++columna){
                    // System.out.print(libro[pagina][linea][columna] + " ");
                }
            }
            // System.out.println("");
        }
        
    }

}
