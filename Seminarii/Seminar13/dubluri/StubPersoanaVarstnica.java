package dubluri;

import clase.IPersoana;

public class StubPersoanaVarstnica implements IPersoana{

	@Override
	public String getSex() {
		return null;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

}
