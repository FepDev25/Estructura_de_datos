package cap3ArraysCadenas;

public class Arrays {

    public static void main(String[] args) {

        // Creacion de un array
        int[] enteros;
        char caracteres[];
        int[] array1, array2;

        float[] notasProgramacion;
        notasProgramacion = new float[19];

        float[] notasSistemas = new float[29];

        final int N = 30;
        float[] vector;
        vector = new float[N];
        System.out.println(vector.length);

        // Indexacion basada en 0
        int[] meses = new int[12];
        float[] salarios;
        salarios = new float[16];
        meses[4] = 5;
        System.out.println(meses[4] * 3);

        // Tamanio de los arrays
        double[] v = new double[15];
        System.out.println(v.length);

        double[] arrayAux = {1.9, 8.5, 2.3, 10.1, 5.1, 11.2, 14.1};
        suma(arrayAux);

        // Verificar el indice de un array
        verificar(arrayAux, 3);
        verificar(arrayAux, 6);
        verificar(arrayAux, 7);
        verificar(arrayAux, 12);

        // Inicialiazacion de un array
        int numeros[] = {10, 20, 30, 40, 50, 60};
        int n[] = {3, 4, 5};
        char c[] = {'L', 'u', 'i', 's'};

        final int ENE = 31, FEB = 28, MAR = 31, ABR = 30, MAY = 31, JUN = 30, JUL = 31, AGO = 31, SEP = 30, OCT = 31, NOV = 30, DIC = 31;
        int mesesOrden[] = {ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC};

        // Copia de Array
        double[] r, w;
        r = new double[11];
        for (int j = 0; j < r.length; j++) {
            r[j] = (double) 2 * j - 1;
        }
        w = r;
        for (int j = 0; j < w.length; j++) {
            System.out.println("w: " + w[j]);
            System.out.println("r: " + r[j]);
        }

    }

    public static double suma(double[] w) {
        double s = 0.0;
        for (int i = 0; i < w.length; i++) {
            s += w[i];
        }
        System.out.println("suma = " + s);
        return s;
    }

    public static double verificar(double a[], int indice) {
        if (indice > (a.length - 1)) {
            System.out.println("Indice mayor al tamanio del array");
            return -1;
        }
        System.out.println("Numero en el indice: " + indice + ": " + a[indice]);
        return a[indice];
    }

    public static void copiar1() {
        // Manual: 
        final int N = 12;
        int v1[] = new int[N], v2[] = new int[N];
        for (int i = 0; i < N; i++) {
            v1[i] = (int) Math.random() * 199 + 1;
        }
        for (int i = 0; i < N; i++) {
            v2[i] = v1[i];
        }

        // ArrayCopy
        System.arraycopy(v1, 0, v2, 0, N);
        // System.arraycopy(arrayOrigen,inicioOrigen,arrayDestino,inicioDestino,numElementos)
    }

}