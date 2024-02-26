package cap3ArraysCadenas;

import java.io.IOException;

public class Ejercicios {

    public static void main(String[] args) throws IOException {
        // Ejercicio 3.7
        int matriz[][] = {{4, 7, 1, 3, 5}, {2, 0, 6, 9, 7}, {3, 1, 2, 6, 4}};
        int matrizAux[][] = new int[5][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                matrizAux[j][i] = matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("*************************************");

        // Ejercicio 3.8
        int matriz2[][] = {{4, 7, -5, 4, 9}, {0, 3, -2, 6, -2}, {1, 2, 4, 1, 1}, {6, 1, 0, 3, -4}};
        int suma = 0;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (!(i == j)) {
                    suma += matriz2[i][j];
                }
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("La suma es: " + suma);
        System.out.println("*************************************");

        // Ejercicio 3.11: Escribir un método que tenga como entrada una cadena y 
        // devuelva el número de vocales, de consonantes y de dígitos de la cadena
        ejercicio("Hola mundo, tengo 18 years y me gusta el Chelsea");
        ejercicio("El maravillo mundo de la programacion, espero en 2 years trabajar ahi");
        ejercicio("Marinero a atrapado 6 caimanes, 8 tiburones y 120 peces");
        System.out.println("*************************************");

        // Ejercicio 3.13: Escribir un método que tenga como argumento una cadena con la fecha 
        //en formato: dd/mm/aa y devuelva una cadena con la fecha en formato dd Mes(nominal) de año.
        ejercicioFecha("21/4/10");
    }

    public static void ejercicio(String cadena) {
        int numVocales = 0, numConsonantes = 0, numDigitos = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isDigit(caracter)) {
                numDigitos += 1;
                continue;
            }
            boolean encontrado = false;
            if (Character.isAlphabetic(caracter)) {
                for (int k = 0; k < vocales.length; k++) {
                    if (vocales[k] == caracter) {
                        numVocales += 1;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    numConsonantes += 1;
                }
            }
        }
        System.out.println(cadena);
        System.out.println("Vocales = " + numVocales);
        System.out.println("Consonantes = " + numConsonantes);
        System.out.println("Digitos = " + numDigitos);
    }

    public static void ejercicioFecha(String fechaFormato) {
        fechaFormato = fechaFormato+"/";
        int items [] =  new int[3];
        StringBuilder fecha = new StringBuilder();
        int contador = 0;
        for (int i = 0; i < fechaFormato.length(); i++) {
            char caracter = fechaFormato.charAt(i);
            if ((i == fechaFormato.length()) || (!Character.isDigit(caracter))){
                int valor = Integer.parseInt((fecha.toString()));
                items[contador] = valor;
                contador+=1;
                fecha = new StringBuilder();
            } else{
                fecha.append(caracter);
            }
        }
        fecha = new StringBuilder();
        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
        String mes = "";
        
        
        switch (items[1]){
            case 1 -> {
                mes = "Enero";
            } case 2 -> {
                mes = "Fbrero";
            } case 3 -> {
                mes = "Marzo";
            } case 4 -> {
                mes = "Abril";
            } case 5 -> {
                mes = "Mayo";
            } case 6 -> {
                mes = "Junio";
            } case 7 -> {
                mes = "Julio";
            } case 8 -> {
                mes = "Agosto";
            } case 9 -> {
                mes = "Septiembre";
            } case 10 -> {
                mes = "Octubre";
            } case 11 -> {
                mes = "Noviembre";
            } case 12 -> {
                mes = "Diciembre";
            }
                
        }
        
        String year = "20" + items[2];
        if (year.length() == 3){
            year = "200" + items[2];
        }
        
        
        fecha.append(items[0]).append(" ").append(mes).append(" del ").append(year);
        System.out.println(fecha);
    }
}
