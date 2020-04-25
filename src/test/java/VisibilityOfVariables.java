import org.junit.jupiter.api.Test;

public class VisibilityOfVariables {
    int number1 = 5;
    int number2 = 4;
    int sum = number1 + number2;
    int number3;

    @Test
    public void writeNumber() {
        number3 = 7;
        number1 = 3;
        int numberInMethod = 2;

        for (int i = 0; i < 10; i++) {
            System.out.println("Varible numbe1 equals: " + number1 + ". Value i equals: " + i);
            int localSum = number1 + i;
            System.out.println("Sum equals: " + localSum);
            if (i >= 5) {
                String statement = "i queals or is greater than 5.";
                System.out.println(statement);
            }
        }
    }
}
