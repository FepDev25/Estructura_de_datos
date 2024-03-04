package cap6AlgoritmosOrdenacionYBusqueda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Busqueda {
    public static void main(String[] args) {
        String archivo = leerArchivo("numeros.txt");
        String arrayString[] = archivo.split(",");
        int array[] = new int[1000];
        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }
        
        // Busqueda secuencial: los elementos de una lista se exploran (se examinan) en secuencia, uno después de otro.
        busquedaSecuencial(array, 918);
        // Busqueda binaria:  Si la lista está ordenada, la búsqueda binaria proporciona una técnica de búsqueda mejorada. 
        busquedaBinaria(array, 918);
    }   
    
    
    public static int busquedaBinaria(int array[], int clave){
        // Encontrar la pocision de la clave a buscar
        int central, bajo, alto;
        int valorCentral;
        bajo = 0;
        alto = array.length - 1;
        imprimirListas(array, bajo,alto,"Lista");
        System.out.println("Valor buscado: " + clave);
        while (bajo <= alto){
            central = (bajo + alto) / 2;
            valorCentral = array[central];
            System.out.println("Valor central: " + valorCentral);
            if (clave == valorCentral){
                System.out.println("Valor encontrado: " + valorCentral);
                return central;
            } else if (clave < valorCentral){
                alto = central - 1;
                imprimirListas(array, bajo,alto,"Sublista Izquierda");
            } else{
                bajo = central + 1;
                imprimirListas(array, bajo,alto,"Sublista derecha");
            }
        }
        System.out.println("No se encontro el elemento");
        return -1;
    }
    
    public static void imprimirListas(int array [], int bajo, int alto, String mensaje){
        System.out.println(mensaje);
        System.out.print("[");
        for (int i = bajo; i <= alto; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }
    
    public static int busquedaSecuencial(int array[], int clave){
        // Encontrar la pocision de la clave a buscar
        for (int i = 0; i < array.length; i++) {
            if (array[i] == clave){
                System.out.println("Valor encontrado: " + array[i]);
                return i;
            } else{
                System.out.println("Pasada " + (i+1) + ", valor " + array[i] + " distinto de " + clave);
            }
        }
        System.out.println("No se encontro el elemento");
        return -1;
    }
    
    public static String leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            return br.readLine();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return "";
    }
    
}
