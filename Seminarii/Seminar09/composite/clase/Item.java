package composite.clase;

public interface Item {
	void adaugareItem(Item item) throws Exception;
	void stergereItem(Item item) throws Exception;
	void descriere(String spatiere);
	Item getItem(int index) throws Exception;

}
