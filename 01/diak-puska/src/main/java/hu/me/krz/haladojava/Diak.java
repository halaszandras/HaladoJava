package hu.me.krz.haladojava;

public class Diak extends Szemely implements Comparable<Diak> {

	private int puskakSzama;

	public Diak(String name, int age, int puskakSzama) {
		super(name, age);
		this.puskakSzama = puskakSzama;
	}

	public int compareTo(Diak o) {

		if (this.puskakSzama == o.puskakSzama)
			return 0;
		else if (this.puskakSzama > o.puskakSzama)
			return 1;
		else
			return -1;

	}

	@Override
	public String toString() {
		return "Diák: név " + getName() + ", életkor " + getAge() + ", puskák száma " + puskakSzama + ".";
	}
}
