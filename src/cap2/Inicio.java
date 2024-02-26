package cap2;

public class Inicio {

    public static void main(String[] args) {
        MateriaNueva materia = new MateriaNueva();
        materia.claseCollections();
        System.out.println("");
        
        Conjunto conjunto1 = new Conjunto();
        conjunto1.agregarElemento(2);
        conjunto1.agregarElemento(4);
        conjunto1.agregarElemento(6);
        conjunto1.agregarElemento(8);
        conjunto1.agregarElemento(10);
        conjunto1.imprimirConjunto();
        conjunto1.retirarElemento(4);
        conjunto1.retirarElemento(9);
        conjunto1.imprimirConjunto();
        
        
        Conjunto conjunto2 = new Conjunto();
        conjunto2.agregarElemento(3);
        conjunto2.agregarElemento(6);
        conjunto2.agregarElemento(9);
        conjunto2.agregarElemento(12);
        conjunto2.agregarElemento(15);
        conjunto2.imprimirConjunto();
        conjunto2.retirarElemento(9);
        conjunto2.retirarElemento(4);
        conjunto2.imprimirConjunto();
        
        conjunto1.agregarElemento(12);
        conjunto1.agregarElemento(14);
        conjunto1.agregarElemento(16);
        conjunto1.agregarElemento(18);
        conjunto1.agregarElemento(20);
        conjunto2.agregarElemento(18);
        conjunto2.agregarElemento(21);
        conjunto2.agregarElemento(24);
        conjunto2.agregarElemento(27);
        conjunto2.agregarElemento(30);
        
        conjunto1.imprimirConjunto();
        conjunto2.imprimirConjunto();
        
        Conjunto conjunto3;
        conjunto3 = conjunto1.unionConjunto(conjunto2);
        conjunto3.imprimirConjunto();
    }
}
