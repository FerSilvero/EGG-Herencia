package ejercicio3;

public class Televisor extends Electrodomestico {

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

    
    @Override
    public void PrecioFinal() {
        super.PrecioFinal();

        if (resolucion > 40) {

            precio = precio * 1.3;
        }

        if (tdt) {
            setPrecio(getPrecio() + 500);
        }
    }
}
