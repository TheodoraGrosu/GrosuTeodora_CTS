package factory_method.program;

import java.util.ArrayList;
import java.util.List;

import factory_method.clase.Factory;
import factory_method.clase.FactoryAsistent;
import factory_method.clase.FactoryInfirmier;
import factory_method.clase.FactoryMedic;
import factory_method.clase.Infirmier;
import factory_method.clase.PersonalSpital;



public class Program {
	public static void main(String[] args) {
		Factory factoryAsistent = new FactoryAsistent();
		Factory factoryMedici = new FactoryMedic();
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(factoryAsistent.createPersonal("Gigel"));
		listaPersonal.add(factoryMedici.createPersonal("Eugen"));
		listaPersonal.add(factoryAsistent.createPersonal("Cristi"));
			
		Factory factoryInfirmier = new FactoryInfirmier();
		Infirmier infirmier = (Infirmier)factoryInfirmier.createPersonal("Silviu");
		infirmier.setAniVechime(14);
		listaPersonal.add(infirmier);
		for(PersonalSpital personal : listaPersonal) {
			personal.descriere();
		}
	}
}
