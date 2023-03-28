package builder.clase;

public class PacientBuilder implements Builder{
	private Pacient pacient;

	public PacientBuilder(String nume) {
		this.pacient = new Pacient();
		this.pacient.setNume(nume);
	}

	@Override
	public Pacient build() {
		return this.pacient;
	}
	
	
//	public PacientBuilder setNume(String nume) {
//		this.pacient.setNume(nume);
//		return this;
//	}
	
	public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}
	
	public PacientBuilder setMicDejunInclus(Boolean micDejun)
	{
		this.pacient.setMicDejunInclus(micDejun);
		return this;
	}
	
	public PacientBuilder setPapuciCamera(Boolean papuciCamera) {
		this.pacient.setPapuciDeCamera(papuciCamera);
		return this;
	}
	
	
	
}
