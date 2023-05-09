package template.clase;

public class MasaLocal extends OcupareMasa{

	public MasaLocal(int nrMasa) {
		super(nrMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		System.out.println("Chelnerul curata masa pentru persoanele care asteapta la usa " + super.getNrMasa());
		
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Chelnerul aseaza servetelele pe masa " + super.getNrMasa() + " persoanele asteapta la usa");
		
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Chelnerul aseaza tacamurile pe masa " + super.getNrMasa() + " persoanele asteapta la usa");
	}

	@Override
	public void asezarePersoane() {
		System.out.println("Chelnerul invita persoanele la masa " + super.getNrMasa());
		
	}

	

}
