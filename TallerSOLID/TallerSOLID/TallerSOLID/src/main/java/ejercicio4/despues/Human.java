package ejercicio4.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class Human implements Worker, Eat {

    @Override
    public void work() {
        System.out.println("Human working...");
    }
    @Override
    public void eat() {
        System.out.println("Human eating...");
    }
}
