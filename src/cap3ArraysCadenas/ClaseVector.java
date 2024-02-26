package cap3ArraysCadenas;

import java.util.Vector;

public class ClaseVector {

    public static void main(String[] args) {
        // OBSOLETA
        
        // Comportamiento similar a un array unidimensional.
        Vector v1 = new Vector();
        Vector v2 = new Vector(100);
        Vector<Integer> v3 = new Vector(v2); // v3 contiene los mismo elementos que v2

        v1.add(6);
        v1.add(4);
        v1.add(1);
        v1.add("Hola");
        
        System.out.println(v1.get(0));
        System.out.println(v1.get(1));
        System.out.println(v1.get(2));
        System.out.println(v1.get(3));
    }
}
