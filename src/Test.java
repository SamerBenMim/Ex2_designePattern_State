
public class Test {

	public static void main(String[] args) {
	
		PorteGarage p=new PorteGarage();
		Fermeture e = new Fermeture(p);
		p.setEtat(e);
		p.ouvrir();
		p.fermer();
	}

}
