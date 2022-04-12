package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.PedirDatos();
        circulo.CalcularArea();
        System.out.println("el area del circulo es: " + circulo.getArea());
        circulo.CalcularPerimetro();
        System.out.println("el perimetro del circulo es: " + circulo.getPerimetro());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.PedirDatos();
        rectangulo.CalcularArea();
        System.out.println("el area del rectangulo es: " + rectangulo.getArea());
        rectangulo.CalcularPerimetro();
        System.out.println("el perimetro del rectangulo es: " + rectangulo.getPerimetro());

    }

}
