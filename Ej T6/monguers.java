import java.io.*; 	// Manipular ficheros
import java.util.*; // Serializar objetos

class Monguer implements Serializable {
	private String nombre, tipo, edad, hijos;

	public Monguer() {
		nombre = "Monguer Estandar";
		tipo = "Superdown";
		hijos = "Si";
		edad = "25";
	}

	public Monguer(String nombre, String tipo, String hijos, String edad) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.hijos = hijos;
		this.edad = edad;
	}

	public String muestra() {
		return "Nombre del monguer: " + this.nombre + "\nTipo de monguer: " + tipo + "\nHijos: " + hijos + "\nEdad del monguer: " + this.edad;
	}
}

class monguers {
	public static void main(String[] args) {
		int objetos = 2;
		Scanner sca = new Scanner(System.in);

		System.out.print("Introduce nombre del fichero: ");
		String s = sca.nextLine();
		System.out.println();

		File f = new File(s); // Se crea el fichero con el nombre recogido en el String anterior

		try {
			FileOutputStream fos = new FileOutputStream(f); // Se crea el flujo de salida para el archivo "f"
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fos); // Se crea flujo de salida para el objeto "fos"

				Monguer m[] = new Monguer[objetos];

				for(int i = 0; i < objetos; i++) {
					System.out.print("Introduce nombre del monguer: ");
					String nombre = sca.nextLine();
					System.out.print("Introduce tipo de monguer: ");
					String tipo = sca.nextLine();
					System.out.print("Introduce si tiene hijos: ");
					String hijos = sca.nextLine();
					System.out.print("Introduce edad del monguer: ");
					String edad = sca.nextLine();
					System.out.println();

					m[i] = new Monguer(nombre, tipo, hijos, edad);

					oos.writeObject(m[i]); // Se escribe el objeto al fichero
				}

				if(oos != null) { oos.close(); fos.close(); } // Se comprueba que el objeto se ha creado y cierra los flujos

				FileInputStream fis = new FileInputStream(f); // Se crea el flujo de entrada del fichero "f"
				ObjectInputStream ois = new ObjectInputStream(fis); // Se crea el flujo de entrada del objeto "fis"

				Monguer mon[] = new Monguer[objetos];

				for(int i = 0; i < objetos; i++) {
					try {
						mon[i] = (Monguer)ois.readObject();

						System.out.println(mon[i].muestra());
						System.out.println();
					} catch(ClassNotFoundException e) {
						System.out.println("Error: Clase no encontrada.");
					}
				}

				if(ois != null) { ois.close(); fis.close(); } // Se comprueba que existe el objeto "ois" y se cierran los flujos

			} catch(IOException e) {
				System.out.println("Error de E/S.");
			}
		} catch(FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado.");
		}
		
		System.exit(0);
	}
}