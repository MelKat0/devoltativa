package semestretwo;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10); 
		numeros.add(20);
		
		System.out.println("Adicionando um valor: " + numeros.get(0));
		System.out.println("Adicionando um valor: " + numeros.get(1));
		
		numeros.set(1, 25);
		System.out.println("Modificando o valor 1: " + numeros.get(1));
		
		numeros.remove(0);
		System.out.println("Removendo o valor 0: " + numeros.get(0));
		
		System.out.println("A lista é de: " + numeros.size());
		
	}

}
