package cap2;

public class InicioComplejo {
    public static void main(String[] args) {
        Complejo complejo1 = new Complejo();
        complejo1.asignarReal(5);
        complejo1.asignarImaginario(7);
        complejo1.imprimirComplejo();
        System.out.println(complejo1.modulo());
        
        Complejo complejo2 = new Complejo(14, -2);
        complejo2.imprimirComplejo();
        System.out.println(complejo2.modulo());
        
        Complejo complejo3 = new Complejo(10, 4);
        complejo3.imprimirComplejo();
        System.out.println(complejo3.modulo());
        
        Complejo c12 = complejo1.sumar(complejo2);
        c12.imprimirComplejo();
    }
}
