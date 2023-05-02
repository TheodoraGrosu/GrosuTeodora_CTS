package chain.main;

import chain.clase.Client;
import chain.clase.NotificareMail;
import chain.clase.NotificareManager;
import chain.clase.NotificareTelefon;
import chain.clase.Notificator;

//Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește
//implementarea unui modul sa notifice clienții restaurantului.
//Problema este că restaurantul deține pentru anumiți clienți numărul de telefon, iar pentru alți
//clienți doar adresa de mail. Să se implementeze funcționalitatea de a trimite notificări clienților
//prin SMS, iar în cazul în care pentru anumiți clienți restaurantul nu are în baza de date numărul
//de telefon, să se trimită notificarea prin email. În cazul clienților pentru care nu există nici
//numărul de telefon, nici adresa de mail, se trimite managerului restaurantului o notificare cu
//numele clientului pentru care nu există date de contact


public class Main {
	public static void main(String[] args) {
		Notificator notificatorTelefon = new NotificareTelefon();
		Notificator notificatorMail = new NotificareMail();
		Notificator notificatorManager  = new NotificareManager();
		
		notificatorTelefon.setSuccesor(notificatorMail);
		notificatorMail.setSuccesor(notificatorManager);
		
		Client client1 = new Client("Maria", "0765438796", null);
		Client client2 = new Client("Ion", null, null);
		Client client3 = new Client("Vasile", null, "vasile@gmail.com");
		Client client4 = new Client("Andrei", "0876543276", "andrei@gamil.com");
		notificatorTelefon.notificaClient("Ai primit o notificare", client1);
		notificatorTelefon.notificaClient("Ai primit o notificare", client2);
		notificatorTelefon.notificaClient("Ai primit o notificare", client3);
		notificatorTelefon.notificaClient("Ai primit o notificare", client4);
		}

}
