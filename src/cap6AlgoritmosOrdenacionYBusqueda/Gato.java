package cap6AlgoritmosOrdenacionYBusqueda;

public class Gato implements Comparable<Gato> {
    private String nombre;
    private int edad;
    private double peso;
    private String esclavo;

    public Gato(String nombre, int edad, double peso, String esclavo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.esclavo = esclavo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEsclavo() {
        return esclavo;
    }

    public void setEsclavo(String esclavo) {
        this.esclavo = esclavo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gato{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", peso=").append(peso);
        sb.append(", esclavo=").append(esclavo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Gato otroGato) {
        return this.nombre.compareTo(otroGato.nombre);
    }
    
}
