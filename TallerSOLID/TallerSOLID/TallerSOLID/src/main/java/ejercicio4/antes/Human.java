/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.antes;

/**
 *
 * @author Marcela
 */
public class Human implements Worker {

    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        // Robots don't eat!
        throw new UnsupportedOperationException();
    }
}
