import org.junit.jupiter.api.Test;

public class variables {

    @Test
    public void examples() {
        byte number;
        number = 8;

        int intNumber = 21;
        long longNumber = 1234567L;

        float floatNumber = 123.67F;
        double doubleNumber = 123456.45;

        boolean isTrue = false;

        char letterA = 'a';
        char alsoLetterA = '\u0061';

        System.out.println(letterA);
        System.out.println(alsoLetterA);

        String text = "My favorite book is \"Cosmos\"";
        System.out.println(text);
    }

}
