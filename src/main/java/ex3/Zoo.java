package ex3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> zones;
	
	public Zoo(String nom){
		this.nom = nom;
		zones = new ArrayList<Zone>();
		zones.add(new ZoneCarnivore());
		zones.add(new SavaneAfricaine());
		zones.add(new FermeReptile());
		zones.add(new Aquarium());		
	}
	
	public void addAnimal(Animal a){
		for (Zone z : zones) {
			if (z.addAnimal(a)) {
				return;
			}
		}
	}
	
	public void afficherListeAnimaux(){
		for(Zone z : zones) {
			z.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
