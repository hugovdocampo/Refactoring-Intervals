package usantatecla.V1.refactor;

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

	public boolean include(double d) {
		return false;
	}

}