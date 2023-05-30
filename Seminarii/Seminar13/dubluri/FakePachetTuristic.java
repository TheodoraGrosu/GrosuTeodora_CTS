package dubluri;

import clase.IPachetTuristic;
import clase.IPersoana;

public class FakePachetTuristic implements IPachetTuristic{
	private double pret;
	private String destinatie;

	@Override
	public Double getPret() {
		// TODO Auto-generated method stub
		return pret;
	}

	@Override
	public IPersoana getClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDestinatie() {
		// TODO Auto-generated method stub
		return destinatie;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClient(IPersoana client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
		
	}

	@Override
	public void setPret(Double pret) {
		this.pret = pret;
		
	}

}
