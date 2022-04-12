package ejercicio3;

public class Electrodomestico {

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
