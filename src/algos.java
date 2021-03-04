import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Calculator calculator = new Calculator(input);
        System.out.println("The result is: " + calculator.count());

    }

}