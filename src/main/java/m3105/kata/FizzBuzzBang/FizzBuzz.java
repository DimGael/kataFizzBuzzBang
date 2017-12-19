package m3105.kata.FizzBuzzBang;

import m3105.kata.FizzBuzzBang.regles.Regle;

public class FizzBuzz {
	
	public String donnerLaReponsePour(Integer nombre) {
		
		final ListeRegles listeRegles = new ListeRegles();
		String result = "";
		boolean noMatch = true;
		
		for(Regle regle : listeRegles) {
			if(regle.visit(nombre) != nombre.toString()) {
				result += regle.visit(nombre);
				noMatch = false;
			}
		}
		
		//Si aucune règle n'a marché pour ce nombre
		if(noMatch) {
			return nombre.toString();
		}
		
		return result;
	}
		
		

	private boolean isFizzBuzz(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}