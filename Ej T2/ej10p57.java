class consumo {
	private float kms, litros, vmed, pgas;

	public consumo() {
		kms = 50.4F;
		litros = 3.4F;
		vmed = 121F;
		pgas = 1.21F;
	}

	public float getKms() {	return kms; }

	public float getLitros() { return litros; }

	public float getVmed() { return vmed; }

	public float getPgas() { return pgas; }

	public float getTiempo() { return kms/vmed; }

	public float consumoMedio() { return litros/kms*100F; }

	public float consumoEuros() { return consumoMedio()*pgas; }

	public void setKms(float km) { kms = km; }

	public void setLitros(float l) { litros = l; }

	public void setVmed(float vm) { vmed = vm; }

	public void setPgas(float pg) { pgas = pg; }
}

class ej10p57 {
	public static void main(String [] args) {
		consumo c = new consumo();
		System.out.println("Km recorridos: " + c.getKms() + "\nLitros consumidos: " + c.getLitros() + "\nVelocidad media: " + c.getVmed() + "\nPrecio gasolina: " + c.getPgas());
		System.out.println("Tiempo estimado: " + c.getTiempo());
		System.out.println("Consumo medio: " + c.consumoMedio());
		System.out.println("Consumo euros: " + c.consumoEuros());
		c.setKms(100F);
		c.setLitros(6.8F);
		c.setVmed(100F);
		c.setPgas(1.84F);
		System.out.println("\nKm recorridos: " + c.getKms() + "\nLitros consumidos: " + c.getLitros() + "\nVelocidad media: " + c.getVmed() + "\nPrecio gasolina: " + c.getPgas());
		System.out.println("Tiempo estimado: " + c.getTiempo());
		System.out.println("Consumo medio: " + c.consumoMedio());
		System.out.println("Consumo euros: " + c.consumoEuros());

		System.exit(0);
	}
}