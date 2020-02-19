package hu.me.krz.haladojava;

public class Tanulo {
	private final String nev;
	private int penz;
	private int tanulok = 0;

	public int osszestanulo() {
		return tanulok;
	}

	public int penz() {
		return penz;
	}

	public Tanulo(String nev, int penz) {
		this.nev = nev;
		this.penz = penz;
		tanulok++;
	}

	public Tanulo(String name) {
		this(name, 10000);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		tanulok--;
	}

	@Override
	public String toString() {
		return "Tanuló: " + nev + ", " + penz + " Ft; ";
	}

	public boolean fogyasztas(int adossag) {
		this.penz -= adossag;

		if (penz <= 0) {
			return true;
		} else
			return false;
	}
}
