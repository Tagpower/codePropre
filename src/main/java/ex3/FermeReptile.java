package ex3;

import java.util.List;

public class FermeReptile extends Zone {
	public static final String nom = "Ferme reptiles";
	
	public boolean addAnimal(Animal a) {
		if (a.getType() == TypeAnimal.REPTILE) {
			animaux.add(a);
			return true;			
		} else {
			return false;
		}	
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.1;
	}
}
