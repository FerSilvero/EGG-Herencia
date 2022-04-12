package ejercicio4;

import java.util.Scanner;

public class Circulo extends Principal implements CalculosFormas{
    
    private double radio, diametro;
    
    public Circulo(double area, double perimetro, double radio, double diametro) {
        super(area, perimetro);
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }


    public void PedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = entrada.nextDouble();
        System.out.println("Ingrese el diametro");
        diametro = entrada.nextDouble();
    }
    
    @Override
    public double CalcularArea() {
        setArea(Math.PI * (Math.sqrt(radio)));
        return getArea();
    }
   
    @Override
    public double CalcularPerimetro(){
        setPerimetro(Math.PI * diametro);
        return getPerimetro();
    }
    
    
}
