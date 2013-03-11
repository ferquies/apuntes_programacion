import dam.prog.*;

public class ej6 {
	public static void main(String[] args) {
		euro e = new euro(45.3);
		dolar d = new dolar(32.4);

		System.out.println("La conversion de " + e.getValor() + "€ a dolares es: " + e.toDolares());
		System.out.println("La conversion de " + d.getValor() + "$ a euros es: " + d.toEuros());
	}
}