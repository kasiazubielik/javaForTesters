import org.junit.jupiter.api.Test;

public class ConditionalStatements {

    @Test
    public void ifExample() {
        int number = 100;

        if(number > 100) {
            System.out.println("Number " + number + " is greater than 100.");
            number++;
        }
        else if(number >= 0 && number <= 100) {
            System.out.println("Number " + number + " is greater than or equal 0 and less than or equal 100.");
            if(number == 100) {
                System.out.println("Number " + number + " is equal 100.");
            }
            number = 100;
        }
        else {
            System.out.println("Number " + number + " is negative.");
        }
        System.out.println("End of test. Number is " + number);
    }

    @Test
    public void switchExample() {
        int number = 4;

        switch (number) {
            case 0:
                System.out.println("Number is equal 0");
                break;
            case 1:
                System.out.println("Number is equal 1");
                break;
            case 2:
                System.out.println("Number is equal 2");
                break;
            default:
                System.out.println("Number " + number + " is not valid");
        }
    }

}
