package cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare;
	
	public static int getSumaFinantare() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumiriProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumiriProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctajObtinut + ", Nr_proiecte=" + nrProiecte + ", Denumiri proiecte="
				+ Arrays.toString(denumiriProiecte) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	public void AfisareSumaFinantare() {
		super.AfisareSumaFinantare("Angajatul " , sumaFinantare);
	}
	
}
