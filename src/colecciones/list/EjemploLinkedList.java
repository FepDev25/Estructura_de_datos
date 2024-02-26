package colecciones.list;

import colecciones.modelo.Alumno;

import java.util.*;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> alumnos = new LinkedList<>();
        alumnos.add(new Alumno("Pepe", 2));
        alumnos.add(new Alumno("Felipe", 7));
        alumnos.add(new Alumno("Ismael", 6));
        alumnos.add(new Alumno("Esteban", 2));
        alumnos.add(new Alumno("Juan", 7));
        alumnos.add(new Alumno("Marco", 6));
        imprimir(alumnos, "Imprimir Linked List: ");

        Alumno aux = new Alumno("Fantasma", 1);
        alumnos.addFirst(aux);
        Alumno aux2 = new Alumno("Ghost", 1);
        alumnos.addLast(aux2);
        imprimir(alumnos, "Imprimir Linked List: ");

        System.out.println("Obtener Primero: " + alumnos.getFirst());
        System.out.println("Obtener Primero sin excepciones: " + alumnos.peekFirst());
        System.out.println("Obtener final: " + alumnos.getLast());
        System.out.println("Obtener final sin excepciones: " + alumnos.peekLast());
        System.out.println("Obtener index 1: " + alumnos.get(1));

        // Alumno eliminarPrimero = alumnos.removeFirst(), Alumno eliminarPrimero = alumnos.pop(),
        Alumno eliminarPrimero = alumnos.pollFirst(); // No lanza error
        System.out.println("eliminarPrimero = " + eliminarPrimero);
        // Alumno eliminarFinal = alumnos.removeLast(),
        Alumno eliminarFinal = alumnos.pollLast(); // No lanza error
        System.out.println("eliminarFinal = " + eliminarFinal);
        alumnos.remove(3);
        alumnos.remove(new Alumno("Marco", 6));
        imprimir(alumnos, "Imprimir Linked List: ");

        System.out.println("Index de Juan: " + alumnos.indexOf(new Alumno("Juan", 7)));

        System.out.println("Imprimir con List Iterator: ");
        ListIterator<Alumno> listIterator = alumnos.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("Imprimir con List Iterator Previo: ");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    public static void imprimir(List<Alumno> alumnos, String forma){
        System.out.println(forma);
        alumnos.forEach(alumno-> System.out.println(alumno.getNombre() + " " + alumno.getNota()));
        System.out.println();
    }
}
