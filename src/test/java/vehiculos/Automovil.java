package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static int cantidad;
	
	public Automovil(String placa, String nombre, long precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, nombre, precio, peso, fabricante);
		this.puestos = puestos;
		setPuertas(4);
		setVelocidadMaxima(100);
		setTraccion("FWD");
		cantidad++;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public static int getCantidad() {
		return cantidad;
	}

}
