package m3105.kata.FizzBuzzBang.regles;

public class Buzz implements Regle {

	@Override
	public String visit(Integer nombre) {
		if(0 == nombre % 5)
			return "buzz";
		else
			return "";
	}

}
