package cap8ListasEnlazadas;

import cap8ListasEnlazadas.enlacedoble.ListaDoble;

public class MainDobleEnlace {
    public static void main(String[] args) {
        ListaDoble <Integer> lista = new ListaDoble();
        System.out.println("Insertar cabeza:");
        lista.insertarCabeza(10);
        lista.insertarCabeza(13);
        lista.insertarCabeza(11);
        lista.imprimir();
        
        System.out.println("Insertar despues");
        lista.insertarDespues(lista.getCabeza(), 19);
        lista.imprimir();
        
        System.out.println("Insertar despues");
        lista.insertarDespues(lista.getCabeza().getAdelante(), 25);
        lista.imprimir();
        
        System.out.println("Elimando 13: ");
        lista.eliminar(13);
        lista.imprimir();
        
        System.out.println("Buscar 11");
        lista.buscarLista(11);
        System.out.println("Buscar 25");
        lista.buscarLista(25);
        System.out.println("Buscar 100");
        lista.buscarLista(100);
    }
}
