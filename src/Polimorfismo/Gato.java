/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

// Clase derivada Gato
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}