class ej2p54 {
	private float valor;
	// constructor
	public ej2p54(float v) { valor = v; }
	public float doble() { return 2*valor; }
	public float triple() { return 3*valor; }
	public float cuadruple() { return 4*valor; }

	public static void main(String [] args) {
		ej2p54 num = new ej2p54(5.2F);
		System.out.println("El doble de 5.2 es " + num.doble());
		System.out.println("El triple de 5.2 es " + num.triple());
		System.out.println("El cuádruple de 5.2 es " + num.cuadruple());

		System.exit(0);
	}
}