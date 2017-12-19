package m3105.kata.FizzBuzzBang;

import java.util.ArrayList;

import m3105.kata.FizzBuzzBang.regles.Bang;
import m3105.kata.FizzBuzzBang.regles.Buzz;
import m3105.kata.FizzBuzzBang.regles.Fizz;
import m3105.kata.FizzBuzzBang.regles.Regle;

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
