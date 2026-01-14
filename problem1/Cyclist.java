package lab1;

public class Cyclist {
	
	@Override
	public double travelElevated(double distkm, double angleDegrees) {
		double basetime = distkm/15;
		return basetime * (1 + Math.pow(angleDegrees, 1.4)/15);
	}
}