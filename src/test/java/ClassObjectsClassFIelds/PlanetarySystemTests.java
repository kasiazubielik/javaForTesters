package ClassObjectsClassFIelds;

import org.junit.jupiter.api.Test;

public class PlanetarySystemTests {

    @Test
    public void firstTest() {
        PlanetarySystem solarSystem = new PlanetarySystem();
        System.out.println("Star name is: " + solarSystem.getStarName());
        solarSystem.printNumberOfPlanets();
        solarSystem.setNumberOfPlanets(7);
        solarSystem.printNumberOfPlanets();

        PlanetarySystem anotherSystem = new PlanetarySystem();
        anotherSystem.printNumberOfPlanets();
        anotherSystem.setNumberOfPlanets(5);
        anotherSystem.printNumberOfPlanets();
    }
}
