package cap4ClasesDerivadasYPolimofismo;

public abstract class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected double getSueldo() {
        return sueldo;
    }

    protected void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public abstract void presentacion();
    
    public abstract void pedirAumento(double nuevo);
    
    
}
