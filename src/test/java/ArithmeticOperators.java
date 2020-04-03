import org.junit.jupiter.api.Test;

public class ArithmeticOperators {

    @Test
    public void examples() {
        int first = 11;
        int second = 2;

        int additionResult = first + second;
        int numbersAdditionResult = 11 + 2;
        int substractionResult = first - second;
        int multiplicationResult = first * second;

        int divisionResult = first / second;

        double firstDouble = 11;
        double doubleDivisionResult = firstDouble / second;

        float firstFloat = 11;
        double doubleDivisionResultFromFloat = firstFloat / second;

        int modulusResult = first % second;

        first = first + second;
        first += second;

        System.out.println(second);
        System.out.println(second++);  // post-incrementation
        System.out.println(second);
        System.out.println(++second);  // pre-incrementation
        System.out.println(second);
        System.out.println(second--);  // post-decrementation
        System.out.println(second);
        System.out.println(--second);  // pre-decrementation
    }
}
