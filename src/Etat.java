
public abstract class Etat {
	public PorteGarage p ;
	public Etat(PorteGarage p) {
		this.p=p;
	}
	public abstract void  ouvrir();
	public abstract void  fermer();
	public abstract void  nextState();
	
}
