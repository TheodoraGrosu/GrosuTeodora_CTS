package cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;
import cts.clase.Student;

public class ReaderStudent extends ReaderAplicant{

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
			super.readAplicant(student, input);
			student.setAn_studii( input.nextInt());
			student.setFacultate( (input.next()).toString());
			studenti.add(student);
		}
		input.close();
		return studenti;
	}

}
