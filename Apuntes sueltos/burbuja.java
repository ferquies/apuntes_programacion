class burbuja {
	final static int TAM = 5;
	public static void main(String[] args) {
		double nums[] = new doube[TAM];

		boolean ordenado=false;

		for(int i = 0; i < TAM; i++) {
			System.out.print("Introduce numero: ");
			String ln = System.console().readline();
			nums[i] = Double.parseDouble(ln.trim);
		}
		for int tope = arr.length - 2; (tope >= 0) && (ordenando == false); tope--) {
			for(int i=0; i<=tope; i++) {
				if(arr[i]>arr[i+1]) {
					ordenado = false;
					aux=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=aux;
				}
			}
		}
	}
}
