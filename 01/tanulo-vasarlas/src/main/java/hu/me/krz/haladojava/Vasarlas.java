package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Vasarlas {
	public static void main(String[] args) {

		List<Tanulo> tanulok = new ArrayList<>(Arrays.asList(new Tanulo("Halász Balázs"), new Tanulo("Kalász Tamás"),
				new Tanulo("Vadász András"), new Tanulo("József Béla"), new Tanulo("Madarász Attila")));

		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int sumPenz = 0;

			for (int j = 0; j < tanulok.size(); j++) {

				if(tanulok.get(j).fogyasztas(r.nextInt((3000 - 1500) + 1) + 1500)) {
					tanulok.remove(tanulok.get(j));
				}
			}

			System.out.println("Tanulók száma: " + tanulok.size());

			for (Tanulo tanulo : tanulok) {
				sumPenz += tanulo.penz();
			}
			System.out.println("Átlag vagyon: " + sumPenz / tanulok.size() + " Ft");

			for (Tanulo tanulo : tanulok) {
				System.out.println(tanulo.toString());
			}
		}
	}
}
