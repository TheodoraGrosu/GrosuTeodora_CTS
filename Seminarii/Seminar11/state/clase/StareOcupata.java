package state.clase;

public class StareOcupata implements  Stare {

	@Override
	public void schimbareStare(Masa masa) {
		if(!(masa.getStare() instanceof StareOcupata)) {
			masa.setStare(this);
			System.out.println("Masa cu numarul " + masa.getNrRezervare() + " este ocupata");
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
		
	}

}
