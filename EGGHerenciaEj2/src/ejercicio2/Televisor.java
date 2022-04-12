package ejercicio2;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    Scanner entrada = new Scanner(System.in);
    private int resolucion;
    private boolean tdt;

    public Televisor(int resolucion, boolean tdt, String color, String consumoEnergia, double precio, int peso) {
        super(color, consumoEnergia, precio, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void CrearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese de cuantas pulgadas desea el televisor.");
        resolucion = entrada.nextInt();

        System.out.println("¿Tiene sintonizador TDT? True o False");
        tdt = entrada.nextBoolean();
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal();

        if (resolucion > 40) {

            precio = precio * 1.3;
            
        }
        
        if (tdt) {
            setPrecio(getPrecio() + 500);
        }
        //System.out.println(precio);
    }

   

    

    
    
}
