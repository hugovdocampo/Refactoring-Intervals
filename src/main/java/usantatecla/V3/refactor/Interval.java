package usantatecla.V3.refactor;

public class Interval {

	private Extremo minimo;
	private Extremo maximo;

	public Interval(Extremo minimo, Extremo maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public Extremo getMinimo() {
		return this.minimo;
	}

	public Extremo getMaximo() {
		return this.maximo;
	}

}