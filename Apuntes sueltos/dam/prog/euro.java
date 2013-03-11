package dam.prog;

public class euro {
	private double valor;

	public euro() {
		valor = 0;
	}

	public euro(double v) {
		valor = v;
	}

	public double toDolares() {
		return valor*0.8;
	}

	public double getValor() {
		return valor;
	}
}