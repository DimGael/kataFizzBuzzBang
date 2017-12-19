package m3105.kata.FizzBuzzBang;

import m3105.kata.FizzBuzzBang.regles.Regle;

public class FizzBuzz {
	
	public String donnerLaReponsePour(Integer nombre) {
		final ListeRegles listeRegles = new ListeRegles();
		
		String result = "";
		
		for(Regle regle : listeRegles) {
			if(!regle.visit(nombre).equals(nombre.toString()))
				result += regle.visit(nombre);
		}
		
		//Si aucune règle n'a marché pour ce nombre		
		if(result.equals("")) 
			return nombre.toString();
		else
			return result;
	}
		
		

	private boolean isFizzBuzz(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

}