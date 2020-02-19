package hu.me.krz.haladojava;

import java.util.Random;
import java.util.Scanner;

public class Proba {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Példányok száma: ");
		int db = 0;

		try {
			db = sc.nextInt();
		} catch (Exception ex) {
			System.err.println("Hiba: " + ex.getMessage());
			System.exit(-20);
		}

		sc.close();

		Valogato[] szemelyek = new Valogato[db];

		for (int i = 0; i < szemelyek.length; i++) {
			String nev = "diák" + (i + 1);
			Random randomSzam = new Random();
			int eletkor = randomSzam.nextInt(80 - 16 + 1) + 16;

			if (eletkor % 2 == 0) {
				int puska = randomSzam.nextInt(6 - 0) % 6;
				szemelyek[i] = new Diak(nev, eletkor, puska);
			} else {
				double vizsgajegyavg = randomSzam.nextDouble() * 5;
				szemelyek[i] = new Tanar(nev, eletkor, vizsgajegyavg);
			}

		}

		for (Valogato d : szemelyek) {
			if (d.joAlanyE()) {
				System.out.print("jó alany: ");
			} else {
				System.out.print("nem jó alany: ");
			}
			System.out.println(d);
		}

	}
}
