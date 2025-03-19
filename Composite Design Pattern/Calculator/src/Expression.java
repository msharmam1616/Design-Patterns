public class Expression implements CalculatorSystem{

    CalculatorSystem leftExpression;
    CalculatorSystem rightExpresion;
    Operators operator;

    Expression(CalculatorSystem leftExpression, CalculatorSystem rightExpresion, Operators operator){
        this.leftExpression= leftExpression;
        this.rightExpresion= rightExpresion;
        this.operator= operator;
    }

    @Override
    public int evaluate(){
        return switch (operator) {
            case Operators.ADD -> leftExpression.evaluate() + rightExpresion.evaluate();
            case Operators.MULTIPLY -> leftExpression.evaluate() * rightExpresion.evaluate();
            case Operators.SUBTRACT -> leftExpression.evaluate() - rightExpresion.evaluate();
            case Operators.DIVIDE -> rightExpresion.evaluate() / leftExpression.evaluate();
        };
    }
}
