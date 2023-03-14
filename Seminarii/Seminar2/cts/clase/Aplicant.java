package cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctajObtinut;  
	protected int nrProiecte;
	protected String[] denumiriProiecte; 
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
		System.out.println("Aplicantul "+nume+" "+prenume+ (punctajObtinut > pragAcceptare ? "" : " nu ") + "a fost acceptat");
	}
		
	public int getPunctaj() {
		return punctajObtinut;
	}
	public void setPunctaj(int punctaj) {
		this.punctajObtinut = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctajObtinut = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	public int getNr_proiecte() {
		return nrProiecte;
	}
	public void setNr_proiecte(int nr_proiecte, String [] denumiriProiecte) {
		this.nrProiecte = nr_proiecte;
		this.denumiriProiecte = new String[this.nrProiecte];
		for(int i = 0; i < this.nrProiecte; i++) {
			this.denumiriProiecte[i] = denumiriProiecte[i];
		}
	}
	
	public abstract void AfisareSumaFinantare();
	
	protected void AfisareSumaFinantare(String tipAplicant, int sumaFinantare) {
		System.out.println(tipAplicant +getNume()+" "+getPrenume()+" primeste"+sumaFinantare+" Euro/zi in proiect.");
	}

}
