package patterndemo.strategy.implementezmoi;

public class Story {
	private final int valeur;
	private final Priorite priorite;
	private String titre;
	public Story(String titre, int valeur, Priorite priorite) {
		super();
		this.valeur = valeur;
		this.priorite = priorite;
		this.titre=titre;
	}
	public Priorite getPriorite() {
		return priorite;
	}
	public int getValeur() {
		return valeur;
	}
	@Override
	public String toString() {
		return String.format("%5s %7s %s", valeur, priorite, titre);
	}
}
