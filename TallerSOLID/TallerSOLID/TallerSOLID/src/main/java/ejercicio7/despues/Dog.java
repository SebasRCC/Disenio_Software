package ejercicio7.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class Dog implements Animal, Walk, Swim {

    @Override
    public void eat() {
        System.out.println("El perro come");
    }
    @Override
    public void breed() {
        System.out.println("El perro se reproduce");
    }

    @Override
    public void walk() {
        System.out.println("El perro camina");
    }

    @Override
    public void swim() {
        System.out.println("El perro nada");
    }
    
}
