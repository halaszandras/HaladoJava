package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato<Tanar> {
	private double avg;

	public Tanar(String name, int age, double avg) {
		super(name, age);
		this.avg = avg;
	}

	public boolean joAlanyE() {
		if (this.avg > 4 && this.getEletkor() < 30) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Tanár: név " + getNev() + ", életkor " + getNev() + ", adott jegyek átlaga " + avg + ".";
	}
}
