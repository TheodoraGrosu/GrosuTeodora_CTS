package memento.main;

import memento.clase.Autobuz;
import memento.clase.Operator;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("Vasile", 9, "Mercedes", 2000, 20);
		Operator operator = new Operator();
		operator.adaugaMemento(autobuz.creazaMemento());
		System.out.println(autobuz.toString());
		autobuz.setNumeSofer("Popescu");
		autobuz.setConsumMediu(20);
		System.out.println(autobuz.toString());
		autobuz.restaurareAutobuz(operator.getMemento(0));
		System.out.println(autobuz.toString());
	}
}
