package cap2;

public class Complejo {
    private double real;
    private double imaginario;
    
    public Complejo() {
    }

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public void asignarReal(double real){
        this.real = real;
    }
    
    public void asignarImaginario(double imaginario){
        this.imaginario = imaginario;
    }
    
    public double parteReal(){
        return this.real;
    }
    
    public double parteImaginario(){
        return this.imaginario;
    }
    
    public double modulo(){
        double realAbsoluto = Math.abs(this.real);
        double imaginarioAbsoluto = Math.abs(this.imaginario);
        double moduloAux = Math.pow(realAbsoluto, 2) + Math.pow(imaginarioAbsoluto, 2);
        return Math.sqrt(moduloAux);
    }
    
    public Complejo sumar(Complejo c2){
        double parteReal = this.real + c2.real;
        double parteImaginaria = this.imaginario + c2.imaginario;
        return new Complejo(parteReal, parteImaginaria);
    }
    
    public Complejo restar(Complejo c2){
        double parteReal = this.real - c2.real;
        double parteImaginaria = this.imaginario - c2.imaginario;
        return new Complejo(parteReal, parteImaginaria);
    }
    
    public void imprimirComplejo(){
        System.out.println(this.real + " + " + this.imaginario + "i");
    }
}
