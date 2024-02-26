package colecciones.tarea;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo>{
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaDeLlegada;
    private int cantidadPasajeros;

    public Vuelo() {
    }

    public Vuelo(String nombre, String origen, String destino, Date fechaDeLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaDeLlegada = fechaDeLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(Date fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaDeLlegada=" + fechaDeLlegada +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }

    @Override
    public int compareTo(Vuelo o) {
        if (this.cantidadPasajeros == o.cantidadPasajeros) return 0;
        return this.cantidadPasajeros > o.cantidadPasajeros ? 1 : -1;
    }
}
