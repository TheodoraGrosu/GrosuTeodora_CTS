package flyweight.main;

import flyweight.clase.FabricaClienti;
import flyweight.clase.IClient;
import flyweight.clase.Rezervare;

//Pentru fiecare rezervare trebuie să se rețină informații cu privire la clientul restaurantului
//precum: nume, număr de telefon, adresă de mail, etc, precum și informațiile despre masa rezervata:
//număr masa, număr persoane, ora rezervare, etc. Astfel, dacă un client realizează mai multe
//rezervări, la fiecare rezervare, informațiile despre client sunt aceleași și se repetă, ocupând foarte
//multă memorie. Să se implementeze modulul de memorare al rezervărilor astfel încât să nu ocupe
//memorie foarte multă


public class Main {
	public static void main(String[] args) {
		FabricaClienti fabricaClienti = new FabricaClienti();
		Rezervare rezervare1 = new Rezervare(1, 1, 2, 16);
		Rezervare rezervare2 = new Rezervare(2, 2, 4, 14);
		Rezervare rezervare3 = new Rezervare(3, 1, 2, 18);
		Rezervare rezervare4 = new Rezervare(4, 3, 1, 12);
		
		IClient client = fabricaClienti.getClient("Maria");
		client.descrieDetaliiRezervare(rezervare1);
		
		IClient client2 = fabricaClienti.getClient("Ion");
		client2.descrieDetaliiRezervare(rezervare2);
		
		fabricaClienti.getClient("Maria").descrieDetaliiRezervare(rezervare3);
		fabricaClienti.getClient("Ion").descrieDetaliiRezervare(rezervare4);
	}
}
