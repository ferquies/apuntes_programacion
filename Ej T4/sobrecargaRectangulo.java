class rectangulo {
	// Inicializador
	static {
		System.out.println("Se ha inicializado la clase rectangulo");
	}

	private int ancho;
	private int alto;

	rectangulo(int an, int al) {
		ancho = an;
		alto = al;
	}

	rectangulo() { ancho=alto=0; }

	rectangulo(int dato) { ancho=alto=dato; }

	// Constructor de copia
	rectangulo(rectangulo r) {
		this.ancho = r.ancho;
		this.alto = r.alto;
	}

	public int getAncho() { return ancho; }
	public int getAlto() { return alto; }
	public rectangulo incrementarAncho() {
		ancho++;
		return this;
	}
	public rectangulo incrementarAlto() {
		alto++;
		return this;
	}
}

public class sobrecargaRectangulo {
	public static void main(String[] args) {
		rectangulo r1 = new rectangulo(5, 7);
		rectangulo r2 = new rectangulo();
		r2 = r1;
		r2.incrementarAncho();
		r2.incrementarAlto();
		System.out.println("Alto: " + r1.getAlto());
		System.out.println("Ancho: " + r1.getAncho());
		System.out.println("Alto: " + r2.getAlto());
		System.out.println("Ancho: " + r2.getAncho());

		// Creamos un tercer rectangulo utilizando el constructor de copia
		rectangulo r3 = new rectangulo(r1);
		System.out.println("Alto: " + r3.getAlto());
		System.out.println("Ancho: " + r3.getAncho());

	}
}