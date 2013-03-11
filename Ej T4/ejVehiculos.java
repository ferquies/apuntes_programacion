class Vehiculo {
	protected int potencia;
	protected double consumo;

	public int getPotencia() {
		return potencia;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
}

interface Transporte {
	public double consumoViaje(double kms);
}

class Coche extends Vehiculo implements Transporte {
	private int puertas;

	public Coche() {
		puertas = 5;
		consumo = 5.6;
		potencia = 90;
	}

	public Coche(int puertas, double consumo, int potencia) {
		this.puertas = puertas;
		this.consumo = consumo;
		this.potencia = potencia;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public double consumoViaje(double kms) {
		return this.getConsumo()/100*kms;
	}
}

class Moto extends Vehiculo implements Transporte{ 
	private String tipo;

	public Moto() {
		tipo = "Scooter";
		consumo = 1.2;
		potencia = 40;
	}

	public Moto(String tipo, double consumo, int potencia) {
		this.tipo = tipo;
		this.consumo = consumo;
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double consumoViaje(double kms) {
		return this.getConsumo()/100*kms;
	}
}

public class ejVehiculos {
	public static void main(String[] args) {
		Coche c = new Coche(3, 4.2, 120);
		Moto m = new Moto("Carretera", 0.9, 75);

		System.out.println("Mi coche tiene " + c.getPuertas() + " puertas, consume " + c.getConsumo() + " a los 100 y tiene " + c.getPotencia() + "CV de potencia.");
		System.out.println("Mi moto es " + m.getTipo() + ", consume " + m.getConsumo() + " a los 100 y tiene " + m.getPotencia() + "CV de potencia.");

		System.out.println("Mi coche en 75,2Kms consume " + c.consumoViaje(75.2) + " litros.");
		System.out.println("Mi moto en 83,5Kms consume " + m.consumoViaje(83.5) + " litros.");

		System.exit(0);
	}
}