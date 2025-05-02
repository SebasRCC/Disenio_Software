package ejercicio3.despues;

public class GuacamayoAzul  extends Bird implements Fly {
    @Override
    public void volar() {
        System.out.println("Volando");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El guacamayo azul emite un sonido característico.");
    }

}
