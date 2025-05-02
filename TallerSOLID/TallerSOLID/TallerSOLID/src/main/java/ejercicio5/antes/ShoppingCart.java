/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.antes;

/**
 *
 * @author Marcela
 */
public class ShoppingCart {

    private CreditCardPayment payment;

    public ShoppingCart() {
        this.payment = new CreditCardPayment();
    }

    public void checkout(double amount) {
        payment.pay(amount);
    }
}
