package cap4ClasesDerivadasYPolimofismo.ejercicios;

import java.util.Scanner;

public class InicioPersonaBase {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String nombre;
        String direccion;
        String fechaNacimiento;
        char sexo;
        String cargo;
        String horarioTrabajo;
        String universidad;
        String horarioUniversidad;
        double sueldo;

        String textoMenu = """
                           1. Persona
                           2. Empleado
                           3. Estudiante
                           4. Estudiante_Empleado
                           """;

        System.out.println("Ingresar tamanio del array de Personas: ");
        Scanner s = new Scanner(System.in);
        int lenghtArray = s.nextInt();
        Persona[] personas = new Persona[lenghtArray];
        System.out.println("Tamanio del array: " + lenghtArray);

        int contador = 0;

        while (contador < lenghtArray) {
            System.out.println(textoMenu);
            System.out.println("Que tipo de Persona desea ingresar? ");
            int opcion = s.nextInt();
            s.nextLine();
            switch (opcion) {
                case 1 ->  {
                    System.out.println("Ingresar nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Ingresar direccion: ");
                    direccion = s.nextLine();
                    System.out.println("Ingresar fecha Nacimiento: ");
                    fechaNacimiento = s.nextLine();
                    System.out.println("Ingresar sexo: ");
                    sexo = s.next().charAt(0);

                    Persona aux = new Persona(nombre, direccion, fechaNacimiento, sexo);
                    personas[contador] = aux;
                    contador++;
                    System.out.println("Persona agregada con exito");

                }
                case 2 ->  {
                    System.out.println("Ingresar nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Ingresar direccion: ");
                    direccion = s.nextLine();
                    System.out.println("Ingresar fecha Nacimiento: ");
                    fechaNacimiento = s.nextLine();
                    System.out.println("Ingresar sexo: ");
                    sexo = s.next().charAt(0);
                    System.out.println("Ingresar sueldo: ");
                    sueldo = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingresar cargo: ");
                    cargo = s.nextLine();
                    System.out.println("Ingresar horario trabajo");
                    horarioTrabajo = s.nextLine();

                    Empleado aux = new Empleado(nombre, direccion, fechaNacimiento, sexo,
                            sueldo, cargo, horarioTrabajo);
                    personas[contador] = aux;
                    contador++;
                    System.out.println("Empleado agregada con exito");
                }
                case 3 ->  {
                    System.out.println("Ingresar nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Ingresar direccion: ");
                    direccion = s.nextLine();
                    System.out.println("Ingresar fecha Nacimiento: ");
                    fechaNacimiento = s.nextLine();
                    System.out.println("Ingresar sexo: ");
                    sexo = s.next().charAt(0);
                    System.out.println("Ingresar universidad");
                    universidad = s.nextLine();
                    System.out.println("Ingresar horario universidad");
                    horarioUniversidad = s.nextLine();

                    Estudiante aux = new Estudiante(nombre, direccion, fechaNacimiento, sexo,
                            universidad, horarioUniversidad);
                    personas[contador] = aux;
                    contador++;
                    System.out.println("Estudiante agregada con exito");
                }
                case 4 ->  {

                    System.out.println("Ingresar nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Ingresar direccion: ");
                    direccion = s.nextLine();
                    System.out.println("Ingresar fecha Nacimiento: ");
                    fechaNacimiento = s.nextLine();
                    System.out.println("Ingresar sexo: ");
                    sexo = s.next().charAt(0);
                    System.out.println("Ingresar sueldo: ");
                    sueldo = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingresar cargo: ");
                    cargo = s.nextLine();
                    System.out.println("Ingresar horario trabajo");
                    horarioTrabajo = s.nextLine();
                    System.out.println("Ingresar universidad");
                    universidad = s.nextLine();
                    System.out.println("Ingresar horario universidad");
                    horarioUniversidad = s.nextLine();

                    Estudiante_Empleado aux = new Estudiante_Empleado(nombre, direccion, fechaNacimiento, sexo, sueldo,
                            cargo, horarioTrabajo, universidad, horarioUniversidad);
                    personas[contador] = aux;
                    contador++;
                    System.out.println("Empleado_Estudiante agregada con exito");
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
        }

        imprimirArray(personas);
    }

    public static void imprimirArray(Persona[] personas) {
        System.out.println("Personas: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
