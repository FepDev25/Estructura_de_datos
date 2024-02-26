package colecciones.tarea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Inicio {
    public static void main(String[] args) throws ParseException {
        // Crear instancias de la clase Vuelo para los vuelos proporcionados
        LinkedList<Vuelo> vuelos = new LinkedList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd MMM yyyy HH:mm 'hrs'", new Locale("es", "ES"));

        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", dateFormat.parse("lun 29 ago 2021 05:39 hrs"), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", dateFormat.parse("lun 31 ago 2021 04:45 hrs"), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", dateFormat.parse("lun 30 ago 2021 16:00 hrs"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", dateFormat.parse("lun 29 ago 2021 13:22 hrs"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", dateFormat.parse("lun 31 ago 2021 14:05 hrs"), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", dateFormat.parse("lun 31 ago 2021 05:20 hrs"), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", dateFormat.parse("lun 30 ago 2021 08:45 hrs"), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", dateFormat.parse("lun 29 ago 2021 07:41 hrs"), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", dateFormat.parse("lun 30 ago 2021 10:35 hrs"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", dateFormat.parse("lun 29 ago 2021 09:14 hrs"), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", dateFormat.parse("lun 31 ago 2021 08:33 hrs"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", dateFormat.parse("lun 31 ago 2021 15:15 hrs"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", dateFormat.parse("lun 30 ago 2021 08:14 hrs"), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", dateFormat.parse("lun 29 ago 2021 22:53 hrs"), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", dateFormat.parse("lun 31 ago 2021 09:57 hrs"), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", dateFormat.parse("lun 31 ago 2021 04:00 hrs"), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", dateFormat.parse("lun 29 ago 2021 07:45 hrs"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", dateFormat.parse("lun 30 ago 2021 07:12 hrs"), 58));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago", dateFormat.parse("lun 29 ago 2021 18:29 hrs"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", dateFormat.parse("lun 30 ago 2021 15:45 hrs"), 39));
        vuelos.sort(Comparator.comparing(Vuelo::getFechaDeLlegada));
        System.out.println("Ordenar por orden de llegada: ");
        vuelos.forEach(a-> System.out.println(a));
        System.out.println();

        System.out.println("El último vuelo en llegar: " + vuelos.getLast().getNombre() + ": " +
                vuelos.getLast().getOrigen() + ", " + vuelos.getLast().getFechaDeLlegada());

        TreeSet<Vuelo> vuelosSet = new TreeSet<>();
        for (Vuelo v : vuelos) vuelosSet.add(v);
        System.out.println("El vuelo con menos pasajeros es: " + vuelosSet.first().getNombre() + " " + vuelosSet.first().getOrigen() + ", con " +
                vuelosSet.first().getCantidadPasajeros() + " pasajeros.");
        System.out.println("Ordenar por pasajeros: ");
        System.out.println("");
        vuelosSet.forEach(a-> System.out.println(a));
    }
}
