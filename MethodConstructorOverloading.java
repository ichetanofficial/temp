class Calculator {
    Calculator() {
        System.out.println("Calculator initialized with default constructor.");
    }
    Calculator(int num1, int num2) {
        System.out.println("Calculator initialized with parameterized constructor.");
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }
    int add(int num1, int num2) {
        return num1 + num2;
    }
    double add(double num1, double num2) {
        return num1 + num2;
    }
    String add(String str1, String str2) {
        return str1 + str2;
    }
}
public class MethodConstructorOverloading {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator(5, 7);
        int sum1 = calculator1.add(3, 4);
        double sum2 = calculator1.add(2.5, 3.5);
        String sum3 = calculator1.add("Hello, ", "World!");
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated string: " + sum3);
    }
}