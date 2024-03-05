package cap7AlgoritmosOrdenacionArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClaseFile {

    public static void main(String[] args) {
        // crearArchivo("archivo.txt");
        File archivo = new File("archivo.txt");
        System.out.println("Existe archivo.txt? " + archivo.exists());
        System.out.println("Path absoluta de archivo.txt: " + archivo.getAbsolutePath());
        System.out.println("Name de archivo.txt: " + archivo.getName());

        String frase = "El Chelsea FC tiene 2 UCL. Una en 2012 y otra en 2021";
        escribirArchivo("archivo.txt", frase);
        leerArchivo("archivo.txt");
        String frase2 = "Sus mejores jugadores son: Lampard, Drogba, Terry, Cech, Kante, Hazard etc";
        anexarArchivo("archivo.txt", frase2);
        leerArchivo("archivo.txt");

        System.out.println("*************************************************");
        
        String frase3 = "Actualmente pasan un mal momento";
        escribirArchivoOutputStream("archivo.txt", frase+"\n"+frase2+"\n"+frase3+"\n");
        leerArchivoFileInputStream("archivo.txt");
    }

    public static void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try {
            archivo.createNewFile();  // Creacion de un archivo
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            System.out.println("Error al crear el archivo");
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void escribirArchivo(String nombreArchivo, String texto) {
        File archivo = new File(nombreArchivo);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(texto);
            bw.newLine();
            System.out.println("Texto escrito correctamente en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void anexarArchivo(String nombreArchivo, String texto) {
        File archivo = new File(nombreArchivo);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) { // Append true
            bw.write(texto);
            bw.newLine();
            System.out.println("Texto añadido correctamente al archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al anexar al archivo: " + e.getMessage());
        }
    }

    public static void leerArchivoFileInputStream(String nombreArchivo) {
        try (FileInputStream fis = new FileInputStream(nombreArchivo)) {
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static void escribirArchivoOutputStream(String nombre, String datosAEscribir) {
        try (FileOutputStream fos = new FileOutputStream(nombre)) {
            byte[] bytes = datosAEscribir.getBytes();
            fos.write(bytes);
            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}
