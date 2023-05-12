package command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<Comanda> listaComenzi = new ArrayList<>();
	
	public void adaugaComanda(Comanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(listaComenzi.size() > 0) {
			listaComenzi.get(0).executa();
			listaComenzi.remove(0);
		}
		else {
			System.out.println("Nu exista comenzi.");
		}
	}

}
