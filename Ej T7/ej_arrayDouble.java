class ArrayDouble {
	final int TAM = 5;
	private double a[];

	// Constructor
	public ArrayDouble() { a = new double[TAM]; }

	// Metodo leeTeclado que pide 5 valores y los guarda en cada posicion del array
	public void leeTeclado() {
		for(int i = 0; i < TAM; i++) {
			System.out.print("Introduce un numero: ");
			String sd = System.console().readline();
			a[i] = Double.parseDouble(sd);
		}
	}

	// Metodo muestraArray
	public void muestraArray() {
		for(int )
	}
}