package hundirLaFlota;
import java.util.*;


public class barcoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		int[] arrayBarco = new int[15];
		int posicion= (int)(Math.random()*15);
		int intentoUsuario,intentos=0;
	
		System.out.println(posicion);
		arrayBarco[posicion]=1;
		arrayBarco[posicion+1]=1;
		System.out.println("Barco colocado!");
		System.out.println("---------------");
		
		
		do {
			System.out.println("En que posicion crees que esta el barco? ");
			intentoUsuario = teklatua.nextInt();
			
			for (int i = 0; i < arrayBarco.length; i++) {
				//if (intentoUsuario == ) {
					
				//}
			}
			
			
		} while (intentos!=5);
		
		
		
	}

}
