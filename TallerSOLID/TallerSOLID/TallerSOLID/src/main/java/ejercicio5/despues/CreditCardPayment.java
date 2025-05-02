package ejercicio5.despues;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with Credit Card");
    }
    
}
