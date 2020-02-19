package hu.me.krz.haladojava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Proba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diák osztály példányainak száma: ");
		
		int db = 0;

		try {
			db = sc.nextInt();

		} catch (Exception e) {
			System.err.println("Hiba: " + e.getMessage());
			System.exit(-1);
		}

		sc.close();

		Diak[] diakok = new Diak[db];


		for (int i = 0; i < diakok.length; i++) {
			String name;
			if (i<10) {
				name = "diák0" + (i + 1);
				
			}else {
				name = "diák" + (i + 1);
			}
			Random r = new Random();
			int age = r.nextInt(25 - 18 + 1) + 18;
			int puska = r.nextInt(6 - 0) % 6;
			diakok[i] = new Diak(name, age, puska);
		}

		Arrays.sort(diakok);

		for (Diak a : diakok) {
			System.out.println(a);
		}

	}

}
