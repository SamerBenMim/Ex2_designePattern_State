
public class Fermee extends Etat{
	public Fermee(PorteGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public void nextState() {
		p.nextState(new Ouverture(p));
	}
	public void fermer() {
		System.out.println("la porte est deja fermee");
		
	}
	public void ouvrir() {
		System.out.println("Ouverture de la porte ");
	}
}
