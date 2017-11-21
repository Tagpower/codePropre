package ex3;

import java.util.List;

public class SavaneAfricaine extends Zone {
	public static final String nom = "Savane africaine";
	
	public boolean addAnimal(Animal a) {
		if (a.getType() == TypeAnimal.MAMMIFERE && a.getComportement() == Comportement.HERBIVORE) {
			animaux.add(a);
			return true;			
		} else {
			return false;
		}	
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}
