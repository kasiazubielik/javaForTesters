import org.junit.jupiter.api.Test;

public class RelationalAndLogicalOperators {

    @Test
    public void eamples() {
        int first = 2;
        int second = 4;
        int third = 2;

        boolean condition = first == third;
        boolean condition2 = 2 == 2;
        boolean condition3 = first != third;

        boolean condition4 = first < second;
        boolean condition5 = first > second;
        boolean condition6 = first >= third;

        boolean true1 = true;
        boolean false1 = false;

        boolean condition7 = !true1;
        boolean condition8 = true1 && true1;// conjuction
        boolean condition9 = true1 || false1;

//        boolean a, b;
//
//        Operation     Meaning                       Note
//        ---------     -------                       ----
//        a && b     logical AND                    short-circuiting
//        a || b     logical OR                     short-circuiting
//        a &  b     boolean logical AND            not short-circuiting
//        a |  b     boolean logical OR             not short-circuiting
//        a ^  b     boolean logical exclusive OR
//        !a         logical NOT
//
//        short-circuiting        (x != 0) && (1/x > 1)   SAFE
//        not short-circuiting    (x != 0) &  (1/x > 1)   NOT SAFE
//
//        & <-- verifies both operands
//        && <-- stops evaluating if the first operand evaluates to false since the result will be false
//
//        exprA | exprB <-- this means evaluate exprA then evaluate exprB then do the |.
//        exprA || exprB <-- this means evaluate exprA and only if this is false then evaluate exprB and do the ||.


    }
}
