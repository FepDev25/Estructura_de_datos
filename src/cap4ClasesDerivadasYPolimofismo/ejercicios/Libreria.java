package cap4ClasesDerivadasYPolimofismo.ejercicios;

public class Libreria {
    String nombre;
    int cantidad;
    int  numSecciones;

    public Libreria(String nombre, int cantidad, int numSecciones) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.numSecciones = numSecciones;
    }
    
    public void  informacion(){
        System.out.println(nombre + ". Cantidad de secciones: " + numSecciones + ". Cantidad de libros: " + cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumSecciones() {
        return numSecciones;
    }

    public void setNumSecciones(int numSecciones) {
        this.numSecciones = numSecciones;
    }

    @Override
    public String toString() {
        return "Libreria{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", numSecciones=" + numSecciones + '}';
    }
    
    
}

class Teror extends Libreria{
    
    public Teror(String nombre, int cantidad, int numSecciones) {
        super(nombre, cantidad, numSecciones);
    }
}

class Drama extends Libreria{
    
    public Drama(String nombre, int cantidad, int numSecciones) {
        super(nombre, cantidad, numSecciones);
    }
}

class Fantasia extends Libreria{
    
    public Fantasia(String nombre, int cantidad, int numSecciones) {
        super(nombre, cantidad, numSecciones);
    }
}

class Main{
    public static void main(String[] args) {
        Libreria l =  new Libreria("Libreria Principal", 1300,25);
        System.out.println("l = " + l);
        Libreria g1 =  new Teror("Seccion Terror", 204,4);
        System.out.println("g1 = " + g1);
        Libreria g2 =  new Drama("Seccion Drama", 319,5);
        System.out.println("g2 = " + g2);
        Libreria g3 =  new Fantasia("Seccion Fantasia", 178,3);
        System.out.println("g3 = " + g3);
        System.out.println(g3);
    }
}