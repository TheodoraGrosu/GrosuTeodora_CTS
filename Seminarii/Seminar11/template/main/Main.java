package template.main;

import template.clase.MasaLocal;
import template.clase.MasaRezervata;
import template.clase.OcupareMasa;

public class Main {
	public static void main(String[] args) {
		OcupareMasa masa = new MasaLocal(1);
		masa.ocupareMasa();
		
		System.out.println();
		OcupareMasa masa2 = new MasaRezervata(2, "12:00");
		masa2.ocupareMasa();
	}

}
