package interfaz_juego;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		dinosaurio dino = new dinosaurio("joaquin", "T-REX");
		perro perrox = new perro("felipe", "pastor aleman");
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			
			System.out.println("1) Dar de comer al perro\n2) Mandar a dormir al perro\n3) Dar de comer al dinosaurio\n4) Mandar a dormir al dinosaurio.\n5) salir.");
			menu = sc.nextInt();
			
			switch (menu) {
			
			case 1:
				
				perrox.comer();
				
				break;
				
			case 2:
				
				perrox.dormir();
				
				break;
				
			case 3:
				
				dino.comer();
				
				break;
				
			case 4:
				
				dino.dormir();
				
				break;
				
			case 5:
				
				System.out.println("");
				
				break;
				
			default:
				
				System.out.println("porfavor ingrese del 1 al 5");
				
				break;
			
			}
			
			
			
		}while (menu !=5);
		
	}

}
