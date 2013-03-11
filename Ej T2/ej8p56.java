class coche {
	private String marca, modelo;
	// constructor sin parametros
	public coche() {
		marca = "Seat";
		modelo = "Ibiza";
	}

	// constructor con parametros
	public coche(String mrc, String mdl) {
		marca = mrc;
		modelo = mdl;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
}

class ej8p56 {
	public static void main(String [] args) {
		coche c1 = new coche();
		coche c2 = new coche("Ford", "Mondeo");
		System.out.println("El coche 1 (c1) es un " + c1.getMarca() + " modelo " + c1.getModelo());
		System.out.println("El coche 2 (c2) es un " + c2.getMarca() + " modelo " + c2.getModelo());

		System.exit(0);
	}
}