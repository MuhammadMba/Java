import java.util.Scanner;

class Numbers {
    int num1, num2;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
}

class Calculator extends Numbers {

    void add() {
        System.out.println("Addition = " + (num1 + num2));
    }

    void subtract() {
        System.out.println("Subtraction = " + (num1 - num2));
    }

    void multiply() {
        System.out.println("Multiplication = " + (num1 * num2));
    }

    void divide() {
        System.out.println("Division = " + (num1 / num2));
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.input();
        c.add();
        c.subtract();
        c.multiply();
        c.divide();
    }
}