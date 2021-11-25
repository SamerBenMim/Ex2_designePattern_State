
public class Ouverture extends Etat {
public Ouverture(PorteGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
public void nextState() {
	p.nextState(new Ouverte(p));
}
public void ouvrir() {
	System.out.println("la porte est ouverte");
	
}
public void fermer() {
	System.out.println("Fermeture de la porte ");
}
}
