package colecciones.map;

import colecciones.modelo.Alumno;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Alumno aux = new Alumno("Zorro", 7);
        Alumno aux2 = new Alumno("Batman", 8);
        Alumno aux3 = new Alumno("Superman", 10);
        Alumno aux4 = new Alumno("Ant Man", 1);

        Map<String, Double> alumnoNotas = new TreeMap<>();
        alumnoNotas.put(aux.getNombre(), aux.getNota());
        alumnoNotas.put(aux2.getNombre(), aux2.getNota());
        alumnoNotas.put(aux3.getNombre(), aux3.getNota());
        alumnoNotas.put(aux4.getNombre(), aux4.getNota());
        System.out.println("alumnoNotas = " + alumnoNotas); // Ordena de forma natural por las llaves


        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        System.out.println("Creado el mapa persona con comparador en reverseOrder");
        persona.put("nombre", "Felipe");
        persona.put("apellido", "Peralta");
        persona.put("edad", "18");
        Map<String, String> direction = new TreeMap<>();
        direction.put("pais", "Ecuador");
        direction.put("ciudad", "Cuenca");
        direction.put("parroquia", "Ricaurte");
        direction.put("barrio", "La Merced");
        persona.put("direction", direction);
        System.out.println("persona = " + persona);
    }
}
