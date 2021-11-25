
public class PorteGarage extends Sujet{
	public Etat s;
	public void setEtat(Etat e) {
		this.s=e;
	}
	public void fermer() {
		s.fermer();
		s.nextState();
	}

	public void ouvrir() {
		s.ouvrir();
		s.nextState();
	}
	public void nextState(Etat e)
	{
		s=e;
	}

}
