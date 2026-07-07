package practico2;

public class Revista extends publicacion {

	int mes_publicacion;

	public int getMes_publicacion() {
		return mes_publicacion;
	}

	public void setMes_publicacion(int mes_publicacion) {
		this.mes_publicacion = mes_publicacion;
	}

	public Revista(String titulo, String autor, int año_publicacion, int mes_publicacion) {
		super(titulo, autor, año_publicacion);
		this.mes_publicacion = mes_publicacion;
	}
	
	
	
}
