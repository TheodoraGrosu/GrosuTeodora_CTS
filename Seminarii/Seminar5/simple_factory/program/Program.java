package simple_factory.program;

import java.util.ArrayList;
import java.util.List;

import simple_factory.clase.Factory;
import simple_factory.clase.PersonalSpital;
import simple_factory.clase.TipPersonalSpital;

public class Program {
	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.ASISTENT, "Vasile");
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.MEDIC, "Georgescu");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.BRANCARDIER, "Ionel");
		medic.descrie();
		asistent.descrie();
		brancardier.descrie();
			
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(asistent);
		listaPersonal.add(medic);
		listaPersonal.add(brancardier);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Dan"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER, "Popescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Liviu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Alex"));
		for(PersonalSpital personal : listaPersonal) {
			personal.descrie();
		}
	}
}
