package cts.singleton.registru;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String, Firma> registru = new HashMap<String, Firma>();
	//fie o fac statica si foloseste doar lista asta
	//fie o face singleton si face lazy pentru ca registrul este unic
	
	public Firma getFirma(String nume) {
		if(!registru.containsKey(nume)) {
//			Firma firma = new Firma(nume, 0)
			registru.put(nume, new Firma(nume, 0));
		}
		return registru.get(nume);
	}
}
