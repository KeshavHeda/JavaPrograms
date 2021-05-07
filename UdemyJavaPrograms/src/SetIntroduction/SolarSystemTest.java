package SetIntroduction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolarSystemTest {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody planet1 = new HeavenlyBody("Mercury", 88);
        planets.add(planet1);
        solarSystem.put(planet1.getName(), planet1);

        HeavenlyBody planet2 = new HeavenlyBody("Venus", 225);
        planets.add(planet2);
        solarSystem.put(planet2.getName(), planet2);

        HeavenlyBody planet3 = new HeavenlyBody("Earth", 365);
        planets.add(planet3);
        solarSystem.put(planet3.getName(), planet3);

        HeavenlyBody earthMoon = new HeavenlyBody("Moon", 27);
        planet3.addMoon(earthMoon);
        solarSystem.put(earthMoon.getName(), earthMoon);

        HeavenlyBody planet4 = new HeavenlyBody("Mars", 687);
        planets.add(planet4);
        solarSystem.put(planet4.getName(), planet4);

        HeavenlyBody marsMoon = new HeavenlyBody("Deimos", 1.3);
        planet4.addMoon(marsMoon);
        solarSystem.put(marsMoon.getName(), marsMoon);

        marsMoon = new HeavenlyBody("Phobos", 0.3);
        planet4.addMoon(marsMoon);
        solarSystem.put(marsMoon.getName(), marsMoon);

        HeavenlyBody planet5 = new HeavenlyBody("Jupiter", 4332);
        planets.add(planet5);
        solarSystem.put(planet5.getName(), planet5);

        HeavenlyBody jupiterMoon = new HeavenlyBody("Io", 1.8);
        planet5.addMoon(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        jupiterMoon = new HeavenlyBody("Europa", 3.5);
        planet5.addMoon(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        jupiterMoon = new HeavenlyBody("Ganymede", 7.1);
        planet5.addMoon(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        jupiterMoon = new HeavenlyBody("Callisto", 16.7);
        planet5.addMoon(jupiterMoon);
        solarSystem.put(jupiterMoon.getName(), jupiterMoon);

        HeavenlyBody planet6 = new HeavenlyBody("Saturn", 10759);
        planets.add(planet6);
        solarSystem.put(planet6.getName(), planet6);

        HeavenlyBody planet7 = new HeavenlyBody("Uranus", 30660);
        planets.add(planet7);
        solarSystem.put(planet7.getName(), planet7);

        HeavenlyBody planet8 = new HeavenlyBody("Neptune", 165);
        planets.add(planet8);
        solarSystem.put(planet8.getName(), planet8);

        HeavenlyBody planet9 = new HeavenlyBody("Pluto", 248);
        planets.add(planet9);
        solarSystem.put(planet9.getName(), planet9);

        System.out.println("Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody loopJupiterMoon : body.getSatellites()) {
            System.out.println("\t" + loopJupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody loopMoon: moons){
            System.out.println("\t" + loopMoon.getName());
        }

        HeavenlyBody planetPluto = new HeavenlyBody("Pluto", 842);
        planets.add(planetPluto);

        System.out.println("Planets with duplicates");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName() + ": " + planet.getOrbitalPeriod());
        }

    }

}
