/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7.antes;

/**
 *
 * @author Marcela
 */
public class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("Dog walking");
    }

    @Override
    public void swim() {
        System.out.println("Dog swimming");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
