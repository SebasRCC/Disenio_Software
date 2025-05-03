package ejercicio7.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class Shark implements Animal, Swim {
    @Override
    public void eat() {
        System.out.println("Tiburón come");
    }

    @Override
    public void breed() {
        System.out.println("Tiburón se reproduce");
    }

    @Override
    public void swim() {
        System.out.println("Tiburón nada");
    }
    
}
