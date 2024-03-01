package cap6AlgoritmosOrdenacionYBusqueda;

public class OrdenamientoObjetos {
    public static void main(String[] args) {
        Gato g1 = new Gato("Bruno", 4, 3.5, "Felipe");
        Gato g2 = new Gato("Polita", 3, 3, "Karen");
        Gato g3 = new Gato("Perla", 2, 4.5, "Paz");
        Gato g4 = new Gato("Laso", 7, 3.5, "Nube y Diego");
        Gato g5 = new Gato("Pepe", 4, 3, "Mariuxi");
        
        Gato[] gatos = {g1, g2, g3, g4, g5};
        imprimirConMensaje(gatos,"Gatos desordenados: ");
        burbujaEdad(gatos);
        imprimirConMensaje(gatos,"Gatos Ordenados por edad: ");
        burbujaPeso(gatos);
        imprimirConMensaje(gatos,"Gatos Ordenados por peso: ");
        burbujaCompareTo(gatos);
        imprimirConMensaje(gatos,"Gatos Ordenados por nombre: ");
    }
    
    
    public static void burbujaEdad(Gato[] gatos) {
        int contador = 0;
        for (int i = 0; i < gatos.length; i++) {
            for (int j = i + 1; j < gatos.length; j++) {
                if (gatos[i].getEdad() > gatos[j].getEdad()) {
                    System.out.println("Intercambio: " + gatos[i].getNombre() + " es mayor que " + gatos[j].getNombre());
                    Gato aux = gatos[i];
                    gatos[i] = gatos[j];
                    gatos[j] = aux;
                    contador++;
                }
            }
        }
    }
    
    public static void burbujaPeso(Gato[] gatos) {
        int contador = 0;
        for (int i = 0; i < gatos.length; i++) {
            for (int j = i + 1; j < gatos.length; j++) {
                if (gatos[i].getPeso() > gatos[j].getPeso()) {
                    System.out.println("Intercambio: " + gatos[i].getNombre() + " es mas gordo que " + gatos[j].getNombre());
                    Gato aux = gatos[i];
                    gatos[i] = gatos[j];
                    gatos[j] = aux;
                    contador++;
                }
            }
        }
    }
    
    public static void burbujaCompareTo(Gato[] gatos) {
        int contador = 0;
        for (int i = 0; i < gatos.length; i++) {
            for (int j = i + 1; j < gatos.length; j++) {
                if (gatos[i].compareTo(gatos[j]) > 0) {
                    System.out.println("Intercambio: " + gatos[i].getNombre() + " es mayor que " + gatos[j].getNombre());
                    Gato aux = gatos[i];
                    gatos[i] = gatos[j];
                    gatos[j] = aux;
                    contador++;
                }
            }
        }
    }
    
    public static void imprimirConMensaje(Gato[] gatos, String mensaje) {
        System.out.println(mensaje);
        for (Gato gato : gatos) {
            System.out.println(gato.getNombre() + " " + gato.getEdad() + " " + gato.getPeso());
        }
        System.out.println("");
    }
}
