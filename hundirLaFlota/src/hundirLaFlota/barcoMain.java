package hundirLaFlota;
import java.util.*;



public class barcoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		int[] arrayBarco = new int[15];
		int posicion= (int)(Math.random()*15);
		int intentoUsuario,intentos=0,kont=0;
		String aurkituta="ez";
		boolean tocado=false;
	
		if (posicion<14) {
			arrayBarco[posicion]=1;
			arrayBarco[posicion+1]=1;
		}
		
		/*for (int i = 0; i < arrayBarco.length; i++) {
			System.out.print(arrayBarco[i]);
		}*/
		
		System.out.println("Barco colocado!");
		System.out.println("---------------");
		
		
		do {
			System.out.println("En que posicion crees que esta el barco? ");
			intentoUsuario = teklatua.nextInt();
			
			// ACIERTA LA PRIMERA
			if (arrayBarco[intentoUsuario-1]==1) {
				System.out.println("Tocado");
				System.out.println("Donde crees que esta la otra parte del barco?");
				intentoUsuario = teklatua.nextInt();
				tocado=true;
			}else {
				System.out.println("Agua");
				if(intentos==4) {
					System.out.println("Ultimo intento, donde crees que esta el barco?");
					intentoUsuario = teklatua.nextInt();
				}else {
					System.out.println("Has fallado, donde crees que esta?");
					intentoUsuario = teklatua.nextInt();
				}
				
				intentos++;
			}
			
			
			//TIENE QUE ESTAR TOCADO PARA QUE ENTRE EN ESTA CONDICION
			if ((arrayBarco[intentoUsuario-1]==1) && tocado) {
				System.out.println("Has hundido el barco");
				System.exit(0);
			}else {
				System.out.println("Agua");
				intentos++;
			}
			
			
			
		} while (intentos!=5);
		
		System.exit(0);
		
		
	}

}
