import java.util.Scanner;

class Calculator {
    private int n1, n2, result;

    int add(int n1, int n2) {
        return n1 + n2;
    }

    int sub(int n1, int n2) {
        return n1 - n2;
    }

    int mult(int n1, int n2) {
        return n1 * n2;
    }

    int div(int n1, int n2)
    {
        return n1/n2;
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

        System.out.println("Addition Result: " + cal.add(n1, n2));
        System.out.println("Subtraction: " + cal.sub(n1, n2));
        System.out.println("Multiplication Result: " + cal.mult(n1, n2));
        System.out.println("Division Result: " + cal.div(n1, n2));
        input.close();
    }
}
