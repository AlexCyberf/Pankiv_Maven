package org.example;
public class Main {

    public static int add(int a, int b) { int result = a + b;
        System.out.println(a + " + " + b + " = " + result); return result;
    }

    public static int subtract(int a, int b) { int result = a - b;
        System.out.println(a + " - " + b + " = " + result); return result;
    }

    public static int multiply(int a, int b) { int result = a * b;
        System.out.println(a + " * " + b + " = " + result); return result;
    }

    public static double divide(int a, int b) { if (b == 0) {
        throw new ArithmeticException("Ділення на нуль неможливе.");
    }
        double result = (double) a / b; System.out.println(a + " / " + b + " = " + result); return result;
    }

    public static void main(String[] args) {
        int x = 15;
        int y = 3;

        System.out.println("Результати математичних операцій:"); int sum = add(x, y);
        int difference = subtract(x, y); int product = multiply(x, y); double quotient = divide(x, y);

        System.out.println("Сума: " + sum); System.out.println("Різниця: " + difference); System.out.println("Добуток: " + product); System.out.println("Частка: " + quotient);
    }
}