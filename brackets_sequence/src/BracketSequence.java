import java.util.Stack;


public class BracketSequence {
    private Stack<String> stack;
    private String[] bracketString;

    private boolean isBracketSequenceCorrect(String[] elements) {
        boolean result = false;
        for (String elem: elements) {
            switch (elem) {
                case "{":
                case "(":
                case "[":
                    stack.add(elem);
                    break;
                default:
                    if (stack.isEmpty()) {
                        break;
                    }
                    String elemFromStack = stack.pop();
                    if (elemFromStack.equals("(") & elem.equals(")") |
                            elemFromStack.equals("[") & elem.equals("]") |
                            elemFromStack.equals("{") & elem.equals("}")) {
                        result = true;
                    } else
                        break;
            }
        }
        return result;
    }

    BracketSequence(String brackets) {
        stack = new Stack<>();
        bracketString = brackets.split("");
    }

    public boolean isCorrect() {
        return isBracketSequenceCorrect(bracketString);
    }
}
