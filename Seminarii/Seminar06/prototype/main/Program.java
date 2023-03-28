package prototype.main;

import java.util.HashMap;
import java.util.Map;

import prototype.clase.IReteta;
import prototype.clase.Reteta;

public class Program {
	public static void main(String[] args) {
		Map<String, Float> solutii = new HashMap<>();
		solutii.put("solutia1", (float)20);
		solutii.put("solutie2", (float)30);
		solutii.put("solutie3", (float)10);
		IReteta prototype = new Reteta("Reteta", solutii, 60);
		Reteta farmacie = (Reteta)prototype.copiaza();
		farmacie.setNume("Reteta farmaciei");
		Reteta laborator = (Reteta)prototype.copiaza();
		laborator.setNume("Reteta laborator");
		System.out.println(laborator);
		System.out.println(farmacie);
	}
}
