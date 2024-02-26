package cap2;

public class InicioBolsa {
    public static void main(String[] args) {
        Bolsa bolsa1 = new Bolsa("Tomates");
        bolsa1.agregarElemento("Carne");
        bolsa1.agregarElemento("Papas");
        bolsa1.agregarElemento("Coca Cola");
        bolsa1.agregarElemento("Coca Cola");
        bolsa1.agregarElemento("Coca Cola");
        System.out.println("Bolsa vacia? " + bolsa1.bolsaVacia());
        System.out.println("Estan Tomates? " + bolsa1.dentro("Tomates"));
        System.out.println("Estan Salchichas? " + bolsa1.dentro("Salchichas"));
        System.out.println("Cuantas Coca Colas llevas? " + bolsa1.cuantos("Coca Cola"));
        bolsa1.imprimirBolsa();
        System.out.println("");
        
        Bolsa bolsa2 = new Bolsa();
        System.out.println("Bolsa vacia? " + bolsa2.bolsaVacia());
        bolsa2.agregarElemento("Jamon");
        bolsa2.agregarElemento("Tocino");
        bolsa2.agregarElemento("Coca Cola");
        bolsa2.agregarElemento("Queso");
        bolsa2.agregarElemento("Coca Cola");
        bolsa2.imprimirBolsa();
        System.out.println("");
        
        Bolsa bolsa3;
        bolsa3 = bolsa1.unionBolsa(bolsa2);
        bolsa3.imprimirBolsa();
        System.out.println("Cuantas Coca Colas llevamos? " + bolsa3.cuantos("Coca Cola"));
    }
    
}
