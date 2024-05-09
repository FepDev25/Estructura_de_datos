package cap4ClasesDerivadasYPolimofismo;

public class ClaseInterfaces {
    public static void main(String[] args) {
        Futbolista f1 =  new Futbolista("Felipe", "Chelsea FC",
                13,"Keto",0,0);
        System.out.println(f1);
        f1.setCantidadTrofeosDisputados();
        f1.setCantidadTrofeosDisputados();f1.setHorasEntranamiento(4);
        System.out.println(f1);
        System.out.println(f1.informacion());
        f1.setCantidadTrofeosDisputados();
        f1.setCantidadTrofeosGanados();
        System.out.println(f1);
    }
}

interface IDeportista {
    double horasEntranamiento();
    String tipoDieta();
    int cantidadTrofeosDisputados();
    int cantidadTrofeosGanados();
}

interface Persona {
    String informacion();
}

class Futbolista implements IDeportista, Persona{  
    double horasEntranamiento;
    String tipoDieta;
    int cantidadTrofeosDisputados;
    int cantidadTrofeosGanados;
    String nombre;
    String equipo;

    public Futbolista(String nombre, String equipo, double horasEntranamiento, String tipoDieta, int cantidadTrofeosDisputados, int cantidadTrofeosGanados) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.horasEntranamiento = horasEntranamiento;
        this.tipoDieta = tipoDieta;
        this.cantidadTrofeosDisputados = cantidadTrofeosDisputados;
        this.cantidadTrofeosGanados = cantidadTrofeosGanados;
    }

    public double getHorasEntranamiento() {
        return horasEntranamiento;
    }

    public void setHorasEntranamiento(double horasEntranamiento) {
        this.horasEntranamiento = this.horasEntranamiento+ horasEntranamiento;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    public int getCantidadTrofeosDisputados() {
        return cantidadTrofeosDisputados;
    }

    public void setCantidadTrofeosDisputados() {
        this.cantidadTrofeosDisputados = this.cantidadTrofeosDisputados + 1;
    }

    public int getCantidadTrofeosGanados() {
        return cantidadTrofeosGanados;
    }

    public void setCantidadTrofeosGanados() {
        this.cantidadTrofeosGanados = this.cantidadTrofeosGanados + 1;
    }

    @Override
    public double horasEntranamiento() {
        return this.getHorasEntranamiento();
    }

    @Override
    public String tipoDieta() {
        return this.getTipoDieta();
    }

    @Override
    public int cantidadTrofeosDisputados() {
        return this.getCantidadTrofeosDisputados();
    }

    @Override
    public int cantidadTrofeosGanados() {
        return this.getCantidadTrofeosGanados();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "horasEntranamiento=" + horasEntranamiento + ", tipoDieta=" + tipoDieta + ", cantidadTrofeosDisputados=" + cantidadTrofeosDisputados + ", cantidadTrofeosGanados=" + cantidadTrofeosGanados + ", nombre=" + nombre + ", equipo=" + equipo + '}';
    }

    @Override
    public String informacion() {
        return "Me llamo " + this.nombre + " y juego en el " + this.equipo;
    }
}


