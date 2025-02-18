
package Polimorfismo;


public class ClaseEjecutable {
    public static void main(String[] args) {
        Animal miAnimal;

        miAnimal = new Perro();
        miAnimal.hacerSonido(); // Salida: ¡Guau!

        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Salida: ¡Miau!
    }
}
