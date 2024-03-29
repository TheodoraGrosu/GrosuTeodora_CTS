package cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantare;
	
	
	
	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int getClasa() {
		return clasa;
	}
	
	public void setClasa(int i) {
		this.clasa = i;
	}
	
	public String getTutore() {
		return tutore;
	}
	
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	public void AfisareSumaFinantare() {
		super.AfisareSumaFinantare("Elevul ", sumaFinantare);
	}
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctajObtinut + ", Nr_proiecte=" + nrProiecte  + ", DenumireProiect="
				+ Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	
}

