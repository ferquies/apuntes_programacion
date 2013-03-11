class restaurante {
	private float papas, chocos;

	// constructor
	public restaurante() {
		papas = 0;
		chocos = 0;
	}

	public int clientes(float p, float c) {
		float ppp, cpp;
		papas = p;
		chocos = c;

		ppp = papas/0.33F;
		cpp = chocos/0.16F;

		if(ppp >= cpp) { return (int)cpp; } else { return (int)ppp; }
	}
}

class ej11p57 {
	public static void main(String [] args) {
		restaurante r = new restaurante();
		System.out.println("Papas = 11.3\nChocos = 5.2");
		System.out.println("Clientes: " + r.clientes(11.3F, 5.2F));

		System.exit(0);
	}
}