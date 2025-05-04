package ejercicio9.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class RegularDiscount implements DiscountCalculator {
    @Override
    public void calculateDiscount(double amount) {
        double discount = amount * 0.1;
        System.out.println("Descuento para el usuario regular: " + discount);
    }
    
}
