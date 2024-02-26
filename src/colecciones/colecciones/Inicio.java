package colecciones.colecciones;

public class Inicio {
    public static void main(String[] args) {
        // ArrayList: Por detrás de escena es un array, se aumenta su capacidad cuando se necesita
        // Acceso rápido de lectura. Deficiente en modificar o ingresar elementos. Siempre agrega al final.

        // LinkedList: Rápidas en modificar o ingresar elementos.
        // Deficiencia en acceder a los elementos. Rápido agregar elementos en cualquier parte (inicio, final, mitad).
        // Se puede quitar elementos (almacenar y borrar).

        // Vector: Por detrás de escena es un array, pero es sincronizado.
        // Cuando queremos trabajar con concurrencia, con varios hilos. Se accede de un hilo a la vez.
        // Costo de rendimiento extra.

        // Set: No es ordenado. No permite duplicados.
        // HashSet: No es ordenado en absoluto ni duplicados. Más rápido en rendimiento.
        // TreeSet: Ordenado pero no permite duplicados. Costo en rendimiento al ordenar a cada rato.
        // LinkedHashSet: HashSet pero con listas enlazadas. Mantiene el orden de ingreso de los elementos.

        // Map: Almacenar datos clave-valor.
        // HashMap: Los elementos como llave son únicos.
        // TreeMap: Mapa ordenado.

    }
}
