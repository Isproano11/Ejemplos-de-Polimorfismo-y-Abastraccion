
package ClaseAbstracta;

public class ClasePrincipal {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        System.out.println(miPerro.hacerSonido());  // Salida: ¡Guau!
        System.out.println(miGato.hacerSonido());    // Salida: ¡Miau!

        miPerro.dormir();  // Salida: El animal está durmiendo.
        miGato.dormir();   // Salida: El animal está durmiendo.
    }
}
