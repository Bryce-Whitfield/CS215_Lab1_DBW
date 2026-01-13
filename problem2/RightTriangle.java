package problem2;
import java.util.ArrayList;

public class RightTriangle extends Polygon {

	public RightTriangle(ArrayList<Double> sides) {
		super(check_input(sides));
	}
	
	private static ArrayList<Double> check_input(ArrayList<Double> sides) {
		if(sides.size() != 3) {
			throw new IllegalArgumentException("Wrong number of sides");
		} else {
			return sides;
		}
	}
	
	@Override
	public double computeArea() {
		double area = 1;
		for(int i = 0;i<2;i++) {
			area = area * sides.get(i);
		}
		area = area * 0.5;
		return area;
	}

}
