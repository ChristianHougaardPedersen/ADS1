import org.junit.jupiter.api.Test;
import via.ads1.PostfixExpressionCalculatorAPI;
import via.ads1.PostfixExpressionCalculatorImpl;
import via.ads1.model.Operand;
import via.ads1.model.Operator;
import via.ads1.model.Token;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PostfixExpressionCalculatorTest {
    private PostfixExpressionCalculatorAPI calculator;
    private ArrayList<Token> expression;

    @org.junit.jupiter.api.BeforeEach void setUp()
    {
        expression = new ArrayList<>();
        calculator = new PostfixExpressionCalculatorImpl();

        System.out.println("\t<STARTING NEW TEST>");
    }

    @org.junit.jupiter.api.AfterEach void tearDown()
    {
        System.out.println("\t<END OF CURRENT TEST>");
    }

    // Zero
    @Test public void zeroArguments()
    {
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression(expression));
    }

    // One
    @Test public void oneSetOfArguments() {
        expression.add(new Operand(11));
        expression.add(new Operand(23));
        expression.add(new Operator('+'));

        assertEquals(34, calculator.evaluateExpression(expression));
    }


    // Many
    @Test public void multipleSetsOfArguments() {
        expression.add(new Operand(150));
        expression.add(new Operand(350));
        expression.add(new Operator('+'));
        expression.add(new Operand(5));
        expression.add(new Operator('/'));
        expression.add(new Operand(10));
        expression.add(new Operator('*'));
        expression.add(new Operand(7));
        expression.add(new Operator('-'));

        assertEquals(993, calculator.evaluateExpression(expression));
    }

    // Boundary
    @Test public void highestIntValue() {
        expression.add(new Operand( Integer.MAX_VALUE-1));
        expression.add(new Operand(1));
        expression.add(new Operator('+'));

        assertEquals(Integer.MAX_VALUE, calculator.evaluateExpression(expression));
    }

    @Test public void lowestIntValue() {
        expression.add(new Operand( Integer.MIN_VALUE+1));
        expression.add(new Operand(1));
        expression.add(new Operator('-'));

        assertEquals(Integer.MIN_VALUE, calculator.evaluateExpression(expression));
    }

    // Exceptions
    @Test public void noOperators()
    {
        expression.add(new Operand(4));
        expression.add(new Operand(3));

        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression(expression));
    }

    @Test public void noOperands()
    {
        expression.add(new Operator('+'));
        expression.add(new Operator('-'));

        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression(expression));
    }
}
