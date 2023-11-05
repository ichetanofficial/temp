class Calculator2 {
    int result;

    Calculator2() {
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

class BasicCalculator extends Calculator2 {
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

class ScientificCalculator1 extends Calculator2 {
    void square(int x) {
        result = x * x;
    }

    void cube(int x) {
        result = x * x * x;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        ScientificCalculator1 scientificCalculator = new ScientificCalculator1();

        basicCalculator.add(10, 5);
        System.out.println("Basic Calculator - Addition result: " + basicCalculator.getResult());

        basicCalculator.subtract(10, 5);
        System.out.println("Basic Calculator - Subtraction result: " + basicCalculator.getResult());

        basicCalculator.multiplication(4, 7);
        System.out.println("Basic Calculator - Multiplication result: " + basicCalculator.getResult());

        basicCalculator.division(12, 4);
        System.out.println("Basic Calculator - Division result: " + basicCalculator.getResult());

        scientificCalculator.add(15, 7);
        System.out.println("Scientific Calculator - Addition result: " + scientificCalculator.getResult());

        scientificCalculator.square(5);
        System.out.println("Scientific Calculator - Square result: " + scientificCalculator.getResult());

        scientificCalculator.cube(3);
        System.out.println("Scientific Calculator - Cube result: " + scientificCalculator.getResult());
    }
}
