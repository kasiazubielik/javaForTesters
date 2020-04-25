package ClassObjectsClassFIelds;

public class PlanetarySystem {
    private String starName = "Sun";
    private String starType = "Yellow dwarf";
    private int numberOfPlanets = 8;

    public String getStarName() {
        return starName;
    }

    public void setNumberOfPlanets(int number) {
        numberOfPlanets = number;
    }

    public int getNumberOfPlanets() {
        return numberOfPlanets;
    }

    public void printNumberOfPlanets() {
        System.out.println("Number of planets: " + numberOfPlanets);

    }
}
