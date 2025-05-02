package ejercicio2.despues;

public class Rectangle implements FiguraGeometrica {
    private double width; 
    private double height; 
    public Rectangle(double width, double height){
        this.height= height; 
        this.width= width; 
    }
    @Override
    public double getArea(){
        return height*width;
    }
}
