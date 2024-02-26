package colecciones.list;

import colecciones.modelo.Alumno;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Pepe", 2));
        alumnos.add(new Alumno("Felipe", 7));
        alumnos.add(new Alumno("Diego", 10));
        alumnos.add(new Alumno("Carlos", 6));
        alumnos.add(new Alumno("Santiago", 10));
        alumnos.add(new Alumno("Ismael", 6));
        Alumno aux = new Alumno("Fantasma", 1);
        alumnos.add(aux);
        imprimir(alumnos, "Lista de alumnos: ");

        System.out.println("Tamaño de la lista: " + alumnos.size());
        System.out.println("Esta vacía?: " + alumnos.isEmpty());

        alumnos.set(0, new Alumno("Pepe Renovado", 10)); // Reemplaza al que estaba
        imprimir(alumnos, "Lista de alumnos: ");

        alumnos.add(0, new Alumno( "Bob Esponja", 10)); // Agregar indicando index
        imprimir(alumnos, "Lista de alumnos: ");

        alumnos.remove(aux); // Remover por objeto
        alumnos.remove(0); // Remover por index
        imprimir(alumnos, "Lista de alumnos: ");

        System.out.println("La lista contiene a Ismael? " + alumnos.contains(new Alumno("Ismael", 6)));

        Object[] alumnosArray = alumnos.toArray(); // Convertir a un array
        System.out.println("Imprimir el array: ");
        for (int i = 0; i < alumnosArray.length; i++) {
            System.out.println(alumnosArray[i]);
        }
        System.out.println();

        imprimir(alumnos, "Imprimir de manera en la que se agregan: ");
        // Ordenar
        Collections.sort(alumnos); // Usa el CompareTo que tengamos en la clase del tipo de dato de la lista
        imprimir(alumnos, "Imprimir con el compareTo de la nota: ");
        Collections.sort(alumnos, Comparator.comparing(Alumno::getNombre)); // (a,b) -> a.getNombre().compareTo(b.getNombre())
        alumnos.sort(Comparator.comparing(Alumno::getNombre)); // Recomendable
        imprimir(alumnos, "Imprimir cambiando el compareTo con el nombre: ");

        List<Alumno> subListaAlumnos = alumnos.subList(2,6);
        imprimir(subListaAlumnos, "Imprimir sublista: ");

        alumnos.clear(); // Vaciar la lista
        System.out.println("Esta vacía?: " + alumnos.isEmpty());

    }

    public static void imprimir(List<Alumno> alumnos, String forma){
        System.out.println(forma);
        alumnos.forEach(alumno-> System.out.println(alumno.getNombre() + " " + alumno.getNota()));
        System.out.println();
    }
}
