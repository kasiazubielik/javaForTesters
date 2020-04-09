import org.junit.jupiter.api.Test;

public class Methods {

    @Test
    public void examples() {
        double firstTrapeziumField = calculateTrapeziumField(8, 10, 5);
        double secondTrapeziumField = ((8 + 3) * 5) / 2;
        double thirdTrapeziumField = ((8 + 10) * 6) / 2;

        String text = "Trapezium fields: " + firstTrapeziumField + ", " + secondTrapeziumField + ", " + thirdTrapeziumField;
        boolean ifMoreThan100 = moreThan100(88);
        printText(text);
        printText("End of test");
        printEnd();
    }

    double calculateTrapeziumField(double firstTrapeziumBase, double secondTrapeziumBase, double height) {
        double trapeziumField = ((firstTrapeziumBase + secondTrapeziumBase) * height) / 2;
        return trapeziumField;
    }

    boolean moreThan100(int number) {
        return number > 100;
    }

    void printEnd() {
        System.out.println("End of test");
    }

    void printText(String text) {
        System.out.println(text);
    }
}
