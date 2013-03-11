abstract class Figura {
	protected String color;

	public abstract double area();
}

class Cuadrado extends Figura {
	private double lado;

	public Cuadrado() {
		lado = 1;
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double area() {
		return lado*lado;
	}

	public String getColor() {
		return this.color;
	}

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class ej8 {
	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(4);

		System.out.println("El lado del cuadrado es " + c.getLado());
		System.out.println("El area del cuadrado es " + c.area());
	}
}