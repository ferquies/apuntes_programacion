class Rectangulo {
	private double lado1, lado2;
	private static int cuentaRectangulo = 0;

	public Rectangulo() {
		lado1 = 1; lado2 = 1;
		cuentaRectangulo++;
	}

	public Rectangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		cuentaRectangulo++;
	}

	public Rectangulo(Rectangulo r) {
		this.lado1 = r.lado1;
		this.lado2 = r.lado2;
		cuentaRectangulo++;
	}

	public void setLado1(double lado) {
		this.lado1 = lado;
	}

	public void setLado2(double lado) {
		this.lado2 = lado;
	}

	public double getLado1() {
		return this.lado1;
	}

	public double getLado2() {
		return this.lado2;
	}

	public double area() {
		return this.lado1 * this.lado2;
	}

	public static int cuenta() {
		return cuentaRectangulo;
	}
}

public class clase {
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(12.3, 8.7);
		Rectangulo r3 = new Rectangulo(r2);

		System.out.println("r2 lado1: " + r2.getLado1());
		System.out.println("r3 lado2: " + r3.getLado2());
		r1.setLado1(10.2);
		r2.setLado2(3.6);
		System.out.println("r2 lado2: " + r2.getLado2());
		System.out.println("area r3: " + r3.area());
		System.out.println("Total rectangulos creados: " + Rectangulo.cuenta());
	}
}