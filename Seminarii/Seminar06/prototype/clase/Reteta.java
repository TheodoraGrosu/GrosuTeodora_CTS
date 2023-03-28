package prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
	private String nume;
	private Map<String, Float> solutii = new HashMap<>(); 
	private float gramaj;
	
	public Reteta(String nume, Map<String, Float> solutii, float gramaj) {
		super();
		this.nume = nume;
		this.solutii = solutii;
		float suma =  0;
		for(float solutie : solutii.values()) {
			suma += solutie;
		}
		if(suma ==  gramaj) {
			this.gramaj = gramaj;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	

	
	private Reteta() {
		super();
		this.nume = "NotApplicable";
		this.gramaj = 0;
		this.solutii = null;
	}




	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Map<String, Float> getSolutii() {
		return solutii;
	}

	public void setSolutii(Map<String, Float> solutii) {
		Map<String, Float> solutiiCopie = new HashMap<>();
		for(String key : solutii.keySet()) {
			solutiiCopie.put(key, solutii.get(key));
		}
		this.solutii = solutiiCopie;	
	}

	public float getGramaj() {
		return gramaj;
	}

	public void setGramaj(float gramaj) {
		this.gramaj = gramaj;
	}


	@Override
	public IReteta copiaza() {
		Reteta retetaNoua = new Reteta();
		retetaNoua.setNume(nume);
		retetaNoua.setGramaj(gramaj);
		retetaNoua.setSolutii(solutii);
		return retetaNoua;
	}

	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", solutii=" + solutii + ", gramaj=" + gramaj + "]";
	}
	
	

}
