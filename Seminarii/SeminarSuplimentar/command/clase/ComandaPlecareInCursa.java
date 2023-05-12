package command.clase;

public class ComandaPlecareInCursa implements Comanda{
	private int nrLinie;
	private Automobil automobil;
	
	public ComandaPlecareInCursa(int nrLinie, Automobil automobil) {
		super();
		this.nrLinie = nrLinie;
		this.automobil = automobil;
	}

	@Override
	public void executa() {
		automobil.plecareInCursa(nrLinie);
		
	}
	
	
}
