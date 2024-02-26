package cap4ClasesDerivadasYPolimofismo.ejercicios;

public class AnimalEjercicio {

    public static void main(String[] args) {
        Perro p = new Perro();
        p.hablar();
    }
}

// Implementar una jerarquía de herencia de animales que contenga al menos seis niveles de derivación y doce clases.
abstract class SerPlanetaTierra {

    public void hablar() {
        System.out.println("Soy un SerPlanetaTierra");
    }
}

class serVivo extends SerPlanetaTierra {

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un serVivo");
    }
}

class SerPensante extends serVivo {

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un SerPensante");
    }
}

class Animal extends SerPensante {

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un Animal");
    }
}

class Vertebrado extends Animal {

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un Vertebrado");
    }
}

class Mamiferos extends Vertebrado{

    @Override
    public void hablar(){
        super.hablar();
        System.out.println("Soy un Mamifero");
    }
}

class Aves extends Vertebrado{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un ave");
    }
}

class Reptiles extends Vertebrado{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un reptil");
    }
}

class Anfibios extends Vertebrado{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un anfibio");
    }
}

class PecesOseos extends Vertebrado{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un pez oceo");
    }
}

class PecesCartiliginosos extends Vertebrado{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un pez catiliginoso");
    }
}

class Invertebrados extends Animal{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un Invertebrados");
    }
}

class Poriferos extends Invertebrados{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un Poriferos");
    }
}

class Cnidarios extends Invertebrados{

    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un Cnidarios");
    }
}

class Perro extends Mamiferos{
    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy un Perro");
    }
}
