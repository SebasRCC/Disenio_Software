package ejercicio5.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with Cash");
    }
    
}
