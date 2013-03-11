class numero {
	private float numero;
	public numero() { numero = 0; }
	public numero(float valor) { numero = valor; }
	public void aniade(float valor) { numero += valor; }
	public void resta(float valor) { numero -= valor; }
	public float getValor() { return numero; }
	public float getDoble() { return numero*2; }
	public float getTriple() { return numero*3; }
	public float setNumero(float valor) { return numero = valor; }
}
class
 ej3p55 {
	public static void main(String [] args) {
		// constructor sin parametros
		numero n = new numero();
		System.out.println("El numero es " + n.getValor() + ".");
		// constructor con parametros
		numero n2 = new numero(21.7f);
		System.out.println("El numero inicializado ahora es " + n2.getValor() + ".");
		n2.aniade(5.3F);
		System.out.println("Sumando 5.3: " + n2.getValor());
		n2.resta(6.2F);
		System.out.println("Restando 6.2: " + n2.getValor());
		System.out.println("Doble: " + n2.getDoble());
		System.out.println("Triple: " + n2.getTriple());
		n2.setNumero(88.6F);
		System.out.println("Y ahora el numero es: " + n2.getValor());

		System.exit(0);
	}
}