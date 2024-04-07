package usantatecla.V1.green;

public class Interval {

	private double min;
	private double max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public double getMin() {
		return this.min;
	}

	public boolean include(double d) {
		return false;
	}

}