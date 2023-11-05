class Calculator1 {
    int result;

    Calculator1() {
        result = 0;
    }

    void add(int x, int y) {
        result = x + y;
    }

    void subtract(int x, int y) {
        result = x - y;
    }

    int getResult() {
        return result;
    }
}

class ScientificCalculator extends Calculator1 {
    void square(int x) {
        result = x * x;
    }

    void cube(int x) {
        result = x * x * x;
    }
}

class HybridCalculator extends ScientificCalculator {
    void multiplication(int x, int y) {
        result = x * y;
    }

    void division(int x, int y) {
        if (y != 0) {
            result = x / y;
        } else {
            result = 0;
        }
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        HybridCalculator calculator = new HybridCalculator();

        calculator.add(10, 5);
        System.out.println("Addition result: " + calculator.getResult());

        calculator.subtract(10, 5);
        System.out.println("Subtraction result: " + calculator.getResult());

        calculator.square(5);
        System.out.println("Square result: " + calculator.getResult());

        calculator.cube(3);
        System.out.println("Cube result: " + calculator.getResult());

        calculator.multiplication(4, 7);
        System.out.println("Multiplication result: " + calculator.getResult());

        calculator.division(12, 4);
        System.out.println("Division result: " + calculator.getResult());
    }
}
