package ABML1;

public class Alimento extends Producto {
	private String categoria;
	private int caducidad;
	
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public int getCaducidad() {
		return caducidad;
	}
	
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}
	
	
	
	public Alimento(String nombre, int precio, String categoria, int caducidad) {
		super(nombre, precio);
		this.categoria = categoria;
		this.caducidad = caducidad;
	}
}
