package cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;
import cts.clase.Elev;

public class ReaderElev extends ReaderAplicant{

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(elev, input2);
			elev.setClasa(input2.nextInt());
			elev.setTutore(input2.next());
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}

}
