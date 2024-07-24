package semestretwo;

import java.util.ArrayList;

public class Array6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 1; i<=10; i++) {
			int numero = i;
			numeros.add(numero);
		}
		
		for (int numero : numeros) {
			
			System.out.println(numero*2);
		}

	}

}
