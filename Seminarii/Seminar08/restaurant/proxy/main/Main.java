package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

//Managerul restaurantului dorește ca atunci când cineva dorește să realizez e o rezervare sa fie
//permisă doar dacă aceasta este realizată pentru minim 4 persoane. În sens contrar rezervarea nu
//este realizata, iar persoanele sunt rugate să se prezinte la restaurant deoarece sunt suficiente locuri
//pentru mesele de doua persoane. Sa se realizeze un nivel intermediar care sa condiționeze
//realizarea rezervărilor de numărul de persoane.


public class Main {
	public static void main(String[] args) {
		IRestaurant restaurant = new Restaurant("Papacip");
		restaurant.rezervaMasa(9);
		restaurant.rezervaMasa(2);
		
		System.out.println("\n");
		System.out.println("Cu proxy:");
		IRestaurant proxy = new ProxyRestaurant(new Restaurant("Alabala")); 
		proxy.rezervaMasa(2);
		proxy.rezervaMasa(9);
	}

}
