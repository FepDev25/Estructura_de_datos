package cap4ClasesDerivadasYPolimofismo.ejercicios;

public class Automovil extends Vehiculo{
    private boolean comodo;
    private boolean statussocial;
    
    public Automovil(boolean comodo, boolean status, int Maxvelocidad, String modelo, String marca, double altura, double peso) {
        super(Maxvelocidad, modelo, marca, altura, peso);
        this.comodo = comodo;
        this.statussocial = status;
    }

    public boolean isComodo() {
        return comodo;
    }

    public void setComodo(boolean comodo) {
        this.comodo = comodo;
    }

    public boolean isStatussocial() {
        return statussocial;
    }

    public void setStatussocial(boolean statussocial) {
        this.statussocial = statussocial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Automovil{");
        sb.append("comodo=").append(comodo);
        sb.append(", statussocial=").append(statussocial);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public static void main(String[] args) {
        Automovil v1 = new Automovil(true, true, 100, "Mustang", "Ford", 1.56, 80);
        System.out.println(v1);
    }
}    

abstract class Vehiculo{
    private int Maxvelocidad;
    private String modelo;
    private String marca;
    private double altura;
    private double peso;

    public Vehiculo(int Maxvelocidad, String modelo, String marca, double altura, double peso) {
        this.Maxvelocidad = Maxvelocidad;
        this.modelo = modelo;
        this.marca = marca;
        this.altura = altura;
        this.peso = peso;
    }

    public int getMaxvelocidad() {
        return Maxvelocidad;
    }

    public void setMaxvelocidad(int Maxvelocidad) {
        this.Maxvelocidad = Maxvelocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("Maxvelocidad=").append(Maxvelocidad);
        sb.append(", modelo=").append(modelo);
        sb.append(", marca=").append(marca);
        sb.append(", altura=").append(altura);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}

// Implementar una clase Automovil (Carro) dentro de una jerarquía de herencia. Considere que, 
// además de ser un Vehículo, un automóvil es también una comodidad,  un símbolo de estado social,
// un modo de transporte, etc.