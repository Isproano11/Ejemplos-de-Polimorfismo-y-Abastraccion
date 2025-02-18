
package ClaseAbstracta;

// Definimos una clase abstracta
abstract class Animal {
    
    // Método abstracto
    public abstract String hacerSonido();
    
    // Método concreto
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}

// Clase que hereda de Animal
class Perro extends Animal {
    
    @Override
    public String hacerSonido() {
        return "¡Guau!";
    }
}

// Clase que hereda de Animal
class Gato extends Animal {
    
    @Override
    public String hacerSonido() {
        return "¡Miau!";
    }
}