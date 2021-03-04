import java.util.Scanner;

public class TestBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        BracketSequence sequence = new BracketSequence(input);
        System.out.println("Is the sequence correct? - " + sequence.isCorrect());
    }
}
