package usantatecla.V4.refactor;

public class Extremo {

    private double valor;
    private boolean incluido;

    public Extremo(double valor, boolean incluido) {
        this.valor = valor;
        this.incluido = incluido;
    }

    public double getValor() {
        return this.valor;
    }

    public boolean isIncluido() {
        return this.incluido;
    }

}
