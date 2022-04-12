package ejercicio4;

import java.util.Scanner;

public class Rectangulo extends Principal implements CalculosFormas {

    private double base, altura;

    public Rectangulo(double area, double perimetro) {
        super(area, perimetro);
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void PedirDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
    }

    @Override
    public double CalcularArea() {
        setArea(base * altura);
        return getArea();
    }

    @Override
    public double CalcularPerimetro() {
        setPerimetro((base + altura) * 2);
        return getPerimetro();
    }

}
