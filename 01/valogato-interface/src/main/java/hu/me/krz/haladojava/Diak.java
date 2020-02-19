package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato<Tanar> {
	private int db;

	public Diak(String nev, int eletkor, int db) {
		super(nev, eletkor);
		this.db = db;

	}

	public boolean joAlanyE() {
		if (this.db == 0) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Diák: név " + getNev() + ", életkor " + getEletkor() + ", puskák száma " + db + ".";

	}
}
