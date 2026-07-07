package ABML1;

public class Ropa extends Producto {
	private String color;
	private String talle;
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTalle() {
		return talle;
	}
	
	public void setTalle(String talle) {
		this.talle = talle;
	}
	
	
	
	public Ropa(String nombre, int precio, String color, String talle) {
		super(nombre, precio);
		this.color = color;
		this.talle = talle;
	}
}
