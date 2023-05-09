package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private  List<AutobuzMemento> listaMemento =  new 	ArrayList<>();
	
	public void adaugaMemento(AutobuzMemento memento) {
		listaMemento.add(memento);
	}
	
	public AutobuzMemento getMemento(int index) {
		return this.listaMemento.get(index);
	}

}
