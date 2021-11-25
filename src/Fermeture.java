
public class Fermeture  extends Etat{
	public Fermeture(PorteGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public void nextState() {
		p.nextState(new Fermee(p));
	}
	public void fermer() {
		System.out.println("la porte est deja en train de se fermer");
		
	}
	public void ouvrir() {
		System.out.println("Ouverture de la porte ");
	}
}
