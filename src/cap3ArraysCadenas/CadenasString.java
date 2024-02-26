package cap3ArraysCadenas;

public class CadenasString {

    public static void main(String[] args) {
        String mipueblo = "Lupiana";
        String vacia = "";
        String rotulo = "\n\t Lista de pasajeros\n";

        char cad[] = {'L', 'u', 'p', 'i', 'a', 'n', 'a'};
        // cad es un array de siete caracteres.
        String pd = "Felicidad";
        System.out.println(pd);

        // Declaracion e Inicializacion
        String s1, s2;
        String texto = "Esto es una cadena";
        String textodemo = "Esta es una cadena muy larga";
        String cadenatest = "¿Cuál es la longitud de esta cadena? ";
        System.out.println(cadenatest + cadenatest.length());

        String cad1 = "Sabado tarde", cad2;
        cad2 = new String(cad1);
        if (cad1.equals(cad2)) {
            System.out.println(cad1 + " = " + cad2);
            System.out.println(cad1.equals(cad2));
        }

        // Metodos de Strings
        // Lengt: Tamanio de la cadena
        System.out.println("Length");
        System.out.println("Sorpresa en la noche".length());
        // Concat
        System.out.println("Concat");
        String frase = "El principe era: ";
        String complemento = "Felipe";
        System.out.println(frase.concat(complemento));
        // charAt
        System.out.println("charAt");
        String album = "Close to the edge";
        System.out.println(album.charAt(3));
        // getChars
        String animal = "Burro";
        animal.getChars(0, 3, cad, 0);
        // subString
        System.out.println("Substring");
        String frase1 = "El agua te ayuda a hidratarte";
        System.out.println(frase1.substring(2, 8));
        // compareTo
        System.out.println("CompareTo");
        String good = "Vaca";
        String bad = "Baca";
        String animal1 = "Vaca";
        System.out.println("Vaca - Baca:" + good.compareTo(bad));
        System.out.println("Vaca - Vaca:" + good.compareTo(animal1));
        System.out.println("Baca - Vaca:" + bad.compareTo(animal1));
        String minus = "vaca";
        System.out.println("Vaca - vaca:" + good.compareTo(minus));
        System.out.println("Vaca - vaca ignoreCase:" + good.compareToIgnoreCase(minus));
        // equals
        System.out.println("Equals");
        System.out.println("Vaca - Baca:" + good.equals(bad));
        System.out.println("Vaca - Vaca:" + good.equals(animal1));
        System.out.println("Baca - Vaca:" + bad.equals(animal1));
        System.out.println("Vaca - vaca:" + good.equals(minus));
        System.out.println("Vaca - vaca ignoreCase:" + good.equalsIgnoreCase(minus));
        // starsWith y endsWith
        System.out.println("starsWith y endsWith");
        System.out.println("Hola".startsWith("H"));
        System.out.println("Hola".startsWith("s"));
        System.out.println("Hola".endsWith("a"));
        System.out.println("Hola".endsWith("q"));
        // regionMatches
        System.out.println("regionMatches");
        String str1 = "Hello World";
        String str2 = "World";
        boolean matches = str1.regionMatches(6, str2, 0, 5);
        System.out.println(matches); // Devuelve true, ya que la subcadena "World" en str1 a partir del índice 6 coincide con la subcadena "World" en str2 a partir del índice 0.
        // toUpperCase  
        System.out.println("ToUpperCase");
        System.out.println("Hola" + " Hola".toUpperCase());
        // toLowerCase  
        System.out.println("ToLowerCase");
        System.out.println("HOLA" + " HOLA".toLowerCase());
        // replace
        System.out.println("Replace");
        String fraseX = "Hola mi amor";
        String fraseY = fraseX.replace("amor", "caca");
        System.out.println(fraseX + " - " + fraseY);
        // trim
        System.out.println("Trim");
        String textoConEspacios = "   Hola Mundo   ";
        String textoSinEspacios = textoConEspacios.trim();
        System.out.println("Texto original: '" + textoConEspacios + "'");
        System.out.println("Texto después de trim(): '" + textoSinEspacios + "'");
        // toCharArray
        System.out.println("charArray");
        char[] charAux;
        charAux = "Hola mundo feo".toCharArray();
        for (int i = 0; i < charAux.length; i++) {
            System.out.println(charAux[i]);
        }
        // valueOf
        System.out.println("valueOf");
        System.out.println(String.valueOf(10));
        // indexOf - lastIndexOf
        System.out.println("indexOf");
        System.out.println("Hola mundo" + " - Indice de m: " + "Hola mundo".indexOf("m", 0)
                + " - Last Indice de m: " + "Hola mundo".lastIndexOf("m", 9));
        
        // Operador + 
        String nombre = "Felipe";
        String trabajo = " Desarrollador";
        System.out.println(nombre + trabajo);
    }
}
