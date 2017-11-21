package ex2;

/** Repr�sente un compte bancaire de type compte courant
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/**
	 *  @param solde
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant le montant � cr�diter
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Retire un montant du solde
	 * @param montant le montant � d�biter
	 */
	public abstract void debiterMontant(double montant);

	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
