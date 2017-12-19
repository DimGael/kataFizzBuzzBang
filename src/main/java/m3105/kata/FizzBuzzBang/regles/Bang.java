package m3105.kata.FizzBuzzBang.regles;

public class Bang implements Regle {

	@Override
	public String visit(Integer nombre) {
		if(0 == nombre % 7)
			return "bang";
		else
			return "";
	}

}
