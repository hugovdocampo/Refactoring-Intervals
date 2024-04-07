package usantatecla.V2.green;

public class Interval {

	private double minimo;
	private double max;

	public Interval(double minimo, double max) {
		this.minimo = minimo;
		this.max = max;
	}

	public double getMinimo() {
		return this.minimo;
	}

	public double getMax() {
		return this.max;
	}

	public boolean include(double d) {
		return false;
	}

}