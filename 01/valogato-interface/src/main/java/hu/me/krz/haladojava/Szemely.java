package hu.me.krz.haladojava;

public class Szemely {
	private String name;
	private int age;

	public Szemely(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Személy: név " + name + ", életkor " + age;
	}
}
