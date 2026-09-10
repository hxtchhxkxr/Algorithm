import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (o == '+') {
            add(a, c);
        }
        else if (o == '-') {
            subtract(a, c);
        }
        else if (o == '*') {
            multiply(a, c);
        }
        else if (o == '/') {
            divide(a, c);
        }
        else {
            System.out.print("False");
        }
    }

    private static void add(int a, int b) {
        System.out.print(a + " + " + b + " = " + (a + b));
    }

    private static void subtract(int a, int b) {
        System.out.print(a + " - " + b + " = " + (a - b));
    }

    private static void multiply(int a, int b) {
        System.out.print(a + " * " + b + " = " + (a * b));
    }

    private static void divide(int a, int b) {
        System.out.print(a + " / " + b + " = " + (a / b));
    }
}