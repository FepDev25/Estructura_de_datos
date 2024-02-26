package cap4ClasesDerivadasYPolimofismo.ejercicios;

public class Estudiante_Empleado extends Empleado{
    
    String universidad;
    String horarioUniversidad;
    
    public Estudiante_Empleado(String nombre, String direccion, String fechaNacimiento, char sexo, 
            double sueldo, String cargo, String horarioTrabajo,  String universidad, String horarioUniversidad) {
        super(nombre, direccion, fechaNacimiento, sexo, sueldo, cargo, horarioTrabajo);
        this.universidad = universidad;
        this.horarioUniversidad = horarioUniversidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHorarioUniversidad() {
        return horarioUniversidad;
    }

    public void setHorarioUniversidad(String horarioUniversidad) {
        this.horarioUniversidad = horarioUniversidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Estudiante_Empleado{");
        sb.append("universidad=").append(universidad);
        sb.append(", horarioUniversidad=").append(horarioUniversidad);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
