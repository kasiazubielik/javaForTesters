import org.junit.jupiter.api.Test;

public class Arrays {

    @Test
    public void examples() {
        String[] planets = new String[8];

        planets[0] = "Mercury";
        planets[1] = "Venus";

        String firstPlanet = planets[0];
    }

    @Test
    public void examples2() {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        String forthPlanet = planets[3];
    }

    @Test
    public void examples3() {
        int[][] planetaryDiameter = new int[8][2];

        planetaryDiameter[0][0] = 1;
        planetaryDiameter[0][1] = 4879;
        planetaryDiameter[1][0] = 2;
        planetaryDiameter[1][1] = 12104;
    }

    @Test
    public void examples4() {
        int[][] planetaryDiameter = {{1, 4879}, {2, 12104}, {3, 12756}, {4, 6805}, {5, 142984}, {6, 120536}, {7, 51118}, {8, 49528}};
    }
}
