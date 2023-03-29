package com.tekion.solarSystem;

import java.util.*;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 224);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

//        System.out.println("Planets : ");
//        for (HeavenlyBody planet : planets) {
//            System.out.println(planet.getName());
//        }
//
//        System.out.println("Satellites of " + temp.getName() + " :");
//        for(HeavenlyBody moon: temp.getSatellites()) {
//            System.out.println(moon.getName());
//        }

        Set<HeavenlyBody> moons = new HashSet<>();

        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All Moons : ");
        for(HeavenlyBody moon: moons) {
            System.out.println(moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        HeavenlyBody pluto2 = new HeavenlyBody("Pluto", 842);
        planets.add(pluto2);
        planets.add(pluto);

        for(HeavenlyBody planet: planets) {
            System.out.println(planet.getName());
        }



    }
}
