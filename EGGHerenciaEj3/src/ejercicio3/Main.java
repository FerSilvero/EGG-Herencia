package ejercicio3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Electrodomestico tv1 = new Televisor(32, false, "negro", "b", 30000, 20);
        Electrodomestico lv1 = new Lavadora(7, "blanco", "a", 12000, 45);
        
        Electrodomestico tv2 = new Televisor(20, false, "gris", "b", 60000, 10);
        Electrodomestico lv2 = new Lavadora(5, "azul", "c", 20000, 45);
        

        electrodomesticos.add(tv1);
        electrodomesticos.add(lv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(lv2);

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

        System.out.println("El precio final de los televisores es: $$" + tvPrecio);
        System.out.println("El precio final de las lavadoras es: $$" + lvPrecio);
        System.out.println("El precio total de todos los electrodomesticos es: $$" + sumaPrecios);
    }
}
