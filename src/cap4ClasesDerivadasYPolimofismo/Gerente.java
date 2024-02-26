package cap4ClasesDerivadasYPolimofismo;

public class Gerente extends Empleado{

    public Gerente(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public void presentacion() {
        System.out.println("Me llamo " + this.getNombre() + " y gano " + this.getSueldo() + ". Soy Gerente");
    }

    @Override
    public void pedirAumento(double nuevoSueldo) {
        System.out.println("Quiero un aumento, como gerente de la empresa quiero que mi nuevo sueldo sea: " + nuevoSueldo);
    }
    
}
