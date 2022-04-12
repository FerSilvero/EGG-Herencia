package ejercicio1;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Firulais", "Hueso", "8", "Rottwailer");
        Gato gato = new Gato("Bombon", "Balanceado", "5", "Tigre gris");
        Caballo caballo = new Caballo("Antonio", "Pasto", "12", "De carreras");

        perro.Alimento();
        gato.Alimento();
        caballo.Alimento();
    }

}
