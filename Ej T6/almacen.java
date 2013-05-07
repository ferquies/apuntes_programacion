import java.io.*;
import java.util.*;

class Objeto implements Serializable {
	private String nombre, cod, cantidad;

	public Objeto(String cod, String nombre, String cantidad) {
		this.cod = cod;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getCod() {
		return this.cod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	public String infoObj() {
		return "Codigo: " + this.cod + "\nNombre: " + this.nombre + "\nCantidad: " + this.cantidad;
	}
}

public class almacen {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("\t\t-----------------------");
		System.out.println("\t\t-Bienvenido al almacen-");
		System.out.println("\t\t-----------------------");
		System.out.print("\nIntroduce el nombre del fichero almacen: ");
		String fichero = sca.nextLine();

		File f = new File(fichero);
		if(f.exists()) {
			//System.out.print("¿Quieres editar o leer? [E/L]: ");
			//String el = sca.nextLine();
			//if(el == "e" || el == "E") {
				try {
					FileInputStream fis = new FileInputStream(f);
					try {
						ObjectInputStream ois = new ObjectInputStream(fis);
						try {
							while(true) {
								try {
									Objeto o = (Objeto)ois.readObject();

									System.out.println(o.infoObj());
								} catch(ClassNotFoundException e) { System.out.println("Error: Clase no encontrada."); }
							}
						} catch(EOFException e) {}
						if(ois != null) { ois.close(); fis.close(); }
					} catch(IOException e) { System.out.println("Error de E/S."); }
				} catch(FileNotFoundException e) { System.out.println("Error: Fichero no encontrado."); }
			//}
		} else {
			try {
				FileOutputStream fos = new FileOutputStream(f);
				try {
					ObjectOutputStream oos = new ObjectOutputStream(fos);

					System.out.print("\nIntroduce el codigo: ");
					String cod = sca.nextLine();
					System.out.print("Introduce el nombre: ");
					String nombre = sca.nextLine();
					System.out.print("Introduce la cantidad: ");
					String cantidad = sca.nextLine();

					Objeto obj = new Objeto(cod, nombre, cantidad);
					oos.writeObject(obj);
					if(oos != null) { oos.close(); fos.close(); }
				} catch(IOException e) { System.out.println("Error de E/S."); }
			} catch(FileNotFoundException e) { System.out.println("Error: Fichero no encontrado."); }
		}
		System.exit(0);
	}
}