package interfaz_juego;

public class perro implements acciones {

	String nombre;
	String raza;
	
	
	@Override
	public void comer() {

		System.out.println("el perro come 4kg.");
		
	}

	@Override
	public void dormir() {

		System.out.println("el perro durme 5 horas.");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public perro(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}

	
	
}
