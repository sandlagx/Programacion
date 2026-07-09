package interfaz_juego;

public class dinosaurio implements acciones {

	String nombre;
	String especie;
	
	
	@Override
	public void comer() {

		System.out.println("el dinosaruio come 20kg");
		
	}

	@Override
	public void dormir() {

		System.out.println("el dinosaruio duerme 5 horas");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public dinosaurio(String nombre, String especie) {
		super();
		this.nombre = nombre;
		this.especie = especie;
	}

	
	
}
