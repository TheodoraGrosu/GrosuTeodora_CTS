package cts.singleton.registru;

public class Firma {
	private String nume;
	private int nrAngajati;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrAngajati() {
		return nrAngajati;
	}
	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
	protected Firma(String nume, int nrAngajati) {  //daca il fac protected are acces si main ul la el asa ca punem main-ul intr un alt pachet
		super();
		this.nume = nume;
		this.nrAngajati = nrAngajati;
	}
	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", nrAngajati=" + nrAngajati + "]";
	}
	
	
	public void angajeaza() {
		this.nrAngajati++ ;
	}
	
}
