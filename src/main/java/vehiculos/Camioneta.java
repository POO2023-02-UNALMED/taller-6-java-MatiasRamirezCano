package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	private static int cantidad;
	
	public Camioneta(String placa, int puertas, String nombre, long precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, nombre, precio, peso, fabricante);
		this.volco = volco;
		setVelocidadMaxima(90);
		setTraccion("4X4");
		cantidad++;
	}
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public static int getCantidad() {
		return cantidad;
	}
	
}
