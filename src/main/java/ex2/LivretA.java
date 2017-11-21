package ex2;

public class LivretA extends CompteBancaire {
	
	private double tauxRemuneration;
	
	/** Ce constructeur est utilis� pour cr�er un compte de type Livret A
	 * @param solde repr�sente le solde du compte
	 * @param tauxRemuneration  repr�sente le taux de r�mun�ration du livret A
	 */
	public LivretA (double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * M�thode appliquant la r�mun�ration annuelle sur le solde du compte
	 */
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}


	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}			
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
