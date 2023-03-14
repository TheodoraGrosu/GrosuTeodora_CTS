package cts.programe;

import cts.singleton.registru.Firma;
import cts.singleton.registru.Registru;

public class Program {
	public static void main(String[] args) {
		Registru registru = new Registru();
		Registru registru2 = new Registru();
		
		Firma firma1 = registru.getFirma("SC FIRMA SRL");
		Firma firma2 = registru.getFirma("SC STUDENT SRL");
		Firma firma3 = registru2.getFirma("SC FIRMA SRL");
		
		firma1.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
		
//		Firma firma4 = new Firma("SC FIRMA SRL", 0); pentru ca am mutat main-ul in alt pachet si am facut constructorul protected la Firma(cts.singleton.registru) si tot puteam creea
//		singleton register asigura unicitatea obiectelor 
	}
}
