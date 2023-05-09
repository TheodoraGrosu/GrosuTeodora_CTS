package state.clase;

public class StareLibera implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa cu numarul " + masa.getNrRezervare() + " este eliberata");
		}
		else {
			System.out.println("Masa este deja libera");
		}
	}

}
