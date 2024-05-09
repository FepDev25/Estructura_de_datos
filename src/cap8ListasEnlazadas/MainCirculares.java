package cap8ListasEnlazadas;

import cap8ListasEnlazadas.listascirculares.ListaCircular;

public class MainCirculares {

    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular();
        System.out.println("Insertando ");
        lista.insertar(12);
        lista.insertar(15);
        lista.insertar(16);
        lista.insertar(18);
        lista.imprimir();
        
        System.out.println("Eliminar 15");
        lista.eliminar(15);
        lista.imprimir();
    }
}
