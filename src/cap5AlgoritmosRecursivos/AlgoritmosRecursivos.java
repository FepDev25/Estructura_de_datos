package cap5AlgoritmosRecursivos;

public class AlgoritmosRecursivos {
    // La recursividad (recursión) es aquella propiedad que posee un método por la cual puede llamarse a sí mismo
    // Considérese una solución recursiva sólo cuando una solución iterativa sencilla no sea posible.

    public static void main(String[] args) {
        System.out.println(sumaNenteros(100, 1));
        System.out.println("");
        fibonacciNoRecursivo(20);
        System.out.println("");
        System.out.println(factorial(6));
        System.out.println("");
        mostrarAbecedario('A');
        System.out.println("\n");
        int numero = 259;
        int suma = sumaComponentes(numero);
        System.out.println("Numero = " + numero + " Suma = " + suma);
        suma = sumaComponentesIteractiva(numero);
        System.out.println("Numero = " + numero + " Suma = " + suma + " Iterando");
        System.out.println("");
        System.out.println("Mcd de 66 y 99: " + mcd(66, 99));
        System.out.println("");
        hanoi('a', 'b', 'c', 4);
        System.out.println("");
        double numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        busquedaBR(numeros, 7, 0, numeros.length);
        busquedaBR(numeros, 11, 20, numeros.length);
    }

    public static long sumaNenteros(int n, int limite) {
        System.out.println("n = " + n);
        if (n == limite) {
            return limite;
        } else {
            return n + sumaNenteros(n - 1, limite);
        }
    }

    public static long fibonacci(long n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void fibonacciNoRecursivo(long NElementos) {
        int x = 0;
        int y = 1;
        System.out.println(x);
        System.out.println(y);

        for (int i = 0; i < NElementos; i++) {
            int resp = x + y;
            System.out.println(resp);
            x = y;
            y = resp;
        }
    }

    public static long factorial(long n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void mostrarAbecedario(char letra) {
        if (letra <= 'Z') {
            System.out.print(letra + " ");
            mostrarAbecedario((char) (letra + 1));
        }
    }

    public static int sumaComponentes(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumaComponentes(n / 10);
        }
    }

    public static int sumaComponentesIteractiva(int n) {
        int suma = 0;
        while (n > 9) {
            suma += n % 10;
            n = n / 10;
        }
        return suma + n;
    }

    public static int mcd(int m, int n) {
        if (n <= m && m % n == 0) {
            return n;
        } else if (m < n) {
            return mcd(n, m);
        } else {
            return mcd(n, m % n);
        }
    }

    public static void hanoi(char varinicial, char varcentral, char varfinal, int n) {
        if (n == 1) {
            System.out.println("Mover disco " + n + " desde varilla " + varinicial + " a varilla " + varfinal);
        } else {
            hanoi(varinicial, varfinal, varcentral, n - 1);
            System.out.println("Mover disco " + n + " desde varilla "
                    + varinicial + " a varilla " + varfinal);
            hanoi(varcentral, varinicial, varfinal, n - 1);
        }
    }

    public static int busquedaBR(double a[], double clave, int inferior, int superior) {
        int central;
        if (inferior > superior) // no encontrado
        {
            return -1;
        } else {
            central = (inferior + superior) / 2;
            if (a[central] == clave) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + ", ");
                }
                System.out.println("");
                System.out.println("Numero: " + clave);
                System.out.println("Posicion: " + central);
                return central;
            } else if (a[central] < clave) {
                return busquedaBR(a, clave, central + 1, superior);
            } else {
                return busquedaBR(a, clave, inferior, central - 1);
            }
        }
    }
}
