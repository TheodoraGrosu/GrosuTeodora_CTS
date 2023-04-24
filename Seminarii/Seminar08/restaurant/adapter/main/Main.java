package restaurant.adapter.main;

import restaurant.adapter.bar.Bar;
import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bucatarie.AdapterBucatarieClase;
import restaurant.adapter.bucatarie.AdapterBucatarieObiecte;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftBucatarie;

//Restaurantul achiziționează un nou soft nou pentru lucrul de la bar, însă acesta nu este compatibil
//cu softul de printare facturi folosit pentru produsele de la bucătărie. Vechiul soft era compatibil
//deoarece au fost realizate de aceeași echipa. Să se implementeze un nivel intermediar prin care
//noul soft să poată fi folosit cu softul existent, fără a se modifica codul din vreo aplicație.

public class Main {
	
	public static void imprimare(ISoftBucatarie bucatarie, double totalPlata) {
		bucatarie.printeazaNota(totalPlata);
	}
	
	public static void main(String[] args) {
		ISoftBar bar = new Bar("Conciato");
		bar.printeazaNotaBauturi(200);
//		imprimare(bar, 150);
		System.out.println("\n");
		ISoftBucatarie bucatarie = new Bucatarie("Ionel Popescu");
		bucatarie.printeazaNota(100);
		imprimare(bucatarie, 400);
		
		AdapterBucatarieClase adapter = new AdapterBucatarieClase("Rovi's");
		adapter.printeazaNota(190);
		imprimare(adapter, 170);
		
		System.out.println("\n");
		System.out.println("Adapter de obiecte:");
		AdapterBucatarieObiecte adapterObiecte = new AdapterBucatarieObiecte(new Bar("Alcadibo"));
		adapterObiecte.printeazaNota(340);
		imprimare(adapterObiecte, 120);
	}

}
