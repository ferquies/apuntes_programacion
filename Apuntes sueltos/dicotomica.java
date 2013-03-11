/*Programa que pida un array, lo ordene, pida un numero al usuario, y lo busque en el array con la busqueda dicotomica.*/

class dicotomica {
	final static int TAM = 9;
	public static void main(String[] args) {
		int a[] = new int[TAM];

		for(int i = 0; i < TAM; i++) {
			System.out.print("Introduce un numero: ");
			String sd = System.console().readLine();
			a[i] = Integer.parseInt(sd);
		}

		System.out.print("El array es: ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]);

		System.out.println();
		System.out.println("Ordenando...");

		// Método de la burbuja optimizado
		boolean ordenado = false;
		int aux;
		for(int tope = a.length - 2; (tope >= 0) && (ordenado == false); tope--) {
			for(int i=0; i<=tope; i++) {
				if(a[i]>a[i+1]) {
					ordenado = false;
					aux=a[i];
					a[i]=a[i+1];
					a[i+1]=aux;
				}
			}
		}

		System.out.print("\nEste es el array ordenado: ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]);

		System.out.println();
		System.out.print("Introduce un numero de busqueda: ");

		int num = Integer.parseInt(System.console().readLine());

		// Búsqueda dicotómica
		int izq = 0;
		int der = TAM - 1;
		int centro = (izq + der) / 2;

		while((a[centro] != num) && (izq <= der)) {
			if(a[centro] > num)
				der = centro - 1;
			else
				izq = centro + 1;	
			
			centro = (izq + der) / 2;
		}

		if(a[centro] == num) // Encontrado
			System.out.println("Si se encuentra en el array, en la posicion " + centro);
		else
			System.out.println("No se ha encontrado en el array.");
	}
}