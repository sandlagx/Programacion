package ABML1;

public class Producto {
	
	private String nombre;
	private int precio;
	
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public Producto(String nombre, int precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
}