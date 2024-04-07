package usantatecla.V4.green;

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
		double inicioOtroIntervalo = interval.getMinimo().getValor();
		double finOtroIntervalo = interval.getMaximo().getValor();
		double inicioEsteIntervalo = this.minimo.getValor();
		double finEsteIntervalo = this.maximo.getValor();

		boolean inicioDentro = inicioEsteIntervalo >= inicioOtroIntervalo && inicioEsteIntervalo <= finOtroIntervalo;
		boolean finDentro = finEsteIntervalo >= inicioOtroIntervalo && finEsteIntervalo <= finOtroIntervalo;
		boolean otroInicioDentro = inicioOtroIntervalo >= inicioEsteIntervalo && inicioOtroIntervalo <= finEsteIntervalo;
		boolean otroFinDentro = finOtroIntervalo >= inicioEsteIntervalo && finOtroIntervalo <= finEsteIntervalo;

		return inicioDentro || finDentro || otroInicioDentro || otroFinDentro;
	}

}