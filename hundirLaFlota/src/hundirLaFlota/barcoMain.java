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
	
		System.out.println(posicion);
		if (posicion<14) {
			arrayBarco[posicion]=1;
			arrayBarco[posicion+1]=1;
		}
		
		for (int i = 0; i < arrayBarco.length; i++) {
			System.out.print(arrayBarco[i]);
		}
		
		System.out.println("Barco colocado!");
		System.out.println("---------------");
		
		
		do {
			System.out.println("En que posicion crees que esta el barco? ");
			intentoUsuario = teklatua.nextInt();
			
			
			if (arrayBarco[intentoUsuario-1]==1) {
				System.out.println("Tocado");
				tocado=true;
			}else {
				System.out.println("Agua");
				intentos++;
			}
			
			if ((arrayBarco[intentoUsuario-1]==1) && tocado) {
				System.out.println("Hundido");
			}else {
				System.out.println("Agua");
				intentos++;
			}
			
			
			
			
		} while (intentos!=5);
		
		
		
	}

}
