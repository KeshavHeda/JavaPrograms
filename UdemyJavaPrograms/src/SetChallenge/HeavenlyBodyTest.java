package SetChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyTest {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody planet1 = new Planet("Mercury", 88);
        planets.add(planet1);
        solarSystem.put(planet1.getName(), planet1);

        HeavenlyBody planet2 = new Planet("Venus", 225);
        planets.add(planet2);
        solarSystem.put(planet2.getName(), planet2);

        HeavenlyBody planet3 = new Planet("Earth", 365);
        planets.add(planet3);
        solarSystem.put(planet3.getName(), planet3);

        HeavenlyBody earthMoon = new Moon("Moon", 27);
        planet3.addSatellite(earthMoon);
        solarSystem.put(earthMoon.getName(), earthMoon);

        HeavenlyBody planet4 = new Planet("Mars", 687);
        planets.add(planet4);
        solarSystem.put(planet4.getName(), planet4);

        HeavenlyBody marsMoon = new Moon("Deimos", 1.3);
        planet4.addSatellite(marsMoon);
        solarSystem.put(marsMoon.getName(), marsMoon);

        marsMoon = new Moon("Phobos", 0.3);
        planet4.addSatellite(marsMoon);
        solarSystem.put(marsMoon.getName(), marsMoon);

        HeavenlyBody planet5 = new Planet("Jupiter", 4332);
        planets.add(planet5);
        solarSystem.put(planet5.getName(), planet5);

        HeavenlyBody jupiterMoon = new Moon("Io", 1.8);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        jupiterMoon = new Moon("Europa", 3.5);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        jupiterMoon = new Moon("Ganymede", 7.1);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        jupiterMoon = new Moon("Callisto", 16.7);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        HeavenlyBody planet6 = new Planet("Saturn", 10759);
        planets.add(planet6);
        solarSystem.put(planet6.getName(), planet6);

        HeavenlyBody planet7 = new Planet("Uranus", 30660);
        planets.add(planet7);
        solarSystem.put(planet7.getName(), planet7);

        HeavenlyBody planet8 = new Planet("Neptune", 165);
        planets.add(planet8);
        solarSystem.put(planet8.getName(), planet8);

        HeavenlyBody planet9 = new Planet("Pluto", 248);
        planets.add(planet9);
        solarSystem.put(planet9.getName(), planet9);

        System.out.println("Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet);
        }

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody loopJupiterMoon : body.getSatellites()) {
            System.out.println("\t" + loopJupiterMoon);
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody loopMoon: moons){
            System.out.println("\t" + loopMoon.getName());
        }

        HeavenlyBody planetPluto = new DwarfPlanet("Pluto", 842);
        planets.add(planetPluto);

        System.out.println("Planets with duplicates");
        for(HeavenlyBody planet: planets) {
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("EARTH", 365);
        HeavenlyBody earth2 = new Planet("EARTH", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(planetPluto));
        System.out.println(planetPluto.equals(earth1));

    }

}
