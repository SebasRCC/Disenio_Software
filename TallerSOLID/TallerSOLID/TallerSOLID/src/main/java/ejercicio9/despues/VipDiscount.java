package ejercicio9.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class VipDiscount implements DiscountCalculator {
    @Override
    public void calculateDiscount(double amount) {
        double discount = amount * 0.2;
        System.out.println("Descuento para el usuario VIP: " + discount);
    }
    
}
