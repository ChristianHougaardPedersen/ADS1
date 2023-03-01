package via.ads1;

import via.ads1.model.Operand;
import via.ads1.model.Operator;
import via.ads1.model.Token;
import via.ads1.model.impl.StackImpl;

import java.util.ArrayList;

public class PostfixExpressionCalculatorImpl implements PostfixExpressionCalculatorAPI {

    private final StackImpl<Token> stack = new StackImpl<>();

    private Operand calculate(Operand op1, Operand op2, Operator operator) {
        switch (operator.getValue()) {
            case '+' -> {
                return new Operand(op2.getValue() + op1.getValue());
            }
            case '-' -> {
                return new Operand(op2.getValue() - op1.getValue());
            }
            case '*' -> {
                return new Operand(op2.getValue() * op1.getValue());
            }
            case '/' -> {
                return new Operand(op2.getValue() / op1.getValue());
            }
            default -> {
                return null;
            }
        }
    }

    private int getResult() {
        Operand result = (Operand) stack.pop();
        return result.getValue();
    }

    @Override
    public int evaluateExpression(ArrayList<Token> tokensList) {

        try {
            while (!tokensList.isEmpty()) {
                Token token = tokensList.remove(0);

                while (token instanceof Operand) {
                    stack.push(token);
                    token = tokensList.remove(0);
                }

                stack.push(calculate((Operand) stack.pop(), (Operand) stack.pop(), (Operator) token));
            }

            return getResult();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Invalid expression.");
        }
    }
}
