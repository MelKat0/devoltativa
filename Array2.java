package semestretwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
	
		String[] disciplinas = {"matemática", "filosofia", "história", "física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("língua inglesa");
		novaLista.add("química");
		novaLista.add("biologia");
		
		for (String i: novaLista) 
		{
			System.out.println("Disciplina: " + i);
		}

	}

}
