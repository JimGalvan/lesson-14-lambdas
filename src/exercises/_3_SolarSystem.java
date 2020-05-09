package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _3_SolarSystem {

	public static void main(String[] args) {
		List<Planet> planets = Arrays.asList(
				new Planet("Mercury", 57, 0.056, 0),
				new Planet("Venus", 108, 0.866, 0),
				new Planet("Jupiter", 779, 1321, 79),
				new Planet("Mars", 228, 0.151, 2),
				new Planet("Earth", 150, 1, 1),
				new Planet("Saturn", 1430, 763.59, 62)
				);

		// 1: Sort the planets by distance from the sun
		
		Collections.sort(planets, (Planet o1, Planet o2) -> o1.getDistanceFromSun() - o2.getDistanceFromSun());
		System.out.println(planets + "\n");
	
		// 2. Sort the planets in alphabetical order
		
		planets.sort((Planet o1, Planet o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(planets + "\n");

		// 3. Sort planets from largest to smallest	
		
		planets.sort((Planet o1, Planet o2) -> Double.compare(o1.getVolume(), o2.getVolume()));

		System.out.println(planets + "\n");

	}	
}

