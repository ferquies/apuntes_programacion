class Test {
	public static void main(String [] args) {
		int a = 10, b = 0, c;
		try {
			c = a / b;
		} catch(ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}
		System.out.println("Resultado: " + c);
	}
}

