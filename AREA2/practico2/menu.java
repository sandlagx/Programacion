package practico2;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0, menu2 = 0, menu3 = 0;
		libro libro[] = new libro[10];
		Revista revista[] = new Revista[10];
		art_cientifico art_cientifico[] = new art_cientifico[10];
		System.out.println("¡Bienvenidos al programa!");
		
		
		do {
			
			System.out.println("ingrese una opcion \n1)Altar publicacion\n2)listar publicacion\n3)salir.");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu){
			
			case 1:
					
				do {
					System.out.println("Que deseas altar?\n1)Libro\n2)Revista\n3)Articulo Cientifico\n4)salir.");
					menu2 = sc.nextInt();
					sc.nextLine();
					
					switch(menu2) {
					
					case 1:
						
						System.out.println("ingresar titulo del libro:");
						String tituloL = sc.nextLine();
						System.out.println("ingresar nombre del autor:");
						String autorL = sc.nextLine();
						System.out.println("ingresar año del libro:");
						int año_publicacionL = sc.nextInt();
						sc.nextLine();
						System.out.println("ingresar numero de paginas:");
						int n_paginasL = sc.nextInt();
						sc.nextLine();
						System.out.println("ingresar genero:");
						String genero = sc.nextLine();
						
						altarLibro(libro, tituloL, autorL, año_publicacionL, n_paginasL, genero);
						break;
					
					
					case 2:
						
						System.out.println("ingresar titulo de la revista:");
						String tituloR = sc.nextLine();
						System.out.println("ingresar nombre del autor:");
						String autorR= sc.nextLine();
						System.out.println("ingresar año del revista:");
						int año_publicacionR = sc.nextInt();
						sc.nextLine();
						System.out.println("ingresar mes de la publicacion:");
						int mes_publicacion = sc.nextInt();
						sc.nextLine();
						
						altarRevista(revista, tituloR, autorR, año_publicacionR, mes_publicacion);
						break;
					
					
					case 3:
						
						System.out.println("ingresar titulo del articulo cientifico:");
						String tituloAC = sc.nextLine();
						System.out.println("ingresar nombre del autor:");
						String autorAC = sc.nextLine();
						System.out.println("ingresar año del articulo cientifico:");
						int año_publicacionAC = sc.nextInt();
						sc.nextLine();
						System.out.println("ingresa de que trata el articulo:");
						String tema = sc.nextLine();
						System.out.println("ingresar numero de paginas del articulo:");
						int n_paginasAC = sc.nextInt();
						
						altarArt_cientifico(art_cientifico, tituloAC, autorAC, año_publicacionAC, tema, n_paginasAC);
						break;
						
						
					case 4:
						
						System.out.println("");
						
						break;
					
					default: 
						
						System.out.println("error, porfavor ingrese del 1 al 4");
						break;
					}
				}while(menu2 !=4);
			
				
				break;
				
				
			case 2:
				do {
					System.out.println("Que deseas listar?\n1)Libro\n2)Revista\n3)Articulo Cientifico\n4)salir.");
					menu3 = sc.nextInt();
					sc.nextLine();
					
					switch(menu3) {
					
					case 1:
						
						listarLibro(libro);
						
						break;
					
					
					case 2:
						
						listarRevista(revista);
						
						break;
					
					
					case 3:
						
						listarArt_cientifico(art_cientifico);
						
						break;
						
						
					case 4:
						
						System.out.println("");
						
						break;
					
					default: 
						
						System.out.println("error, porfavor ingrese del 1 al 4");
						break;
					}
				}while(menu3 !=4);
			
				
				break;
				
				
			case 3:
				
				System.out.println("chau gil");
				
				break;
			
			default: 
				
				System.out.println("error, porfavor ingrese del 1 al 3");
				break;
			
			}
			
			
			
		}while (menu != 3);
		
		
	}
	public static void altarLibro (libro[] a, String titulo, String autor, int año_publicacion, int n_paginas, String genero) {
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == null) {
				a[i] = new libro(titulo, autor, año_publicacion, n_paginas, genero);
				break;
			}
		}
	}
	public static void altarRevista (Revista[] a, String titulo, String autor, int año_publicacion, int mes_publicacion) {
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == null) {
				a[i] = new Revista(titulo, autor, año_publicacion, mes_publicacion);
				break;
			}
		}
	}
	public static void altarArt_cientifico (art_cientifico[] a, String titulo, String autor, int año_publicacion, String tema, int n_paginasAC) {
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == null) {
				a[i] = new art_cientifico(titulo, autor, año_publicacion, tema, n_paginasAC);
				break;
			}
		}
	}
	public static void listarLibro (libro[] a) {
		for(int i = 0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println("el titulo del libro es '" + a[i].getTitulo() + "' escrito por " + a[i].getAutor() + " en el año " + a[i].getAño_publicacion() + ", con " + a[i].getN_paginas() + " paginas, su genero es " + a[i].getGenero());
			}
		}
	}
	public static void listarRevista (Revista[] a) {
		for(int i = 0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println("el titulo de la revista es '" + a[i].getTitulo() + "' escrito por " + a[i].getAutor() + " publicado el " + a[i].getMes_publicacion() + "/" + a[i].getAño_publicacion());
			}
		}
	}
	public static void listarArt_cientifico (art_cientifico[] a) {
		for(int i = 0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println("el titulo del articulo  '" + a[i].getTitulo() + "' escrito por " + a[i].getAutor() + " publicado el " + a[i].getAño_publicacion() + " y trata de " + a[i].getTema());
			}
		}
	}
}