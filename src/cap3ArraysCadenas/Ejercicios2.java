package cap3ArraysCadenas;

public class Ejercicios2 {

    public static void main(String[] args) {
        // 3.14 Definir un array de cadenas para poder leer un texto compuesto por un 
        // máximo de 80 líneas. Escribir un método para leer el texto; el método debe de tener dos 
        // argumentos, uno, el texto y el segundo, el número de líneas.
        String[] texto = {"",
            "Hola me llamo Felipe.\n",
            "Me gusta la programcion. \n",
            "Soy hincha del Cheslea. \n",
            "Me gusta la tecnoligia \n",
            "Quiero y voy a ser experto en: \n",
            "Java Spring \n",
            "JavaScript React, VueJs y Node Js\n",
            "Python Django Data Science\n",
            "Dart Flutter\n",
            "Php Laravel\n",
            "CSS Tailwind\n"};
        leerTexto(texto, texto.length);
        System.out.println("*************************************");

        // 3.15: Un texto de n líneas tiene ciertos caracteres que se consideran comodines. Hay dos comodines, el # y el ?.
        //El primero indica que se ha de sustituir por la fecha actual, en formato dia(nn) deMes(nombre) año(aaaa), por ejemplo 21
        //de Abril 2001. El otro comodín indica que se debe reemplazar por un nombre. Escribir un programa que lea las líneas del 
        //  texto y cree un array de cadenas, de modo que cada elemento esté referenciando una cadena que es el resultado de 
        //realizar las sustituciones indicadas. La fecha y el nombre se han de obtener del flujo de entrada.      
        String textoString = "Era la primavera del 98. El agante #77 me pregunta: Cuanto tiempo aguantarias "
                + "con una pistola en tu frente?. Me quede con sorpresa despues de eso, le respondi:"
                + "Amigo, yo soy el agante #69, el numero de mi placa habla sobre los cojones que tengo."
                + "Tu, cuanto aguantarias?. Antes de que responda, saque mi pistola de bolisillo y acabe con el #77";

        StringBuffer miTexto = new StringBuffer(textoString);
        comodines(miTexto, "25 de enero de 2005", "Felipe");
        System.out.println("*************************************");
        System.out.println("");

        //3.2 Escribir un programa que permita visualizar el triángulo de Pascal:
        trianguloPascal(7);
        System.out.println("");
        
        // 3.3 Se sabe que en las líneas que forman un texto hay valores numéricos enteros, que 
        //representan los kg de patatas recogidos en una finca. Los valores numéricos están separados 
        //de las palabras por un blanco, o por el carácter de fin de línea. Escribir un programa que lea 
        // el texto y obtenga la suma de los valores numéricos.
        String miTexto2 = """
                          En la finca de Pedro se han recogido 150 kg de patatas.
                          En la finca de Juan se han recogido 200 kg de patatas.
                          En la finca de Mar\u00eda se han recogido 180 kg de patatas.
                          En la finca de Luis se han recogido 220 kg de patatas.""";
        obtenerValoresNumericos(miTexto2);
    }

    public static void leerTexto(String[] texto, int numLineas) {
        int contador = 0;
        for (String texto1 : texto) {
            System.out.println(texto1);
            contador++;
            if (contador > numLineas) {
                break;
            }
        }
    }

    public static void comodines(StringBuffer texto, String fecha, String nombre) {
        StringBuilder textoAux = new StringBuilder();
        System.out.println(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch (caracter) {
                case '#' ->
                    textoAux.append(fecha);
                case '?' ->
                    textoAux.append(nombre);
                default ->
                    textoAux.append(caracter);
            }
        }
        System.out.println(textoAux);
    }

    public static void trianguloPascal(int n) {
        int[] pasada;
        int[] auxAnterior = {};
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pasada = new int[i + 1];
                pasada[0] = 1;
                auxAnterior = pasada;
            } else {
                pasada = new int[i + 1];
                pasada[0] = 1;
                pasada[pasada.length - 1] = 1;

                if (pasada.length != 2) {
                    
                    int[] numeros = new int[n];
                    for (int j = 0; j < auxAnterior.length; j++) {
                        if (j == auxAnterior.length-1) {
                            break;
                        }
                        int numero = auxAnterior[j] + auxAnterior[j + 1];
                        numeros[j] = numero;
                    }

                    for (int j = 1; j < pasada.length - 1; j++) {
                        pasada[j] = numeros[j - 1];
                    }
                }

                auxAnterior = pasada;
            }
            imprimir(pasada);
        }
    }
    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    
    public static void obtenerValoresNumericos(String texto){
        StringBuilder sb = new StringBuilder();
        int suma = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isDigit(caracter)){
                sb.append(caracter);
            } else if (!sb.isEmpty()){
                System.out.println("Sumando: " + sb.toString());
                suma += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            }
        }
        
        System.out.println("La suma es: " + suma + " kg");
    }

}
