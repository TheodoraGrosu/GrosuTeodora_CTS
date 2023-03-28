package builder.main;

import builder.clase.Pacient;
import builder.clase.PacientBuilder;

public class Program {
	public static void main(String[] args) {
		
		//Varianta 1
//		PacientBuilder pacientBuilder = new PacientBuilder();
//		Pacient pacient = pacientBuilder.setNume("Ion").setMicDejunInclus(true).setPapuciCamera(true).build();
//		Pacient pacientNou = new PacientBuilder().setNume("Maria").build();
//		System.out.println(pacient.toString());
//		System.out.println(pacientNou.toString());
		
		//Varianta 2 -> numele pacientului se da in pacientBuilder
		PacientBuilder pacientBuilder = new PacientBuilder("Ion");
		Pacient pacient = pacientBuilder.setMicDejunInclus(true).setPapuciCamera(true).build();
		Pacient pacientNou = new PacientBuilder("Maria").build();
		Pacient pacientNou2 = new PacientBuilder("Vasile").setMicDejunInclus(true).setMicDejunInclus(true).build();
		//nu se mai permite modificarea numelui
//		Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).setNume("Ana").build();	
		System.out.println(pacient);
//		System.out.println(pacient3);
		
		
	}
}
