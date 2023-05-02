package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;

//Este dorită implementarea modului de plată pentru clienții restaurantului. Modul de plată îl
//decide clientul în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul sau
//cash. Sa se implementeze modulul de plata al restaurantului.

public class Main {
	public static void main(String[] args) {
		Client client = new Client("Andrei");
		client.realizeazaPlata(200.0);
		client.setModPlata(new PlataCard());
		
		client.realizeazaPlata(356.0);
		client.setModPlata(new PlataCash());
		client.realizeazaPlata(1000.0);
	}

}
