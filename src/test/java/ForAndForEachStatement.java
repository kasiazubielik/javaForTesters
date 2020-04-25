import org.junit.jupiter.api.Test;

public class ForAndForEachStatement {

    @Test
    public void whileExample() {
        int factorial5 = 1 * 2 * 3 * 4 * 5;
        int factorial1 = 1;
        int factorial0 = 1;

        int factorial6 = countFactorial(6);
    }


    private int countFactorial(int number) {
        int factorial = 1;

        if (number > 1) {
            for (int i = 2; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    @Test
    public void forEachExample() {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        String text = "Planets of Solar System are: ";

        for (String planet:planets) {
            text = text + "\n" + planet;
        }
        System.out.println(text);
    }
}
