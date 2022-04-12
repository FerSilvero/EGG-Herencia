package ejercicio1;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, String edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
    }

    @Override
    public void Alimento() {
        System.out.println("El gato se alimenta de: " + this.getAlimento());
    }

}
