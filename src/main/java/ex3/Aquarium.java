package ex3;

import java.util.List;

public class Aquarium extends Zone {
	public static final String nom = "Aquarium";
	
	public boolean addAnimal(Animal a) {
		if (a.getType() == TypeAnimal.POISSON) {
			animaux.add(a);
			return true;			
		} else {
			return false;
		}	
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}
