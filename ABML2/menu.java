package practico2;

import java.util.Scanner;

import ABML1.Alimento;
import ABML1.Electronica;
import ABML1.Ropa;

public class menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0, menu2 = 0, menu3 = 0, menu4 = 0, menu5 = 0, menu6 = 0;
		libro libro[] = new libro[10];
		Revista revista[] = new Revista[10];
		art_cientifico art_cientifico[] = new art_cientifico[10];
		System.out.println("¡Bienvenidos al programa!");

		do {

			System.out.println("ingrese una opcion \n1)Altar publicacion\n2)listar publicacion\n3)Modificar publicacion\n4)Bajar publicacion\n5)salir");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {

			case 1:

				do {
					System.out.println("Que deseas altar?\n1)Libro\n2)Revista\n3)Articulo Cientifico\n4)salir.");
					menu2 = sc.nextInt();
					sc.nextLine();

					switch (menu2) {

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
						String autorR = sc.nextLine();
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
				} while (menu2 != 4);

				break;

			case 2:
				do {
					System.out.println("Que deseas listar?\n1)Libro\n2)Revista\n3)Articulo Cientifico\n4)salir.");
					menu3 = sc.nextInt();
					sc.nextLine();

					switch (menu3) {

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
				} while (menu3 != 4);

				break;

			case 3:

				do {

					System.out.println(
							"Que publicacion desea modificar?\n1)libro\n2)revista\n3)articulo cientifico\n4)salir.");
					menu4 = sc.nextInt();
					sc.nextLine();
					switch (menu4) {
					case 1:

						for (int i = 0; i < libro.length; i++) {
							if (libro[i] != null) {
								System.out.println(i + ") el titulo del libro es '" + libro[i].getTitulo()
										+ "' escrito por " + libro[i].getAutor() + " en el año "
										+ libro[i].getAño_publicacion() + ", con " + libro[i].getN_paginas()
										+ " paginas, su genero es " + libro[i].getGenero());
							}
						}
						System.out.println("elija la publicacion que desea modificar: ");
						int seleccion = sc.nextInt();
						sc.nextLine();
						ModificarLibro(libro, seleccion);

						break;
					case 2:

						for (int i = 0; i < revista.length; i++) {
							if (revista[i] != null) {
								System.out.println(i + ") el titulo de la revista es '" + revista[i].getTitulo()
										+ "' escrito por " + revista[i].getAutor() + " publicado el "
										+ revista[i].getMes_publicacion() + "/" + revista[i].getAño_publicacion());
							}
						}
						System.out.println("elija la publicacion que desea modificar: ");
						int seleccion2 = sc.nextInt();
						sc.nextLine();
						ModificarRevista(revista, seleccion2);

						break;
					case 3:

						for (int i = 0; i < art_cientifico.length; i++) {
							if (art_cientifico[i] != null) {
								System.out.println(i + ") el titulo del articulo  '" + art_cientifico[i].getTitulo()
										+ "' escrito por " + art_cientifico[i].getAutor() + " publicado el "
										+ art_cientifico[i].getAño_publicacion() + " y trata de "
										+ art_cientifico[i].getTema());
							}
						}
						System.out.println("elija la publicacion que desea modificar: ");
						int seleccion3 = sc.nextInt();
						sc.nextLine();
						ModificarArt_cientifico(art_cientifico, seleccion3);

						break;
					case 4:
						
						break;

					default:

						break;
					}

				} while (menu4 != 4);

				break;

			case 4:
				
				do {
					System.out.println(
							"Que publicacion desea bajar?\n1)Libro\n2)revista\n3)articulo cientifico\n4)salir.");
					menu5 = sc.nextInt();
					sc.nextLine();
					switch (menu5) {

					case 1:

						for (int i = 0; i < libro.length; i++) {
							if (libro[i] != null) {
								System.out.println(i + ") el titulo del libro es '" + libro[i].getTitulo()
										+ "' escrito por " + libro[i].getAutor() + " en el año "
										+ libro[i].getAño_publicacion() + ", con " + libro[i].getN_paginas()
										+ " paginas, su genero es " + libro[i].getGenero());
							}
						}
						System.out.println("elija la publicacion que desea bajar: ");
						int seleccion = sc.nextInt();
						sc.nextLine();
						BajarLibro(libro, seleccion);

						break;

					case 2:

						for (int i = 0; i < revista.length; i++) {
							if (revista[i] != null) {
								System.out.println(i + ") el titulo de la revista es '" + revista[i].getTitulo()
										+ "' escrito por " + revista[i].getAutor() + " publicado el "
										+ revista[i].getMes_publicacion() + "/"
										+ revista[i].getAño_publicacion());
							}
						}
						System.out.println("elija la publicacion que desea bajar: ");
						int seleccion1 = sc.nextInt();
						sc.nextLine();
						BajarRevista(revista, seleccion1);

						break;

					case 3:
						for (int i = 0; i < art_cientifico.length; i++) {
							if (art_cientifico[i] != null) {
								System.out.println(
										i + ") el titulo del articulo  '" + art_cientifico[i].getTitulo()
												+ "' escrito por " + art_cientifico[i].getAutor()
												+ " publicado el " + art_cientifico[i].getAño_publicacion()
												+ " y trata de " + art_cientifico[i].getTema());
							}
						}
						System.out.println("elija la publicacion que desea bajar: ");
						int seleccion5 = sc.nextInt();
						sc.nextLine();
						BajarArt_cientifico(art_cientifico, seleccion5);
						break;
					case 4:

						break;
					default:

						break;

					}

				} while (menu5 != 4);

				break;
				
			default:

				System.out.println("error, porfavor ingrese del 1 al 5");
				break;

			}

		} while (menu != 5);

	}

	public static void altarLibro(libro[] a, String titulo, String autor, int año_publicacion, int n_paginas,
			String genero) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new libro(titulo, autor, año_publicacion, n_paginas, genero);
				break;
			}
		}
	}

	public static void altarRevista(Revista[] a, String titulo, String autor, int año_publicacion,
			int mes_publicacion) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new Revista(titulo, autor, año_publicacion, mes_publicacion);
				break;
			}
		}
	}

	public static void altarArt_cientifico(art_cientifico[] a, String titulo, String autor, int año_publicacion,
			String tema, int n_paginasAC) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new art_cientifico(titulo, autor, año_publicacion, tema, n_paginasAC);
				break;
			}
		}
	}

	public static void listarLibro(libro[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("el titulo del libro es '" + a[i].getTitulo() + "' escrito por " + a[i].getAutor()
						+ " en el año " + a[i].getAño_publicacion() + ", con " + a[i].getN_paginas()
						+ " paginas, su genero es " + a[i].getGenero());
			}
		}
	}

	public static void listarRevista(Revista[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out
						.println("el titulo de la revista es '" + a[i].getTitulo() + "' escrito por " + a[i].getAutor()
								+ " publicado el " + a[i].getMes_publicacion() + "/" + a[i].getAño_publicacion());
			}
		}
	}

	public static void listarArt_cientifico(art_cientifico[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("el titulo del articulo  '" + a[i].getTitulo() + "' escrito por " + a[i].getAutor()
						+ " publicado el " + a[i].getAño_publicacion() + " y trata de " + a[i].getTema());
			}
		}
	}

	public static void ModificarLibro(libro[] a, int seleccion) {
		Scanner sc = new Scanner(System.in);
		int menu_seleccion = 0;
		do {
			
			System.out.println("seleccione el atributo que quiera modificar\n1) nombre \n2) precio \n3) categoria \n4) marca \n5) salir ");
			menu_seleccion = sc.nextInt();
			sc.nextLine();
			switch(menu_seleccion) {
			
			case 1:
				System.out.println("ingrese el nuevo titulo de la publicacion: ");
				String titulo_nuevo = sc.nextLine();
				a[seleccion].setTitulo(titulo_nuevo);
				break;
			case 2:
				System.out.println("ingrese el nuevo autor de la publicacion: ");
				String autor_nuevo = sc.nextLine();
				a[seleccion].setAutor(autor_nuevo);
				break;
			case 3:
				System.out.println("ingrese el nuevo año de publicacion: ");
				int año_nuevo = sc.nextInt();
				sc.nextLine();
				a[seleccion].setAño_publicacion(año_nuevo);
				break;
			case 4:
				
				System.out.println("ingrese la nueva cantidad de paginas de la publicacion: ");
				int n_paginas_nueva = sc.nextInt();
				sc.nextLine();
				a[seleccion].setN_paginas(n_paginas_nueva);
				
				break;
			case 5:
				
				System.out.println("ingrese el nuevo genero de la publicacion: ");
				String genero_nuevo = sc.nextLine();
				sc.nextLine();
				a[seleccion].setGenero(genero_nuevo);
				
				break;
				
			case 6:
				
				break;
				
			default:
				break;
			}
			
		}while (menu_seleccion !=6);
	}
	public static void ModificarRevista(Revista[] a, int seleccion) {
			Scanner sc = new Scanner(System.in);
			int menu_seleccion = 0;
			do {
				
				System.out.println("seleccione el atributo que quiera modificar\n1) nombre \n2) precio \n3) categoria \n4) marca \n5) salir ");
				menu_seleccion = sc.nextInt();
				sc.nextLine();
				switch(menu_seleccion) {
				
				case 1:
					System.out.println("ingrese el nuevo titulo de la publicacion: ");
					String titulo_nuevo = sc.nextLine();
					a[seleccion].setTitulo(titulo_nuevo);
					break;
				case 2:
					System.out.println("ingrese el nuevo autor de la publicacion: ");
					String autor_nuevo = sc.nextLine();
					a[seleccion].setAutor(autor_nuevo);
					break;
				case 3:
					System.out.println("ingrese el nuevo año de publicacion: ");
					int año_nuevo = sc.nextInt();
					sc.nextLine();
					a[seleccion].setAño_publicacion(año_nuevo);
					break;
				case 4:
					
					System.out.println("ingrese el nuevo mes de publicacion: ");
					int mes_nuevo = sc.nextInt();
					sc.nextLine();
					a[seleccion].setMes_publicacion(mes_nuevo);
					
					break;
				case 5:
					
					break;
					
				default:
					break;
				}
				
			}while (menu_seleccion !=5);
	}
	
	public static void ModificarArt_cientifico(art_cientifico[] a, int seleccion) {
		Scanner sc = new Scanner(System.in);
		int menu_seleccion = 0;
		do {

			System.out.println(
					"seleccione el atributo que quiera modificar\n1) nombre \n2) precio \n3) categoria \n4) marca \n5) salir ");
			menu_seleccion = sc.nextInt();
			sc.nextLine();
			switch (menu_seleccion) {

			case 1:
				System.out.println("ingrese el nuevo titulo de la publicacion: ");
				String titulo_nuevo = sc.nextLine();
				a[seleccion].setTitulo(titulo_nuevo);
				break;
			case 2:
				System.out.println("ingrese el nuevo autor de la publicacion: ");
				String autor_nuevo = sc.nextLine();
				a[seleccion].setAutor(autor_nuevo);
				break;
			case 3:
				System.out.println("ingrese el nuevo año de publicacion: ");
				int año_nuevo = sc.nextInt();
				sc.nextLine();
				a[seleccion].setAño_publicacion(año_nuevo);
				break;
			case 4:

				System.out.println("ingrese el nuevo tema de la publicacion: ");
				String tema_nuevo = sc.nextLine();
				sc.nextLine();
				a[seleccion].setTema(tema_nuevo);
				
				break;
			case 5:

				System.out.println("ingrese la nueva cantidad de paginas: ");
				int n_paginas_nuevo = sc.nextInt();
				sc.nextLine();
				a[seleccion].setN_paginasAC(n_paginas_nuevo);
				
				break;

			case 6:
				break;
			default:
				break;
			}

		} while (menu_seleccion != 6);
	
}
	public static void BajarLibro(libro[] a, int seleccion) {
		
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				a[i] = null;
				System.out.println("Producto eliminado");

				break;
			}	
		}
	}
	public static void BajarRevista(Revista[] a, int seleccion) {
		
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				a[i] = null;
				System.out.println("Producto eliminado");

				break;
			}
		}
	}
	public static void BajarArt_cientifico(art_cientifico[] a, int seleccion) {
		
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				a[i] = null;
				System.out.println("Producto eliminado");

				break;
			}
		}
	}
}