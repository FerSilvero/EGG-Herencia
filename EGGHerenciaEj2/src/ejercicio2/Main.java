package ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        /*Lavadora lv = new Lavadora();
        lv.CrearLavadora();
        lv.PrecioFinal();
        
        Televisor tv = new Televisor();
        tv.CrearTelevisor();
        tv.PrecioFinal();*/
        
        
        Electrodomestico tv1 = new Televisor(32, false, "negro", "b", 30000, 20);
        Electrodomestico lv1 = new Lavadora(7, "blanco", "a", 12000, 45);

        electrodomesticos.add(tv1);
        electrodomesticos.add(lv1);

        double lvPrecio = 0;
        double tvPrecio = 0;
        double sumaPrecios = 0;
        for (Electrodomestico e : electrodomesticos) {
            e.PrecioFinal();
            if (e instanceof Lavadora) {
                lvPrecio = lvPrecio + e.getPrecio();

            } else if (e instanceof Televisor) {
                tvPrecio = tvPrecio + e.getPrecio();
                
            }
            sumaPrecios = sumaPrecios + e.getPrecio();
        }
        
        System.out.println("tv " + tvPrecio);
        System.out.println("lv " + lvPrecio);
        System.out.println("total " + sumaPrecios);
    }

}
