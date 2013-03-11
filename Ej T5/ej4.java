class conversor {
	private int numero;

	public conversor(int numero) {
		this.numero = numero;
	}

	public String getNumero(char param) {
		String convert = "Error: Introduzca un parametro correcto (B, H, O).";

		if(param == 'B' || param == 'b') {
			convert = Integer.toBinaryString(this.numero);
		}
		else if(param == 'H' || param == 'h') {
			convert = Integer.toHexString(this.numero);
		}
		else if(param == 'O' || param == 'o') {
			convert = Integer.toOctalString(this.numero);
		}

		return convert;
	}
}

class ej4 {
	public static void main(String[] args) {
		int num = 15;
		conversor c = new conversor(num);
		System.out.println(num + " en binario es " + c.getNumero('B'));
		System.out.println(num + " en hexadecimal es " + c.getNumero('h'));
		System.out.println(num + " en octal es " + c.getNumero('O'));
		//System.out.println(c.getNumero('l'));
	}
}