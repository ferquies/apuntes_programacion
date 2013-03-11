import java.util.StringTokenizer;
class ej_tokenizer {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Uno dos tres\tperico\njuanico y_andres", "_ \n\t");
		System.out.println("La cadena tiene " + str.countTokens() + " elementos.");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		System.exit(0);
	}
}