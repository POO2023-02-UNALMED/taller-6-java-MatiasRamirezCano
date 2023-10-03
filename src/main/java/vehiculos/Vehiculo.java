package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private double velocidadMaxima;
	private String nombre;
	private long precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, String nombre, long precio, int peso, Fabricante fabricante) {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		Vehiculo.cantidadVehiculos++;
		fabricante.ventaF();
		fabricante.getPais().ventaP();
	}
	
	public Vehiculo(String placa, int puertas, String nombre, long precio, int peso, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		fabricante.ventaF();
		fabricante.getPais().ventaP();
	}
	
	public static String vehiculosPorTipo() {
		int a = Automovil.getCantidad();
		int b = Camioneta.getCantidad();
		int c = Camion.getCantidad();
		return ("Automoviles: " + a + "\nCamionetas: " + b + "\nCamiones: " + c);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String a) {
		placa = a;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int a) {
		puertas = a;
	}
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double a) {
		velocidadMaxima = a;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long a) {
		precio = a;
	}	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int p) {
		peso = p;
	}	
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante f) {
		fabricante = f;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int a) {
		cantidadVehiculos = a;
	}
}
