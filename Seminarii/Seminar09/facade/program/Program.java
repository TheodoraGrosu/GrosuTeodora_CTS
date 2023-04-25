package facade.program;

import facade.clase.Facade;

// FACADE
//Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului prin
//intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
//disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si
//ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci
//să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri

public class Program {
	public static void main(String[] args) {
		Facade facade = new Facade();
		System.out.println(facade.verificareMasa(10));
		System.out.println(facade.verificareMasa(5));
		System.out.println(facade.verificareMasa(2));
	}

}
