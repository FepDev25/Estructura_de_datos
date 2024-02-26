package colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap2 {
    public static void main(String[] args) {
        Map<String, HashMap<String, String>> anidados = new HashMap<>();
        
        Map<String, Object> persona = getStringObjectMap();

        Map<String, String> directionPersona = (Map<String, String>) persona.get("direction");
        System.out.println("directionPersona = " + directionPersona);
        String pais = directionPersona.get("pais");
        System.out.println("pais = " + pais);
        String casa = directionPersona.getOrDefault("casa", "amarilla"); // No da error si no existe
        System.out.println("casa = " + casa);

        System.out.println("For con tratamiento especial: ");
        for(String llave : persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map){
                System.out.println(llave + ": ");
                Map<String, String> directionP = (Map<String, String>) valor;
                for(String llaveDirection : directionP.keySet()){
                    System.out.println(llaveDirection + ": " + directionP.get(llaveDirection));
                }
            } else{
                System.out.println(llave + ": " + valor);
            }
        }
        
    }
    private static Map<String, Object> getStringObjectMap() {
        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Felipe");
        persona.put("apellido", "Peralta");
        persona.put("edad", "18");
        //
        Map<String, String> direction = new HashMap<>();
        direction.put("pais", "Ecuador");
        direction.put("ciudad", "Cuenca");
        direction.put("parroquia", "Ricaurte");
        direction.put("barrio", "La Merced");
        persona.put("direction", direction);
        persona.forEach((llave, valor) -> {
            System.out.println(llave + ": " + valor);
        });
        return persona;
    }
}
