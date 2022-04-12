package ejercicio1;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, String edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }

    @Override
    public void Alimento() {
        System.out.println("El perro se alimenta de: " + this.getAlimento());
    }

}
