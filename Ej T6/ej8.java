import java.io.*;
import java.util.*;

class Persona implements Serializable {
	private String nombre, apellidos;
	private int telefono;
	
	public Persona() {
		nombre = "Charco";
		apellidos = "The Best";
		telefono = 1438357;
	}

	public Persona(String nombre, String apellidos, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public void muestra() {
		System.out.printf("\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nTelefono: " + this.telefono + "\n");
	}
}

class ej8 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Introduce nombre de fichero: ");
		String s = ent.nextLine();
		File f = new File(s);
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				Persona p1 = new Persona();
				Persona p2 = new Persona("Java", "You are the best", 806000001);

				oos.writeObject(p1);
				oos.writeObject(p2);
				System.out.println("Objetos p1 y p2 se han serializado.");

				if(oos != null) { oos.close(); fos.close(); }
				System.out.println("Fichero cerrado.");

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				try {
					p1 = (Persona)ois.readObject();
					p2 = (Persona)ois.readObject();

					p1.muestra();
					p2.muestra();
				} catch(ClassNotFoundException e) {
					System.out.println("Error: clase no encontrada.");
				}
			} catch(IOException e) {
				System.out.println("Error: excepción de E/S.");
			}
		} catch(FileNotFoundException e) {
			System.out.println("Error: archivo no encontrado.");
		}

		System.exit(0);
	}
}
