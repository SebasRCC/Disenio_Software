package ejercicio5.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class ShoppingCart {
    private Payment payment;
    
    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }
    public void checkout(double amount) {
        payment.pay(amount);
    }
}
