package usantatecla.V5.entrega;

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

	public boolean hayInterseccion(Interval interval) {
		return this.minimo.getValor() <= interval.getMaximo().getValor() && this.maximo.getValor() >= interval.getMinimo().getValor();
	}
}