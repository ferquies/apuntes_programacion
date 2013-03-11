class ejp15 {
	public static void main(String[] args) {
		int [] temp = new int[5];
		temp[0] = 1; temp[1] = -2; temp[2] = 3; temp[3] = 4; temp[4] = 0;
			ejercicio.Calculo(2,3,2,0,temp);
		try {
			ejercicio.Calculo(2,3,2,8,temp); // No funciona porque el array solo tiene 5 posiciones y se le pasa como 4º indicador "8"
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: El array solo tiene 5 posiciones.");
		}
		try {
			ejercicio.Calculo(2,3,2,4,temp); // No funciona porque el 4º indicador apunta a la posicion 4 que contiene el valor 0 y divide entre 0
		} catch (ArithmeticException e) {
			System.out.println("Error: Division entre 0.");
		}
		try {
			ejercicio.Calculo(1,3,2,0,temp); // Esto tambien da error en "int [] temp2=new int[temp[ind1]*5];" porque no puede tener -10 posiciones,
											 // pero no afecta a la operacion con temp
		} catch (NegativeArraySizeException n) {
			System.out.println("Error: El array no puede tener posiciones negativas.");
		}
		
	}
}

class ejercicio {
	static void Calculo(int ind1, int ind2, int ind3, int ind4, int[]temp) {
		//int [] temp2=new int[temp[ind1]5]; Error de sintaxis, falta signo o sobra el ultimo "5"
		int [] temp2 = new int[temp[ind1]*5];
		temp[ind1] = (temp[ind2] + temp[ind3]) / temp[ind4];
	}
}