package ejercicio4;

import java.util.Scanner;

public class Principal {

    private double area, perimetro;

    public Principal(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public Principal() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
