package cap4ClasesDerivadasYPolimofismo;

import java.util.ArrayList;

public class Programador extends Empleado{
    private ArrayList<String> tecnologias;

    public Programador(String nombre, double sueldo) {
        super(nombre, sueldo);
        this.tecnologias = new ArrayList<>();
    }

    public ArrayList<String> getTecnologias() {
        return tecnologias;
    }

    public Programador setTecnologias(String tecnologia) {
        this.tecnologias.add(tecnologia);
        return this;
    }
    
    @Override
    public void presentacion() {
        System.out.println("Me llamo " + this.getNombre() + " y gano " + this.getSueldo() + ". Soy Programador");
    }
    
    @Override
    public void pedirAumento(double nuevoSueldo) {
        System.out.println("Quiero un aumento, quiero que mi nuevo sueldo sea: " + nuevoSueldo);
    }
    
    
    public static void main(String[] args) {
        Programador p = new Programador("Felipe", 400);
        System.out.println(p.getNombre() + " " + p.getSueldo());
        p.setTecnologias("Java").setTecnologias("Python").setTecnologias("JavaScript");
        System.out.println(p.getTecnologias());
        p.presentacion();
        p.pedirAumento(700);
    }

    

    
    
}
