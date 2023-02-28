package cts.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;

import cts.clase.Aplicant;

public abstract class ReaderAplicant {
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;

}
