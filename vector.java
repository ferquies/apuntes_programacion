class vectorTAM {
	private final static int TAM = 100;
	private int v[];

	public vectorTAM() {
		v = new int[TAM];
	}

	public void cargaVector() {
		for(int i = 0; i < TAM; i++) {
			v[i] = (int)(Math.random()*70+10);
		}
	}

	public int mayor() {
		int mayor = 0;
		for(int i = 0; i < TAM; i++) {
			if(v[i] > mayor)
				mayor = v[i];
		}

		return mayor;
	}

	public int menor() {
		int menor = 100;
		for(int i = 0; i < TAM; i++) {
			if(v[i] < menor)
				menor = v[i];
		}

		return menor;
	}

	public double promedio() {
		double suma = 0;
		for(int i = 0; i < TAM; i++) {
			suma += v[i];
		}

		if(TAM != 0)
			return suma / TAM;
		else
			return 0;
	}

	public int moda() {
		int conts[] = new int[70], max = 0, pos = 0;

		for(int i = 0; i < TAM; i++) {
			conts[v[i] - 10]++;
		}

		for(int i = 0; i < 70; i++) {
			if(conts[i] > max) {
				max = conts[i];
				pos = i;
			}
		}

		return pos + 10;
	}

	public void muestra() {
		for(int i = 0; i < TAM; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
}

class vector {
	public static void main(String[] args) {
		vectorTAM v = new vectorTAM();
		v.cargaVector();
		System.out.println("El array generado es:");
		v.muestra();
		System.out.println("El mayor ha sido: " + v.mayor());
		System.out.println("El menor ha sido: " + v.menor());
		System.out.println("El promedio de todos los valores es: " + v.promedio());
		System.out.println("El valor que más se ha repetido es: " + v.moda());
		
		System.exit(0);
	}
}
