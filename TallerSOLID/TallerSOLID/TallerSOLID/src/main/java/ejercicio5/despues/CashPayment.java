package ejercicio5.despues;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with Cash");
    }
    
}
