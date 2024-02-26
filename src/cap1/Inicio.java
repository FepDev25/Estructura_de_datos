package cap1;


public class Inicio {

    public static void main(String[] args) {
        Ejercicios1 ej1 = new Ejercicios1();
        ej1.buscarSubcadena("Politano, corta la pata de pollo porfavor.", "po");
        ej1.numeroPrimo(7);
        ej1.numeroPrimo(13);
        ej1.numeroPrimo(56);
        ej1.superficieTriangulo(10, 0);
        ej1.superficieTriangulo(14, 7);
        ej1.calculosCirculo(6);
        ej1.palindromo("radar");
        ej1.palindromo("hola");
    }
}
