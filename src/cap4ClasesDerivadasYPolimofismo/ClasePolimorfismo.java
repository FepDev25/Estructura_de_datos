package cap4ClasesDerivadasYPolimofismo;

public class ClasePolimorfismo {
    public static void main(String[] args) {
        Persona p1 = new Persona("Felipe");
        Persona p2 = new Persona("Marcos");
        Persona p3 = new Persona("Juan");
        Persona l1 = new Ladron("Kevin");
        Persona l2 = new Ladron("Joel");
        Persona pr1 = new Profesor("Erick");
        Persona pr2 = new Profesor("David");
        Persona psc1 = new PracticanteProfesro("David");
        
        Persona [] personas = new Persona[8];
        personas[0] = pr1;
        personas[1] = l2;
        personas[2] = p1;
        personas[3] = pr2;
        personas[4] = p3;
        personas[5] = l1;
        personas[6] = p2;
        personas[7] = psc1;
        
        for (int i = 0; i < personas.length; i++) {
            personas[i].hablar();
        }
    }
}

class Persona{
    String nombre;
    public Persona (String nombre){
        this.nombre = nombre;
    }
    
    public void hablar(){
        System.out.println("Hola soy solo una persona");
    }
}

class Ladron extends Persona{
    
    public Ladron(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hablar(){
        System.out.println("Hola soy un ladron");
    }
    
}

class Profesor extends Persona{
    
    public Profesor(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hablar(){
        System.out.println("Hola soy un profesor");
    }
    
}

class PracticanteProfesro extends Profesor{
    public PracticanteProfesro(String nombre) {
        super(nombre);
    }
    @Override
    public void hablar(){
        System.out.println("Hola soy un pasante de profesor");
    }
}