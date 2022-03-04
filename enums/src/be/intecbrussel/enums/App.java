package be.intecbrussel.enums;

import java.util.Random;

// let's have fun with enums!
public class App {
    public static void main(String[] args) {
        //declare a variable called earth
        // initiate a variable so that it points to a random instance of the enum
        Planet planet = getRandomPlanet();

        //print out the planet
        //System.out.println(earth);
        // if the planet is earth
        Planet.EARTH.setRadius(3303);
        System.out.println("The planet we are on is: "+ planet);
        System.out.println("The radius of this planet is: " + planet.getRadius());
        if (planet == Planet.EARTH) {
            System.out.println("We are home.");
        }
        //if the planet is not earth we are trapped in space
        else {
            System.out.println("Help, I'm in space!");
        }

    }

    // selects a random planet from the list of available planets
    private static Planet getRandomPlanet() {
        // gets a list with the available planets
        Planet[] planets = Planet.values();
        //creates a Random object
        Random random = new Random();
        // generates a random number between 0 anbd the length of the planets array
        int randomPlanetIndex = random.nextInt(planets.length);
        // returns the plenet on the generated index
        return planets[randomPlanetIndex];
    }
}