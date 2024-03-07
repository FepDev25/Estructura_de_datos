package cap8ListasEnlazadas.enlacedoble;

import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class MainIterador {

    public static void main(String[] args) throws IOException {
        Random r;
        int d, x1, x2;
        final int M = 29;
        final int MX = 999;
        
        Scanner s = new Scanner(System.in);

        ListaDoble<Integer> listaDb;
        r = new Random();
        listaDb = new ListaDoble();
        for (int i = 0; i < M; i++) {
            d = r.nextInt(MX) + 1;
            listaDb.insertarCabeza(d);
        }
        System.out.println("Elementos de la lista original: ");
        listaDb.imprimir();

        System.out.println("Rango que va a contener la lista");
        System.out.print("Ingresar rango inferior: ");
        x1 = s.nextInt(); s.nextLine();
        System.out.print("Ingresar rango supperior: ");
        x2 = s.nextInt(); s.nextLine();
        
        IteradorLista iterador = new IteradorLista(listaDb);
        Nodo a;
        
        a = iterador.siguiente();
        
        while (a != null){
            int w;
            w = (int) a.getDato();
            if (!(w >= x1 && w <= x2)){
                listaDb.eliminar(w);
            }
            a = iterador.siguiente();
        }
        
        System.out.println("Elementos de la lista entre " + x1 + " y " + x2);
        listaDb.imprimir();

    }
}
