package ABML1;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		
		Electronica electronica[] = new Electronica[10];
		
		Ropa ropa[] = new Ropa[10];
		
		Alimento alimento[] = new Alimento[10];	
		
		int menu = 0, menu2 = 0, menu3 = 0, menu4 = 0, menu5 = 0;
		
		

	do {
			
			System.out.println("ingrese una opcion \n1)Altar producto\n2)Listar productos\n3)Modificar Producto\n4)Bajar Producto\n5)salir.");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu){
			
			case 1:
					
				do {
					System.out.println("Que deseas altar?\n1)Electronica\n2)Ropas\n3)Alimentos\n4)salir.");
					menu2 = sc.nextInt();
					sc.nextLine();
					
					switch(menu2) {
					
					case 1:
						
						System.out.println("ingresar nombre del producto:");
						String nombrePE = sc.nextLine();
						System.out.println("ingresar precio del producto:");
						int precioPE = sc.nextInt();
						sc.nextLine();
						System.out.println("ingresar categoria del producto\n(electrodomesticos, gaming, etc.");
						String categoriaPE = sc.nextLine();
						System.out.println("ingresar marca del producto");
						String marca = sc.nextLine();
						
						AltarElectronica(electronica, nombrePE, precioPE, categoriaPE, marca);
						break;
					
					
					case 2:
						
						System.out.println("nombre de la prenda:");
						String nombrePR = sc.nextLine();
						System.out.println("ingresar precio del producto:");
						int precioPR= sc.nextInt();
						sc.nextLine();
						System.out.println("de que color es?:");
						String color = sc.nextLine();
						System.out.println("ingresar talle de ropa:");
						String talle = sc.nextLine();
						
						AltarRopa(ropa, nombrePR, precioPR, color, talle);
						break;
					
					
					case 3:
						
						System.out.println("ingresar producto:");
						String nombrePA = sc.nextLine();
						System.out.println("ingresar precio del producto:");
						int precioPA= sc.nextInt();
						sc.nextLine();
						System.out.println("categoria del producto:");
						String categoriaPA = sc.nextLine();
						System.out.println("mes de caducidad");
						int caducidad = sc.nextInt();
						sc.nextLine();
						
						AltarAlimento(alimento, nombrePA, precioPA, categoriaPA, caducidad);
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
					System.out.println("Que deseas listar?\n1)Producto de Electronica\n2)Prendas de Ropa\n3)Alimentos\n4)salir.");
					menu3 = sc.nextInt();
					sc.nextLine();
					
					switch(menu3) {
					
					case 1:
						
						ListarElectronica(electronica);
						
						break;
					
					
					case 2:
						
						ListarRopa(ropa);
						
						break;
					
					
					case 3:
						
						ListarAlimento(alimento);
						
						break;
						
						
					case 4:
						
						break;
					
					default: 
						
						System.out.println("error, porfavor ingrese del 1 al 4");
						break;
					}
				}while(menu3 !=4);
				
				break;
				
				
			case 3:
				
				do {
					
					System.out.println("Que producto desea modificar?\n1)Electronica\n2)Ropa\n3)Alimentos\n4)salir.");
					menu4 = sc.nextInt();
					sc.nextLine();
					switch(menu4){
						case 1:
							
							for (int i = 0; i < electronica.length; i++) {
								if (electronica[i] != null){
									System.out.println(i+") El producto electronico "+ electronica[i].getNombre() + " su precio es de $"+  electronica[i].getPrecio()+ ", pertenece a "+ electronica[i].getCategoria()+ ", de marca "+ electronica[i].getMarca());				
								}
							}
							System.out.println("elija el producto que desea modificar: ");
							int seleccion = sc.nextInt();
							sc.nextLine();
							ModificarElectronica(electronica, seleccion);
							
							break;
						case 2:
							
							for (int i = 0; i < ropa.length; i++) {
								if (ropa[i] != null){
									System.out.println(i+") El/La "+ ropa[i].getNombre() + ", cuesta $"+ ropa[i].getPrecio()+ ", es de color "+ ropa[i].getColor()+ ", y su talla es"+ ropa[i].getTalle());				
								}
							}
							System.out.println("elija el producto que desea modificar: ");
							int seleccion2 = sc.nextInt();
							sc.nextLine();
							ModificarRopa(ropa, seleccion2);
							
							break;
						case 3:
						
							for (int i = 0; i < alimento.length; i++) {
								if (alimento[i] != null){
									System.out.println(i+") El/La "+ alimento[i].getNombre() + ", cuestan $"+ alimento[i].getPrecio()+ ", pertenece a "+ alimento[i].getCategoria()+ ", y su mes de vencimiento es el "+ alimento[i].getCaducidad());				
								}
							}
							System.out.println("elija el producto que desea modificar: ");
							int seleccion3 = sc.nextInt();
							sc.nextLine();
							ModificarAlimento(alimento, seleccion3);
							
							break;
						case 4:
						
							break;
						default:
							
							break;
					}
					
				}while (menu4 !=4);
				
				break;
			
			case 4:
				
				do {
					System.out.println("Que producto desea bajar?\n1)Electronica\n2)Ropa\n3)Alimentos\n4)salir.");
					menu5 = sc.nextInt();
					sc.nextLine();
					switch(menu5) {
					
					case 1:
						
						for (int i = 0; i < electronica.length; i++) {
							if (electronica[i] != null){
								System.out.println(i+") El producto electronico "+ electronica[i].getNombre() + " su precio es de $"+  electronica[i].getPrecio()+ ", pertenece a "+ electronica[i].getCategoria()+ ", de marca "+ electronica[i].getMarca());				
							}
						}
						System.out.println("elija el producto que desea bajar: ");
						int seleccion = sc.nextInt();
						sc.nextLine();
						BajarElectronica(electronica, seleccion);
						
						break;
						
					case 2:
						
						for (int i = 0; i < ropa.length; i++) {
							if (ropa[i] != null){
								System.out.println(i+") El/La "+ ropa[i].getNombre() + ", cuesta $"+ ropa[i].getPrecio()+ ", es de color "+ ropa[i].getColor()+ ", y su talla es"+ ropa[i].getTalle());	
							}
						}
						System.out.println("elija el producto que desea bajar: ");
						int seleccion1 = sc.nextInt();
						sc.nextLine();
						BajarRopa(ropa, seleccion1);
						
						break;
					
					case 3:
						for (int i = 0; i < alimento.length; i++) {
							if (alimento[i] != null){
								System.out.println(i+") El/La "+ alimento[i].getNombre() + ", cuestan $"+ alimento[i].getPrecio()+ ", pertenece a "+ alimento[i].getCategoria()+ ", y su mes de vencimiento es el "+ alimento[i].getCaducidad());	
							}
						}
						System.out.println("elija el producto que desea bajar: ");
						int seleccion5 = sc.nextInt();
						sc.nextLine();
						BajarAlimento(alimento, seleccion5);
						break;
					case 4:
						
						break;
					default:
						
						break;
					
					}
					
				}while (menu5 !=4);
				
				break;
			
			case 5:
				
				break;
			
			default: 
				
				System.out.println("error, porfavor ingrese del 1 al 5");
				break;
			
			}
			
			
			
		}while (menu !=5);
	}

	public static void AltarElectronica(Electronica[] E, String nombre, int precio, String categoria, String marca) {
		
		for (int i = 0; i < E.length; i++) {
			
			if (E[i] == null) {
				E[i] = new Electronica(nombre, precio, categoria, marca);
				break;
			}
		}
	}
		public static void AltarRopa(Ropa[] R, String nombre, int precio, String color, String talle) {
			
			for (int i = 0; i < R.length; i++) {
				
				if (R[i] == null) {
					R[i] = new Ropa(nombre, precio, color, talle);
					break;
				}
			}
		}
		public static void AltarAlimento(Alimento[] A, String nombre, int precio, String categoria, int caducidad) {
				
				for (int i = 0; i < A.length; i++) {
					
					if (A[i] == null) {
						A[i] = new Alimento(nombre, precio, categoria, caducidad);
						break;
				}
			}
		}
		public static void ListarElectronica(Electronica[] E) {
			
			for (int i = 0; i < E.length; i++) {
				if (E[i] != null){
					System.out.println(i+") El producto electronico "+ E[i].getNombre() + " su precio es de $"+  E[i].getPrecio()+ ", pertenece a "+ E[i].getCategoria()+ ", de marca "+ E[i].getMarca());				
				}
			}
		}
	public static void ListarRopa(Ropa[] R) {
			
			for (int i = 0; i < R.length; i++) {
				if (R[i] != null){
					System.out.println(i+") El/La "+ R[i].getNombre() + ", cuesta $"+ R[i].getPrecio()+ ", es de color "+ R[i].getColor()+ ", y su talla es"+ R[i].getTalle());				
				}
			}
		}
	public static void ListarAlimento(Alimento[] A) {
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] != null){
				System.out.println(i+") El/La "+ A[i].getNombre() + ", cuestan $"+ A[i].getPrecio()+ ", pertenece a "+ A[i].getCategoria()+ ", y su mes de vencimiento es el "+ A[i].getCaducidad());				
				}
			}
		}
	
	public static void ModificarElectronica(Electronica[] E, int seleccion) {
		Scanner sc = new Scanner(System.in);
		int menu_seleccion = 0;
		do {
			
			System.out.println("seleccione el atributo que quiera modificar\n1) nombre \n2) precio \n3) categoria \n4) marca \n5) salir ");
			menu_seleccion = sc.nextInt();
			sc.nextLine();
			switch(menu_seleccion) {
			
			case 1:
				System.out.println("ingrese el nuevo nombre del producto: ");
				String nombre_nuevo = sc.nextLine();
				E[seleccion].setNombre(nombre_nuevo);
				break;
			case 2:
				System.out.println("ingrese el nuevo precio del producto: ");
				int precio_nuevo = sc.nextInt();
				E[seleccion].setPrecio(precio_nuevo);
				break;
			case 3:
				System.out.println("ingrese la nueva categoria del producto: ");
				String categoria_nueva = sc.nextLine();
				E[seleccion].setCategoria(categoria_nueva);
				break;
			case 4:
				System.out.println("ingrese la nueva marca del producto: ");
				String marca_nueva = sc.nextLine();
				E[seleccion].setMarca(marca_nueva);
				break;
			case 5:
				
				break;
				
			default:
				break;
			}
			
		}while (menu_seleccion !=5);
		
		
	}
	public static void ModificarRopa(Ropa[] R, int seleccion) {
		Scanner sc = new Scanner(System.in);
		int menu_seleccion = 0;
		do {
			
			System.out.println("seleccione el atributo que quiera modificar\n1) nombre \n2) precio \n3) color \n4) talla \n5) salir ");
			menu_seleccion = sc.nextInt();
			sc.nextLine();
			switch(menu_seleccion) {
			
			case 1:
				System.out.println("ingrese el nuevo nombre del producto: ");
				String nombre_nuevo = sc.nextLine();
				R[seleccion].setNombre(nombre_nuevo);
				break;
			case 2:
				System.out.println("ingrese el nuevo precio del producto: ");
				int precio_nuevo = sc.nextInt();
				R[seleccion].setPrecio(precio_nuevo);
				break;
			case 3:
				System.out.println("ingrese el nuevo color del producto: ");
				String color_nuevo = sc.nextLine();
				R[seleccion].setColor(color_nuevo);
				break;
			case 4:
				System.out.println("ingrese el nuevo talle del producto: ");
				String talle_nuevo = sc.nextLine();
				R[seleccion].setTalle(talle_nuevo);
				break;
			case 5:
				
				break;
				
			default:
				break;
			}
			
		}while (menu_seleccion !=5);
		
		
		}
	public static void ModificarAlimento(Alimento[] A, int seleccion) {
		Scanner sc = new Scanner(System.in);
		int menu_seleccion = 0;
		do {
			
			System.out.println("seleccione el atributo que quiera modificar\n1) nombre \n2) precio \n3) categoria \n4) caducidad \n5) salir ");
			menu_seleccion = sc.nextInt();
			sc.nextLine();
			switch(menu_seleccion) {
			
			case 1:
				System.out.println("ingrese el nuevo nombre del producto: ");
				String nombre_nuevo = sc.nextLine();
				A[seleccion].setNombre(nombre_nuevo);
				break;
			case 2:
				System.out.println("ingrese el nuevo precio del producto: ");
				int precio_nuevo = sc.nextInt();
				A[seleccion].setPrecio(precio_nuevo);
				break;
			case 3:
				System.out.println("ingrese la nueva categoria del producto: ");
				String categoria_nueva = sc.nextLine();
				A[seleccion].setCategoria(categoria_nueva);
				break;
			case 4:
				System.out.println("ingrese el nuevo mes de caducidad: ");
				int caducidad_nuevo = sc.nextInt();
				A[seleccion].setCaducidad(caducidad_nuevo);
				break;
			case 5:
				
				break;
				
			default:
				break;
			}
			
		}while (menu_seleccion !=5);
		
		
		}
	
	public static void BajarElectronica(Electronica[] E, int seleccion) {
		
		for (int i = 0; i < E.length; i++) {

			if (E[i] != null) {

				E[i] = null;
				System.out.println("Producto eliminado");

				break;
			}	
		}
	}
	public static void BajarRopa(Ropa[] R, int seleccion) {
		
		for (int i = 0; i < R.length; i++) {

			if (R[i] != null) {

				R[i] = null;
				System.out.println("Producto eliminado");

				break;
			}
		}
	}
	public static void BajarAlimento(Alimento[] A, int seleccion) {
		
		for (int i = 0; i < A.length; i++) {

			if (A[i] != null) {

				A[i] = null;
				System.out.println("Producto eliminado");

				break;
			}
		}
	}
}
	