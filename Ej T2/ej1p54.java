class finanzas {
	
	// atributo
	private float cambio;
	// constructor sin parametros
	public finanzas() {
		cambio = 1.36F;
	}

	// constructor un parametro
	public finanzas(float valor) {
		cambio = valor;
	}

	public float dolaresToEuros(float d) {
		return d/cambio;
	}

	public float eurosToDolares(float e) {
		return e*cambio;
	}
}

class ej1p54 {
	public static void main(String [] args) {
		// f con cambio 1.36
		finanzas f = new finanzas();
		System.out.println("100 euros son " + f.eurosToDolares(100) + " dolares.");
		System.out.println("100 dolares son " + f.dolaresToEuros(100) + " euros.");

		// creo f2 con cambio 1.5
		finanzas f2 = new finanzas(1.5F);
		System.out.println("100 euros son " + f2.eurosToDolares(100) + " dolares.");
		System.out.println("100 dolares son " + f2.dolaresToEuros(100) + " euros.");

		System.exit(0);
	}
}