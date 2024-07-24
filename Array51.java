package semestretwo;

import java.util.ArrayList;
import java.util.Random;

public class Array51 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}
		
		numeros.remove(4);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}

	}

}
