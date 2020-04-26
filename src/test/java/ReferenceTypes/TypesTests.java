package ReferenceTypes;

import Construcktors.PlanetarySystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypesTests {

    @Test
    public void doesIntChangeValueTests() {
        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 6;
        Assertions.assertEquals(5, secondInt);
    }

    @Test
    public void doesObjectsChangeValueTest() {
        PlanetarySystem firstSystem = new PlanetarySystem();
        PlanetarySystem secondSystem = firstSystem;
        firstSystem.setNumberOfPlanets(13);
        Assertions.assertEquals(13, secondSystem.getNumberOfPlanets());
        secondSystem.setNumberOfPlanets(3);
        Assertions.assertEquals(3, firstSystem.getNumberOfPlanets());
    }

    @Test
    public void doesStringChangesValueTest() {
        String firstString = "first";
        String secondString = firstString;
        firstString = "chnaged";
        Assertions.assertEquals("first", secondString);
    }
}