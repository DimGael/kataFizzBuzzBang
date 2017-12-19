package m3105.kata.FizzBuzzBang.regles;

import java.util.ArrayList;

public class ListeRegles extends ArrayList<Regle>{
	
	private static final long serialVersionUID = 1L;

	public ListeRegles() {
		super();
		
		//Ajout de la règle Fizz
		this.add(new Fizz());
		this.add(new Buzz());
		this.add(new Bang());
	}
}
