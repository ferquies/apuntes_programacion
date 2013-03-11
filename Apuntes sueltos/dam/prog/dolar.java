package dam.prog;

public class dolar {
	private double valor;

	public dolar() {
		valor = 0;
	}

	public dolar(double v) {
		valor = v;
	}

	public double toEuros() {
		return valor*1.3;
	}

	public double getValor() {
		return valor;
	}
}