package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Astronomer {

	private final String name;
	private final List<Planet> discoveredPlanets;

	public Astronomer(String name, List<Planet> discoveredPlanets) {
		this.name = name;
		this.discoveredPlanets = new ArrayList<>();
		this.discoveredPlanets.addAll(discoveredPlanets);
	}

	public String getName() {
		return name;
	}

	public List<Planet> getDiscoveredPlanets() {
		return discoveredPlanets;
	}

	public void observeTheSky() {

		Random r = new Random();

		for (int i = 0; i < 10; i++) {

			double radius = r.nextDouble() * 1000;
			String nameHelper = name + " " + (i + 1);
			Point pointHelper = new Point(0, 0, 0);
			Point t = new Point(((i + 1) + 10), 0, 0);
			pointHelper.translate(t);

			discoveredPlanets.add(new Planet(pointHelper, radius, nameHelper));

		}
	}
}
