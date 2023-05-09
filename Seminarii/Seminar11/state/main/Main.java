package state.main;

import state.clase.Masa;

//Restaurantul dorește implementarea unui modul pentru gestiunea modului de ocupare al
//meselor. O masă poate să aibă una din următoarele stări: Rezervata, Ocupata, Libera. Atunci
//când un client face o rezervare, masa trece in starea Rezervata. Când clientul ridica rezervarea
//masa trece in starea ocupata, iar când pleacă, masa trece in starea libera.

public class Main {
	public static void main(String[] args) {
		Masa masa = new Masa(12);
		masa.elibereazaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervare();
		masa.ocupaMasa();
		masa.elibereazaMasa();
		masa.rezervaMasa();
	}

}
