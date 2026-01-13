package problem2;
 import java.util.ArrayList;
// Class representing a polygon
public abstract class Polygon
{
    // instance variable
    protected ArrayList<Double> sides;
    
    public Polygon(ArrayList<Double> sides)
    {
        this.sides = sides;
    }

    // Calculates the perimeter of the polygon
    public double computePerimeter()
    {
        double perimeter = 0.0;
        
        for (Double aele : sides){
            perimeter += aele;
        }
        
        return perimeter;
    }
    public abstract double computeArea();
}
