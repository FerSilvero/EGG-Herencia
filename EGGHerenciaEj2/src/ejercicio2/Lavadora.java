package ejercicio2;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    Scanner entrada = new Scanner(System.in);
    private int carga;

    public Lavadora(int carga, String color, String consumoEnergia, double precio, int peso) {
        super(color, consumoEnergia, precio, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void CrearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga.");
        carga = entrada.nextInt();
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal();

        if (carga > 30) {
            precio += 500;
            //setPrecio(getPrecio() + 500);
        }
        System.out.println(precio);
    }

}
