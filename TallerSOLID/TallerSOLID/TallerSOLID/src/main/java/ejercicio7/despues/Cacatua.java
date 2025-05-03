package ejercicio7.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class Cacatua implements Animal, Fly, Walk {
    @Override
    public void eat() {
        System.out.println("Cacatua comiendo");
    }
    @Override
    public void breed() {
        System.out.println("Cacatua reproduciendose");
    }

    @Override
    public void fly() {
        System.out.println("Cacatua volando");
    }

    @Override
    public void walk() {
        System.out.println("Cacatua caminando");
    }
    
}
