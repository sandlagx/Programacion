package practico2;

public class art_cientifico extends publicacion{

	String tema;
	int n_paginasAC;
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getN_paginasAC() {
		return n_paginasAC;
	}
	public void setN_paginas(int n_paginas) {
		this.n_paginasAC = n_paginas;
	}
	public art_cientifico(String titulo, String autor, int año_publicacion, String tema, int n_paginasAC) {
		super(titulo, autor, año_publicacion);
		this.tema = tema;
		this.n_paginasAC = n_paginasAC;
	}
	
	
	
}
