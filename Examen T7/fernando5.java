// ENHORABUENA: MAGNÍFICAMENTE RESUELTO

class Ciudades {
	final static int TAM = 10;
	private String ciudades[] = new String[TAM];	

	public Ciudades() {
	// SI HACES EL NEW AQUÍ NO HACE FALTA HACERLO EN LA LINEA 3
		String ciudades[] = new String[TAM];
	}	

	public void cargar() {
		for(int i = 0; i < TAM; i++) {
			System.out.print("Introduce ciudad: ");
			ciudades[i] = System.console().readLine();
		}
	}

	public void mostrar() {
		for(int i = 0; i < ciudades.length; i++)
			System.out.print(ciudades[i] + " ");
		System.out.println();
	}

	public void ordenar() {
		String aux;
		int comp;
		boolean ordenado = false;
		for(int i = ciudades.length; (i > 0) && (ordenado == false); i--) {
			ordenado = true;
			for(int j = 0; j < TAM - 1; j++) {
				comp = ciudades[j].compareTo(ciudades[j+1]);
				if(comp > 0) {
					aux = ciudades[j];
					ciudades[j] = ciudades[j+1];
					ciudades[j+1] = aux;
					ordenado = false;
				}
			}
		}
	}

	public void muestraNombre(int n) {
		if(n > TAM)
			System.out.println("Error: solo valores entre 0 y " + TAM);
		else
			System.out.println(ciudades[n]);
	}
}

public class fernando5 {
	public static void main(String[] args) {
		int n;
		
		Ciudades c = new Ciudades();
		c.cargar();
		c.mostrar();
		c.ordenar();
		c.mostrar();
		System.out.print("Introduce el valor de la ciudad a mostrar: ");
		String ciudad = System.console().readLine();
		n = Integer.parseInt(ciudad.trim());
		c.muestraNombre(n - 1);
	}
}
