package SetChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyTest {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody planet1 = new Planet("Mercury", 88);
        planets.add(planet1);
        solarSystem.put(planet1.getKey(), planet1);

        HeavenlyBody planet2 = new Planet("Venus", 225);
        planets.add(planet2);
        solarSystem.put(planet2.getKey(), planet2);

        HeavenlyBody planet3 = new Planet("Earth", 365);
        planets.add(planet3);
        solarSystem.put(planet3.getKey(), planet3);

        HeavenlyBody earthMoon = new Moon("Moon", 27);
        planet3.addSatellite(earthMoon);
        solarSystem.put(earthMoon.getKey(), earthMoon);

        HeavenlyBody planet4 = new Planet("Mars", 687);
        planets.add(planet4);
        solarSystem.put(planet4.getKey(), planet4);

        HeavenlyBody marsMoon = new Moon("Deimos", 1.3);
        planet4.addSatellite(marsMoon);
        solarSystem.put(marsMoon.getKey(), marsMoon);

        marsMoon = new Moon("Phobos", 0.3);
        planet4.addSatellite(marsMoon);
        solarSystem.put(marsMoon.getKey(), marsMoon);

        HeavenlyBody planet5 = new Planet("Jupiter", 4332);
        planets.add(planet5);
        solarSystem.put(planet5.getKey(), planet5);

        HeavenlyBody jupiterMoon = new Moon("Io", 1.8);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getKey(), jupiterMoon);

        jupiterMoon = new Moon("Europa", 3.5);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getKey(), jupiterMoon);

        jupiterMoon = new Moon("Ganymede", 7.1);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getKey(), jupiterMoon);

        jupiterMoon = new Moon("Callisto", 16.7);
        planet5.addSatellite(jupiterMoon);
        solarSystem.put(jupiterMoon.getKey(), jupiterMoon);

        HeavenlyBody planet6 = new Planet("Saturn", 10759);
        planets.add(planet6);
        solarSystem.put(planet6.getKey(), planet6);

        HeavenlyBody planet7 = new Planet("Uranus", 30660);
        planets.add(planet7);
        solarSystem.put(planet7.getKey(), planet7);

        HeavenlyBody planet8 = new Planet("Neptune", 165);
        planets.add(planet8);
        solarSystem.put(planet8.getKey(), planet8);

        HeavenlyBody planet9 = new Planet("Pluto", 248);
        planets.add(planet9);
        solarSystem.put(planet9.getKey(), planet9);

        System.out.println("Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet);
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for(HeavenlyBody loopJupiterMoon : body.getSatellites()) {
            System.out.println("\t" + loopJupiterMoon);
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody loopMoon: moons){
            System.out.println("\t" + loopMoon.getKey());
        }

        HeavenlyBody planetPluto = new DwarfPlanet("Pluto", 842);
        planets.add(planetPluto);
        solarSystem.put(planetPluto.getKey(), planetPluto);

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

        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("The solar system contains:");
        for(HeavenlyBody heavenlyBody: solarSystem.values()) {
            System.out.println(heavenlyBody);
        }

    }

}
