package cap4ClasesDerivadasYPolimofismo;

public class Barco {
    public Barco() {
        System.out.print("\tSe crea parte de un barco. ");
    }
    public void alarma() {
        System.out.println("\tS.O.S desde un Barco");
    }
}

class DeVapor extends Barco {
    public DeVapor() {
        System.out.println("Se crea la parte del barco de vapor. ");
    }
    @Override
    public void alarma() {
        System.out.println("\tS.O.S desde un Barco de Vapor");
    }
}

class Velero extends Barco {
    public Velero() {
        System.out.println("Se crea la parte del barco velero. ");
    }
    @Override
    public void alarma() {
        System.out.println("\tS.O.S desde un Velero");
    }
}

class AlarmasDeBarcos {
    public static void main(String[] ar) {
        Barco[] bs = new Barco[2];
        DeVapor mss = new DeVapor();
        Velero vss = new Velero();
        bs[0] = mss;
        bs[1] = vss;
        bs[0].alarma();
        bs[1].alarma();
    }
}
