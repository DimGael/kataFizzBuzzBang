package m3105.kata.FizzBuzzBang;

import m3105.kata.FizzBuzzBang.regles.Regle;

public class FizzBuzz {
	
	public String donnerLaReponsePour(Integer nombre) {
		final ListeRegles listeRegles = new ListeRegles();
		
		String result = "";
		
		for(Regle regle : listeRegles) {
			if(!regle.visit(nombre).equals(""))
				result += regle.visit(nombre);
		}
		
		//Si aucune règle n'a marché pour ce nombre		
		if(result.equals("")) 
			return nombre.toString();
		else
			return result;
	}

}