import java.util.*;


public class reversePolishNotation {
    private final Stack<String> stack;
    private final ArrayDeque<String> queue;

    private void parseInput(String input) {
        String[] list = input.split("\\s+");
        for (String elem: list) {
            switch(elem) {
                case "+":
                case "-":
                case "/":
                case "*":
                    queue.add(elem);
                    break;
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    stack.add(elem);
                    break;
                default:
                    break;
            }
        }
    }

    reversePolishNotation(String input) {
        stack = new Stack<>();
        queue = new ArrayDeque<>();
        parseInput(input);
    }

    public final String returnRPNString() {
        StringBuilder result = new StringBuilder("");
        while (stack.size() != 0) {
            result.append(stack.pop()).append(" ");
        }
        while (queue.size() != 0) {
            result.append(queue.pop()).append(" ");
        }
        return result.toString();
    }
}
