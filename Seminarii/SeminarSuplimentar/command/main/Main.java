package command.main;

import command.clase.Automobil;
import command.clase.ComandaPlecareInCursa;
import command.clase.Operator;
import command.clase.Autobuz;

//In cadrul unei autobaze este ceruta implementarea unui modul software prin care operatorul sa
//poata solicita plecarile pentru fiecare autobuz de la capat de linie si pe ce linie va merge (numarul
//liniei). Comenzile de plecare pe o anumita linie vor fi salvate intr-o colectie, iar in momentul in
//care autobuzul este disponibil acesta va prelua comanda de plecare in traseu.
//Operatorul are posibilitatea sa stabileasca plecarile de la prima ora a zilei, astfel nu mai este
//necesara interventia acestuia pe timpul zile

public class Main {
	public static void main(String[] args) {
		Operator operator = new Operator();
		Automobil autobuz = new Autobuz(13);
		
		operator.adaugaComanda(new ComandaPlecareInCursa(1, autobuz));
		operator.adaugaComanda(new ComandaPlecareInCursa(2, new Autobuz(10)));
		operator.adaugaComanda(new ComandaPlecareInCursa(1, autobuz));
		operator.adaugaComanda(new ComandaPlecareInCursa(4, new Autobuz(20)));
		
		operator.executaComanda();
		operator.executaComanda();
		operator.adaugaComanda(new ComandaPlecareInCursa(4, new Autobuz(22)));
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
	}
}
