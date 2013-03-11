class ejp14 {
	public static void main(String[] args) {
		int [] temp=new int[5];
		temp[0]=1; temp[1]=-2; temp[2]=3; temp[3]=4; temp[4]=0;
		ejercicio.Calculo(2,3,2,0,temp);
		ejercicio.Calculo(2,3,2,8,temp); // No funciona porque el array solo tiene 5 posiciones y se le pasa como 4º indicador "8"
		ejercicio.Calculo(2,3,2,4,temp); // No funciona porque el 4º indicador apunta a la posicion 4 que contiene el valor 0 y divide entre 0
		ejercicio.Calculo(1,3,2,0,temp); // Esto tambien da error en "int [] temp2=new int[temp[ind1]*5];" porque no puede tener -10 posiciones,
										 // pero no afecta a la operacion con temp
	}
}

class ejercicio {
	static void Calculo(int ind1, int ind2, int ind3, int ind4, int[]temp) {
		//int [] temp2=new int[temp[ind1]5]; Error de sintaxis, falta signo o sobra el ultimo "5"
		
		if(ind1 > 4 || ind2 > 4 || ind3 > 4 || ind4 > 4) {
			System.out.println("Error: el array no tiene tantas posiciones.");
		} else {
			if(temp[ind1] < 0) {
				System.out.println("Error: El array no puede tener posiciones negativas.");
			} else {
				int [] temp2=new int[temp[ind1]*5];
			}

			if(ind4 == 4) {
				System.out.println("Error: El 4º indicador no puede ser 4 porque apunta a un valor 0 y no se puede dividir entre 0.");
			} else {
				temp[ind1]=(temp[ind2]+temp[ind3])/temp[ind4];
			}
		}
	}
}