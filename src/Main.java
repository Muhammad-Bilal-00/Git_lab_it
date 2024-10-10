import java.util.Scanner;

class Calculator {
    private int n1;
    private int n2;
    int result;

    int add(int n1, int n2) {
        return n1 + n2;
    }

    int mult(int n1, int n2) {
        return n1 * n2;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your first number:");
        int n1 = input.nextInt();


        System.out.println("Enter your second number:");
        int n2 = input.nextInt();
        int additionResult = cal.add(n1, n2);
        int multiplicationResult = cal.mult(n1, n2);
        System.out.println("Addition Result: " + additionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        input.close();
    }
}
