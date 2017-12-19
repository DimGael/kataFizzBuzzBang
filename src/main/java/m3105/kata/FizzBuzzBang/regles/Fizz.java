package m3105.kata.FizzBuzzBang.regles;

public class Fizz implements Regle {

	@Override
	public String visit(Integer nombre) {
		if(0 == nombre % 3)
			return "fizz";
		else
			return String.valueOf(nombre);
	}

}
