package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	private static int cantidad;
	
	public Camion(String placa, String nombre, long precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, nombre, precio, peso, fabricante);
		this.ejes = ejes;
		setPuertas(2);
		setVelocidadMaxima(80);
		setTraccion("4X2");
		cantidad++;
	}
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static int getCantidad() {
		return cantidad;
	}

}
