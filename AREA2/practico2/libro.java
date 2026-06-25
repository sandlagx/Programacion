package practico2;

public class libro extends publicacion {

	int n_paginas;
	String genero;
	
	public int getN_paginas() {
		return n_paginas;
	}
	public void setN_paginas(int n_paginas) {
		this.n_paginas = n_paginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public libro(String titulo, String autor, int año_publicacion, int n_paginas, String genero) {
		super(titulo, autor, año_publicacion);
		this.n_paginas = n_paginas;
		this.genero = genero;
	}
	
	
	
}
