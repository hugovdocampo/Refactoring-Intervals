package usantatecla.V3.green;

public class Interval {

	private double minimo;
	private double maximo;

	public Interval(double minimo, double maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public double getMinimo() {
		return this.minimo;
	}

	public double getMaximo() {
		return this.maximo;
	}

	public boolean include(double d) {
		return false;
	}

}