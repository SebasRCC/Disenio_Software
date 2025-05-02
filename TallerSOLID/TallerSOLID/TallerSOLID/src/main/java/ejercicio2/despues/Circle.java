package ejercicio2.despues;
/**
 * 
 * @author Sebastián Ramos
 */
public class Circle implements FiguraGeometrica  {
    private double radius; 
    public Circle(double radius) {
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
