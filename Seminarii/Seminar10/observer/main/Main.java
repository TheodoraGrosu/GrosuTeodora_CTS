package observer.main;

import observer.clase.ClientRestaurant;
import observer.clase.Observer;
import observer.clase.Restaurant;

//
//Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește
//implementarea unui modul care atunci când se realizează o ofertă de preț sau se introduce un nou
//meniu să se trimită notificări tuturor clienților abonați la notificările restaurantului.

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant =  new Restaurant("Bonita");
		
		Observer client1 = new ClientRestaurant("Vlad");
		Observer client2 = new ClientRestaurant("Maria");
		Observer client3 = new ClientRestaurant("Ion");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.notificaOfertaPret();
		
		restaurant.adaugaObserver(client3);
		restaurant.notificaOfertaMeniu();
	}
}
