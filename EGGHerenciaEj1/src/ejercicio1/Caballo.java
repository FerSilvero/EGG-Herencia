package ejercicio1;

public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, String edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
    }

    @Override
    public void Alimento() {
        System.out.println("El caballo se alimenta de: " + this.getAlimento());
    }

}
