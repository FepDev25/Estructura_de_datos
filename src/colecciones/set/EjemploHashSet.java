package colecciones.set;


import colecciones.modelo.Alumno;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet <String> equipos = new HashSet();
        equipos.add("Chelsea FC");
        equipos.add("Deportivo Cuenca");
        equipos.add("Manchester City");
        if (!equipos.add("Chelsea FC")) System.out.println("'Chelsea FC' ya se encuentra en la lista");
        System.out.println("equipos = " + equipos);

        String[] lenguajes = {"Java", "C#", "Python", "JavaScript", "Java", "C++", "Python"};
        HashSet <String> lenguajesUnicos = new HashSet();
        for (String len : lenguajes) if (!lenguajesUnicos.add(len)) System.out.println("Elemento duplicado: " + len);
        System.out.println("lenguajes Unicos = " + lenguajesUnicos);

        HashSet<Alumno> alumnos = new HashSet<>();
        alumnos.add(new Alumno("Pepe", 2));
        alumnos.add(new Alumno("Felipe", 7));
        alumnos.add(new Alumno("Diego", 10));
        alumnos.add(new Alumno("Maria", 6));
        alumnos.add(new Alumno("Carlos", 5));
        alumnos.add(new Alumno("Carlos", 6));
        // No se agrega, gracias el equals y el hashcode
        alumnos.add(new Alumno("Carlos", 6));
        System.out.println("alumnos = " + alumnos);

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
        alumnos.forEach(alumno-> System.out.println("alumno = " + alumno));
    }
}
