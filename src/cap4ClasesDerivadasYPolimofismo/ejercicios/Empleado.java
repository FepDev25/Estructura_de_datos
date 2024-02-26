package cap4ClasesDerivadasYPolimofismo.ejercicios;

public class Empleado extends Persona{
    
    double sueldo;
    String cargo;
    String horario;
    
    public Empleado(String nombre, String direccion, String fechaNacimiento, char sexo, double sueldo, String cargo, String horario) {
        super(nombre, direccion, fechaNacimiento, sexo);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Empleado{");
        sb.append("sueldo=").append(sueldo);
        sb.append(", cargo=").append(cargo);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
