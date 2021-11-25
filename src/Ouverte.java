 
public class Ouverte extends Etat {
	public Ouverte(PorteGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public void nextState() {
		p.nextState(new Fermeture(p));
	}
	public void ouvrir() {
		System.out.println("la porte est en ouverture");
		
	}
	public void fermer() {
		System.out.println("Fermeture de la porte ");
	}

}
