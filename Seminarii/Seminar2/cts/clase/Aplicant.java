package cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;  //punctajObtinut
	protected int nrProiecte;
	protected String[] denumireProiect;  //denumiriProiecte
	protected static int  pragAcceptare = 80;
	
	public static int getPragAcceptare() {
		return pragAcceptare;
	}
	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void AfisareStatus(){
		System.out.println("Aplicantul "+nume+" "+prenume+ (punctaj > pragAcceptare ? "" : " nu ") + "a fost acceptat");
	}
		
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nrProiecte;
	}
	public void setNr_proiecte(int nr_proiecte, String [] denumireProiect) {
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = new String[this.nrProiecte];
		for(int i = 0; i < this.nrProiecte; i++) {
			this.denumireProiect[i] = denumireProiect[i];
		}
	}
	
	public abstract void AfisareSumaFinantare();
	
	protected void AfisareSumaFinantare(String tipAplicant, int sumaFinantare) {
		System.out.println(tipAplicant +getNume()+" "+getPrenume()+" primeste"+sumaFinantare+" Euro/zi in proiect.");
	}

}
