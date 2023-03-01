package via.ads1;

import via.ads1.model.Token;

import java.util.ArrayList;

public interface PostfixExpressionCalculatorAPI {
    int evaluateExpression(ArrayList<Token> tokensList);
}
