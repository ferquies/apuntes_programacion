class almacen {
	private float chocos, papas;

	public void addChocos(float x) { chocos += x; }

	public void addPapas(float x) { papas += x; }

	public int getComensales() {
		float p = papas/0.33F;
		float c = chocos/0.16F;

		if(p >= c) { return (int)c; } else { return (int)p; }
	}

	public void showPapas() { System.out.println("Hay " + papas + "Kg. de papas en el almacen."); }

	public void showChocos() { System.out.println("Hay " + chocos + "Kg. de chocos en el almacen."); }
}

class ej12p57 {
	public static void main(String [] args) {
		almacen a = new almacen();
		a.addPapas(11.3F);
		a.addChocos(5.2F);
		a.showPapas();
		a.showChocos();
		System.out.println("Clientes: " + a.getComensales());

		System.exit(0);
	}
}