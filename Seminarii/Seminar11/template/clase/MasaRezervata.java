package template.clase;

public class MasaRezervata extends OcupareMasa{

	private String oraRezervare;
	
	
	
	public MasaRezervata(int nrMasa, String oraRezervare) {
		super(nrMasa);
		// TODO Auto-generated constructor stub
		this.oraRezervare = oraRezervare;
	}

	@Override
	public void curataMasa() {
		System.out.println("Se curata masa cu numarul " + super.getNrMasa() + " pentru persoanele care au rezervare la " + this.oraRezervare);
		
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Pune servetele " + super.getNrMasa() + " pentru rezervarea de la ora " + this.oraRezervare);
		
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Se pun tacamuri pentru masa " + super.getNrMasa() + " pentru rezervarea de la ora " + this.oraRezervare);
	}

	@Override
	public void asezarePersoane() {
		System.out.println("Se invita la masa " + super.getNrMasa() + " persoanele care au rezervarea la ora " + this.oraRezervare);
		
	}
	

}
