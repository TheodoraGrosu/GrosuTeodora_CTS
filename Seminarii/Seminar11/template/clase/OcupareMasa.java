package template.clase;

public abstract class OcupareMasa {
	private int nrMasa;

	public OcupareMasa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}
	
	
	
	public int getNrMasa() {
		return nrMasa;
	}



	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}



	protected abstract void curataMasa();
	protected abstract void aseazaServetele();
	protected abstract void aseazaTacamuri();
	protected abstract void asezarePersoane();
	
	public final void ocupareMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		asezarePersoane();
	}
	

}
