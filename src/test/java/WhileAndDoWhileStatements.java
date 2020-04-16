import org.junit.jupiter.api.Test;

import java.util.Random;

public class WhileAndDoWhileStatements {

    @Test
    public void whileExample() {
        int factorial5 = 1 * 2 * 3 * 4 * 5;
        int factorial1 = 1;
        int factorial0 = 1;

        int factorial6 = countFactorialWhile(6);
        int afctorial6 = countFactorialDoWhile(6);

        isThatMyNumber(4);


    }

    private int countFactorialWhile(int number) {
        int i = 2;
        int factorial = 1;

        if (number > 1) {
            while (i <= number) {
                factorial = factorial * i;
                i++;

            }
        }
        return factorial;
    }

    private int countFactorialDoWhile(int number) {
        int i = 2;
        int factorial = 1;

        if (number > 1) {
            do {
                factorial = factorial * i;
                i++;
            }
            while (i <= number);
        }
        return factorial;
    }

    private void isThatMyNumber (int number){
        int counter = 0;
        Random generator = new Random();

        while (generator.nextInt(5) != number) {
            System.out.println("Number is not equal " + number);
            counter++;
        }
        System.out.println("My number was drawn! Loop has done " + counter + " times.");
    }

}
