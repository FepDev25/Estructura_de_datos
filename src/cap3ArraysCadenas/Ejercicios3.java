package cap3ArraysCadenas;

public class Ejercicios3 {

    public static void main(String[] args) {
        // Escribir un programa que lea una cadena clave y un texto de, como máximo, 50 líneas. 
        // El programa debe de eliminar las líneas que contengan la clave.
        eliminarClave("Mi mama me mima, me mima me mima mi mama", "mama");
        System.out.println("*************************************");

        // Se desea sumar números grandes, tan grandes que no pueden almacenarse en variables 
        // de tipo long. Se ha pensado en introducir cada número como una cadena de caracteres 
        // y realizar la suma extrayendo los dígitos de ambas cadenas.
        sumarCantidadesGrandes("43032910289018281810219", "23182378901298701903219");
        System.out.println("*************************************");
    }

    public static void eliminarClave(String texto, String clave) {
        System.out.println(texto);
        String[] array = texto.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(clave)) {
                array[i] = " ";
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sumarCantidadesGrandes(String num1, String num2) {
        String[] array1 = num1.split("");
        String[] array2 = num2.split("");

        StringBuilder respuesta = new StringBuilder();
        int resto = 0;

        if (num1.length() != num2.length()) {
            System.out.println("Los numeros deben tener la misma longitud");
            return;
        }

        for (int i = array1.length - 1; i >= 0; i--) {
                int suma;

                if (resto > 0) {
                    suma = Integer.parseInt(array1[i]) + Integer.parseInt(array2[i]) + resto;
                } else {
                    suma = Integer.parseInt(array1[i]) + Integer.parseInt(array2[i]);
                }

                if (suma >= 10) {
                    String resultAux = String.valueOf(suma);
                    String[] aux = resultAux.split("");
                    resto = Integer.parseInt(aux[0]);
                } else {
                    resto = 0;
                    respuesta.append(suma);
                }
            }

            if (resto > 0) {
                respuesta.append(resto);
            }
            System.out.println("Suma: " + respuesta.reverse());

    }

}
