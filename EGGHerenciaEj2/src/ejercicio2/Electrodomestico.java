package ejercicio2;

import java.util.Scanner;

public class Electrodomestico {

    Scanner entrada = new Scanner(System.in);
    protected String color, consumoEnergia;
    protected int peso;
    protected double precio;

    public Electrodomestico(String color, String consumoEnergia, double precio, int peso) {
        this.color = color;
        this.consumoEnergia = consumoEnergia;
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(String consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void ComprobarConsumoEnergia(char letra) {
        letra = consumoEnergia.charAt(0);
        switch (Character.toUpperCase(letra)) {
            case 'A':
                System.out.println("Es correcto.");
                break;
            case 'B':
                System.out.println("Es correcto.");
                break;
            case 'C':
                System.out.println("Es correcto.");
                break;
            case 'D':
                System.out.println("Es correcto.");
                break;
            case 'E':
                System.out.println("Es correcto.");
                break;
            case 'F':
                System.out.println("Es correcto.");
                break;
            default:
                System.out.println("No es correcto. Se asigna F por defecto.");
                letra = 'F';
        }
        consumoEnergia = Character.toString(letra);
    }

    public void ComprobarColor(String color) {
        this.color = color;
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
                || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {

            System.out.println("Color correcto.");

        } else {
            System.out.println("No es correcto. Se asigna blanco por defecto.");

            this.color = "blanco";
        }

    }

    public void crearElectrodomestico() {
        precio = 1000;

        System.out.println("Ingrese el color disponible que desea: Blanco, Negro, Rojo, azul, gris.");
        color = entrada.next();
        ComprobarColor(color);

        System.out.println("Ingrese el consumo que desea: A, B, C, D , E, F");
        consumoEnergia = entrada.next();
        ComprobarConsumoEnergia(consumoEnergia.charAt(0));

        System.out.println("Ingrese el peso del electrodomestico a adquirir.");
        peso = entrada.nextInt();
    }

    public void PrecioFinal() {

        switch (consumoEnergia.toUpperCase()) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
                break;

        }

        if (peso == 1 || peso <= 19) {
            precio += 100;

        } else if (peso == 20 || peso <= 49) {
            precio += 500;

        } else if (peso == 50 || peso <= 79) {
            precio += 800;
        
        } else if (peso >= 80) {
            precio += 1000;
        }

    }

}
