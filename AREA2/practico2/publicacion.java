package practico2;

abstract public class publicacion {

String titulo, autor;
int año_publicacion;

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getAño_publicacion() {
	return año_publicacion;
}
public void setAño_publicacion(int año_publicacion) {
	this.año_publicacion = año_publicacion;
}

public publicacion(String titulo, String autor, int año_publicacion) {

	this.titulo = titulo;
	this.autor = autor;
	this.año_publicacion = año_publicacion;
}




}
