package problem2;
import java.util.ArrayList;
public class PolyDriver
{
    public static void main(String[] args)
    {
        //Check that exception is thrown when 3 sides are used for rectangle
        ArrayList<Double> mydimr1 = new ArrayList<Double>();
        mydimr1.add(4.0); mydimr1.add(3.0); mydimr1.add(5.0);     
        try {
            Rectangle myrect1 = new Rectangle(mydimr1);
            System.out.println("This line shouldn't be printed -- Rectangle with 3 sides has been constructed!");        }
        catch (Exception e) {
            System.out.println("Rectangle with 3 sides was correctly rejected.");
        }   
        
        //Test if area and perimeter correctly computed for valid rectangle
        ArrayList<Double> mydimr2 = new ArrayList<Double>();
        mydimr2.add(5.0); mydimr2.add(8.0); mydimr2.add(5.0); mydimr2.add(8.0);
        try {
            Rectangle myrect2 = new Rectangle(mydimr2);
            System.out.println(" Valid Rectangle Perimeter: " + myrect2.computePerimeter());
            System.out.println(" Valid Rectangle Area: " + myrect2.computeArea());
        }
        catch (Exception e) {
            System.out.println("Exception incorrectly thrown for valid rectangle.");
        }           

        //Check that exception is thrown when 5 sides are used for right triangle
        ArrayList<Double> mydimt1 = new ArrayList<Double>();
        mydimt1.add(3.0); mydimt1.add(4.0); mydimt1.add(5.0); mydimt1.add(7.0); mydimt1.add(9.0);
        try {
            RightTriangle mytri1 = new RightTriangle(mydimt1);
            System.out.println("This line shouldn't be printed -- Triangle with too many sides has been constructed!");        }
        catch (Exception e) {
            System.out.println("Triangle with 5 sides was correctly rejected.");
        }   

        //Test if area and perimeter correctly computed for valid right triangle
        ArrayList<Double> mydimt2 = new ArrayList<Double>();
        mydimt2.add(3.0); mydimt2.add(4.0); mydimt2.add(5.0);
        try {
            RightTriangle mytri2 = new RightTriangle(mydimt2);
            System.out.println(" Valid Right Triangle Perimeter: " + mytri2.computePerimeter());
            System.out.println(" Valid Right Triangle Area: " + mytri2.computeArea());		}
        catch (Exception e) {
            System.out.println("Triangle with 5 sides was correctly rejected.");
        }   


       
 
        
    }
}
