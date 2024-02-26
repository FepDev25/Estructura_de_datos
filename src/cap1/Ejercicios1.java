package cap1;

public class Ejercicios1 {

    public void buscarSubcadena(String cadena, String subcadena){
        // Diseñar un algoritmo que calcule el número de veces que una cadena de caracteres aparece como una subcadena de otra cadena.
        int longitud = subcadena.length();
        int aparicion = 0;
        cadena = cadena.toLowerCase();
        subcadena = subcadena.toLowerCase();

        for(int i = 0; i <= cadena.length() - longitud; i++){
            String actual = cadena.substring(i, i + longitud);
            if (actual.equals(subcadena)){
                aparicion++;
            }
        }
        System.out.println("La cadena \"" + subcadena + "\" aparece " + aparicion + " veces en \"" + cadena + "\"");
    }

    public void numeroPrimo(int numero){
        // Diseñar un algoritmo para determinar si un número n es primo. (Un número primo sólo puede ser divisible por él mismo y por la unidad.)
        if (numero <= 1) {
            System.out.println("El número " + numero + " no es primo.");
            return;
        }

        int contador = 0;

        for (int i = 1; i <= numero / 2; i++){
            if (numero % i == 0){
                contador++;
            }
            if (contador > 1){
                System.out.println("El numero " + numero + " no es primo.");
                return;
            }
        }
        System.out.println("El numero " + numero + " es primo.");
    }

    public void superficieTriangulo(double base, double altura) {
        // Calcular la superficie de un triángulo en función de la base y la altura (S = 1⁄2 Base x Altura).
        if (base <= 0 || altura <= 0) {
            System.out.println("La base y la altura deben ser mayores que cero.");
        } else {
            double superficie = 0.5 * base * altura;
            System.out.println("La superficie de un triángulo con base: " + base + " y altura: " + altura + " es: " + superficie);
        }
    }

    public void calculosCirculo(double radio){
       // Escribir un algoritmo que calcule y muestre la longitud de la circunferencia y el área de un círculo de radio dado.
       if (radio <= 0){
            System.out.println("El radio debe ser mayor a cero");
       } else{
            // L = 2 * PI * r
            double longitud = 2 * Math.PI * radio;
            // A = PI * r^2
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("Radio circulo = " + radio);
            System.out.println("Longitud = " + longitud);
            System.out.println("Area = " + area);
       }  
    }

    public void palindromo(String cadena) {
        // Verificar si una palabra es un palíndromo.
        int longitud = cadena.length();
        boolean esPalindromo = true;
    
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
    
        if (esPalindromo) {
            System.out.println("La palabra \"" + cadena + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + cadena + "\" no es un palíndromo.");
        }
    }
}
