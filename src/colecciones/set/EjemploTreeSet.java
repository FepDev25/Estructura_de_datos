package colecciones.set;

import colecciones.modelo.Alumno;
import java.util.*;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> números = new TreeSet();
        números.add(8);
        números.add(10);
        números.add(1);
        números.add(17);
        números.add(1);
        System.out.println("números = " + números);

        TreeSet<String> letras = new TreeSet();
        letras.add("z");
        letras.add("s");
        letras.add("a");
        letras.add("c");
        letras.add("b");
        if (!letras.add("c")) System.out.println("'c' ya pertenece el TreeSet");
        System.out.println("letras = " + letras);

        Set<String> letrasDescendente = new TreeSet<>(Comparator.reverseOrder());
        // Set<String> letrasDescendente = new TreeSet<>((a,b) -> {
        //     return b.compareTo(a);
        // });
        letrasDescendente.add("z");
        letrasDescendente.add("s");
        letrasDescendente.add("a");
        letrasDescendente.add("c");
        letrasDescendente.add("b");
        System.out.println("letras Descendente = " + letrasDescendente);

        TreeSet<Alumno> alumnos = new TreeSet<>(Comparator.comparing(Alumno::getNombre));
        alumnos.add(new Alumno("Pepe", 2));
        alumnos.add(new Alumno("Felipe", 7));
        alumnos.add(new Alumno("Diego", 10));
        alumnos.add(new Alumno("Carlos", 6));
        // No se agrega, debido a que estamos comparando por el nombre
        alumnos.add(new Alumno("Carlos", 6));
        System.out.println("alumnos = " + alumnos);

        TreeSet<Alumno> alumnos2 = new TreeSet<>((a,b) -> Double.compare(b.getNota(), (a.getNota())));
        alumnos2.add(new Alumno("Pepe", 2));
        alumnos2.add(new Alumno("Felipe", 7));
        alumnos2.add(new Alumno("Diego", 10));
        alumnos2.add(new Alumno("Carlos", 6));
        // Este alumno si se agrega debido a que estamos comparando por la NOTA!
        alumnos2.add(new Alumno("Carlos", 5));
        System.out.println("alumnos2 = " + alumnos2);

        // Formas de iterar:
        System.out.println("Iterando usando un forEch: ");
        for(Alumno alumno : alumnos){
            System.out.println("alumno = " + alumno);
        }

        System.out.println("Iterando utilizando while e iterator: ");
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()){
            Alumno aux = iterator.next();
            System.out.println("alumno = " + aux);
        }

        System.out.println("Iterando por funciones lamba, Stream forEch: ");
        alumnos2.forEach(alumno-> System.out.println("alumno = " + alumno));
    }
}
