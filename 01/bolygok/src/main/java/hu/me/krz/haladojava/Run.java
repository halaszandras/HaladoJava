package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		List<Planet> planetList = new ArrayList<>();
		
		Astronomer Galileo = new Astronomer("Galileo", planetList);
		Galileo.observeTheSky();
		
		for (Planet planet : Galileo.getDiscoveredPlanets()) {
			System.out.println(planet.getName() + "    ");
		}
	}

}
