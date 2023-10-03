package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private int ventas;
	private static ArrayList<Pais> registro = new ArrayList<Pais>();
	
	public Pais(String n) {
		nombre = n;
		registro.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static ArrayList<Pais> getRegistro(){
		return registro;
	}
	public void ventaP() {
		ventas++;
	}
	public int getVentas() {
		return ventas;
	}
	public static Pais paisMasVendedor() {
		int aux = 0;
		Pais p = null;
		for (Pais a : registro) {
			if (a.ventas > aux) {
				p = a;
				aux = a.ventas;
			}
		}
		return p;
	}

}
