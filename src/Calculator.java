import java.util.Stack;


public class Calculator {
    private final Stack<Float> stack;
    private float result;

    Calculator(String expression) {
        reversePolishNotation rpn = new reversePolishNotation(expression);
        String valid_rpn_expression = rpn.returnRPNString();
        this.stack = new Stack<>();
        String[] split_expr = valid_rpn_expression.split("\\s+");
        countExpression(split_expr);
    }

    private void countExpression(String[] elems) {
        for (String elem : elems) {
            if (elem.equals("+") | elem.equals("-") | elem.equals("/") | elem.equals("*")) {
                float snd = this.stack.pop();
                float fst = this.stack.pop();
                switch(elem) {
                    case "+":
                        this.stack.add(snd + fst);
                        break;
                    case "-":
                        this.stack.add(fst - snd);
                        break;
                    case "*":
                        this.stack.add(fst * snd);
                        break;
                    case "/":
                        this.stack.add(fst / snd);
                        break;
                    default:
                        System.out.println("Everything is ruined now");
                        break;
                }
            }
            else {
                this.stack.add(Float.parseFloat(elem));
            }
        }
        this.result = this.stack.pop();
    }

    public float count() {
        return result;
    }
}
