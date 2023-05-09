package state.clase;

public class StareRezervata implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		if((masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa cu numarul " + masa.getNrRezervare() + " este rezervata");
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
		
	}

}
