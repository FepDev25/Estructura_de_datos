// Definir una clase base Persona que contenga información de propósito general común 
// a todas las personas (nombre, dirección, fecha de nacimiento, sexo, etc.). Diseñar 
// una jerarquía de clases que contemple las clases siguientes: Estudiante, Empleado, Estudiante _ Empleado.
//Escribir un programa que lea del dispositivo estándar de entrada los datos para crear una 
// lista de personas: a) general; b) estudiantes; c) empleados; d) estudiantes empleados. 
// El programa deber permitir ordenar alfabéticamente por el primer apellido.

package cap4ClasesDerivadasYPolimofismo.ejercicios;

public class Persona {
    String nombre;
    String direccion;
    String fechaNacimiento;
    char sexo;

    public Persona(String nombre, String direccion, String fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", sexo=").append(sexo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
