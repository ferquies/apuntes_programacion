import java.io.*;

class Rectangulo implements Serializable {
	private double lado1, lado2;
	
	public Rectangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double area() {
		return this.lado1 * this.lado2;
	}
}

class ej7a {
	public static void main(String[] args) {
		try {
			File f = new File("rectangulos.dat");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Rectangulo r1 = new Rectangulo(4.5, 6.3);
			Rectangulo r2 = new Rectangulo(5.4, 3.3);
			Rectangulo r3 = new Rectangulo(8.2, 6.9);
			Rectangulo r4 = new Rectangulo(11.1, 5.4);
			Rectangulo r5 = new Rectangulo(1.2, 9.2);
			// MENOS MAL QUE SÓLO PEDÍA 5, SI LLEGO A PEDIR 500 ...
			oos.writeObject(r1);
			oos.writeObject(r2);
			oos.writeObject(r3);
			oos.writeObject(r4);
			oos.writeObject(r5);
			
			if(oos != null) { oos.close(); fos.close(); }
			
			Rectangulo rec[] = new Rectangulo[5];
			
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				int i = 0;
				while(true) {
					rec[i] = (Rectangulo)ois.readObject();
					System.out.println("El area del rectangulo rec" + i + " es: " + rec[i].area());
					i++;
				}
			} catch(EOFException e) {}
			
			if(ois != null) { ois.close(); fis.close(); }
			
		} catch(IOException e) { System.out.println("Error de E/S."); }
		catch(ClassNotFoundException e) { System.out.println("Error: clase no encontrada."); }
		
		System.exit(0);
	}
}
