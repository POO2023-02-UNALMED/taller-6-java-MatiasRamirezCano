package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int ventas = 0;
	private static ArrayList<Fabricante> registro = new ArrayList<Fabricante>();
	
	public Fabricante(String n, Pais p) {
		nombre = n;
		pais = p;
		registro.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais p) {
		pais = p;
	}
	public static ArrayList<Fabricante> getRegistro(){
		return registro;
	}
	public void ventaF() {
		ventas++;
	}
	public static Fabricante fabricaMayorVentas() {
		int aux = 0;
		Fabricante f = null;
		for (int i = 0; i < registro.size(); i++) {
			if (registro.get(i).ventas > aux) {
				f = registro.get(i);
				aux = registro.get(i).ventas;
			}
		}
		return f;
	}

}
