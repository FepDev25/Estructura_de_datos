package colecciones.map;


import colecciones.modelo.Alumno;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Alumno aux = new Alumno("Felipe", 7);
        Alumno aux2 = new Alumno("Carlos", 8);
        Alumno aux3 = new Alumno("Diego", 10);
        Alumno aux4 = new Alumno("Ghost", 1);

        Map<String, Double> alumnoNotas = new HashMap<>();
        alumnoNotas.put(aux.getNombre(), aux.getNota());
        alumnoNotas.put(aux2.getNombre(), aux2.getNota());
        alumnoNotas.put(aux3.getNombre(), aux3.getNota());
        alumnoNotas.put(aux4.getNombre(), aux4.getNota());
        System.out.println("alumnoNotas = " + alumnoNotas);

        System.out.println("La nota de Felipe es: " + alumnoNotas.get("Felipe")); // Acceder mediante la llave
        System.out.println("Existe Carlos: " + alumnoNotas.containsKey("Carlos"));
        System.out.println("Alguien tiene 10?: " + alumnoNotas.containsValue(10.00));
        alumnoNotas.replace("Felipe", 10.00);
        System.out.println("La nueva nota de Felipe es: " + alumnoNotas.get("Felipe"));
        Double notaAlumnoEliminado = alumnoNotas.remove("Ghost");
        System.out.println("notaAlumnoEliminado = " + notaAlumnoEliminado);
        Boolean eliminar = alumnoNotas.remove("Felipe", 1.00); // Boolean, borra solo si ese valor es correcto
        String mensaje = eliminar ? "Se puede eliminar porque tiene baja nota" : "No se elimina porque no tiene 1";
        System.out.println("mensaje = " + mensaje);

        Collection<Double> notas = alumnoNotas.values(); // Collection de valores
        notas.forEach(a-> System.out.println("Nota: " + a));

        alumnoNotas.keySet().forEach(a-> System.out.println("Llave: " + a)); // Set de llaves

        System.out.println("alumnoNotas = " + alumnoNotas);

        // Iterar con llave y valor
        System.out.println("Iterar clave-valor con Map.Entry: ");
        for(Map.Entry<String, Double> objeto : alumnoNotas.entrySet()){
            System.out.println(objeto.getKey() + ": " + objeto.getValue());
        }
        System.out.println("Iterar clave-valor con .keySet: ");
        for(String llave : alumnoNotas.keySet()){
            System.out.println(llave + ": " + alumnoNotas.get(llave));
        }
        System.out.println("Iterar con forEch: ");
        alumnoNotas.forEach((llave, valor) -> {
            System.out.println(llave + ": " + valor);
        });


        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","Felipe");
        persona.put("apellido","Peralta");
        persona.put("edad","18");
        persona.put("cargo","Desarrollador");
        System.out.println("persona = " + persona);
    }
}
