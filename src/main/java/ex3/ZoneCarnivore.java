package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {
	public static final String nom = "Zone carnivore";

	public boolean addAnimal(Animal a) {
		if (a.getType() == TypeAnimal.MAMMIFERE && a.getComportement() == Comportement.CARNIVORE) {
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
