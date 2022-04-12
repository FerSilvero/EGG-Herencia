package ejercicio3;

public class Lavadora extends Electrodomestico {

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

    
    @Override
    public void PrecioFinal() {
        super.PrecioFinal();

        if (carga > 30) {
            precio += 500;
            //setPrecio(getPrecio() + 500);
        }
    }
}
