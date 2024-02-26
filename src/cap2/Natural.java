package cap2;

public class Natural {
    
    private int numeroNatural;

    public Natural(int numeroNatural) {
        this.numeroNatural = numeroNatural;
    }
    
    private boolean esCero(){
        return (numeroNatural == 0);
    }
    
    private int sucesor(){
        return numeroNatural + 1;
    }
    
    private int antecesor(){
        if (this.numeroNatural == 0){
            System.out.println("El 0 no tiene numero natural antecesor");
            return 0;
        } else if (this.numeroNatural == 1){
            System.out.println("El 1 no tiene numero natural antecesor");
            return 1;
        }
        return numeroNatural - 1;
        
    }
    
    private int suma(int numero){
        return numeroNatural += numero;
    }
    
    private int  resta(int numero){
        return numeroNatural -= numero;
    }
    
    private boolean igual(int numero){
        return (numeroNatural == numero);
    }
    
    private boolean esMayor(int numero){
        return (numeroNatural < numero);
    }
    
    private boolean esMenor(int numero){
        return (numeroNatural > numero);
    }
    
    public static void main(String[] args) {
        Natural n1 = new Natural(2);
        System.out.println(n1.numeroNatural + " Es cero? " + n1.esCero());
        System.out.println(n1.numeroNatural + " + " + 5 + " = " + n1.suma(5));
        
        Natural n2 = new Natural(6);
        System.out.println(n2.numeroNatural + " sucesor: " + n2.sucesor());
        System.out.println(n2.numeroNatural + " antecesor: " + n2.antecesor());
        System.out.println(n2.numeroNatural + " - " + 2 + " = " + n2.resta(2));
        
        Natural n3 = new Natural(0);
        System.out.println(n3.numeroNatural + " Es cero? " + n3.esCero());
        System.out.println(n3.numeroNatural + " antecesor: " + n3.antecesor());
    }
    
}
