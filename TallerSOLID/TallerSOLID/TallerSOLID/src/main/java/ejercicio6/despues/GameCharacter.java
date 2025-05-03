package ejercicio6.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class GameCharacter {
    private InputDevice input;

    public GameCharacter(InputDevice input) {
        this.input = input;
    }
    public void move(InputDevice input) {
        input.getInput();
    }
}
