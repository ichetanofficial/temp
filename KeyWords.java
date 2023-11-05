class Parent {
    int parentVar;
    Parent(int parentVar) {
        this.parentVar = parentVar;
    }
    void display() {
        System.out.println("Parent class variable: " + parentVar);
    }
}
class Child extends Parent {
    int childVar;
    Child(int parentVar, int childVar) {
        super(parentVar);
        this.childVar = childVar;
    }
    void display() {
        super.display();
        System.out.println("Child class variable: " + childVar);
    }
    void displayBoth() {
        System.out.println("Through Child class. variable: " + parentVar);
        System.out.println("Child class variable: " + childVar);
    }
}
class ColorPicker{
    static String BLUE= "#0000FF";
    static String RED = "#FF0000";
    static String GREEN = "#008000";
    static void readmeToast() {
        System.out.println("This class is a ColorPicker Class");
    }
    static class StaticNestedClass {
        void display() {
            System.out.println("Static Nested Class");
        }
    }
}
final class PatentedCalculator {
    final String info = "This is Patented Calculator and Can't be Copied";
    final void add(int a, int b) {
        System.out.println("Addition is : " + (a+b));
    }
    final void readme() {
        System.out.println(info);
    }
}
public class KeyWords {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        System.out.println("Using child.display():");
        child.display();
        System.out.println("\nUsing child.displayBoth():");
        child.displayBoth();
        System.out.println("\nStatic Keyword");
        System.out.println("BLUE CODE: " + ColorPicker.BLUE);
        System.out.println("RED CODE: " + ColorPicker.RED);
        System.out.println("GREEN CODE: " + ColorPicker.GREEN);
        ColorPicker.readmeToast();
        ColorPicker.StaticNestedClass nestedObject = new
                ColorPicker.StaticNestedClass();
        nestedObject.display();
        System.out.println("\nFinal Keyword");
        PatentedCalculator patentedCalculator = new PatentedCalculator();
        patentedCalculator.readme();
        patentedCalculator.add(100,200);
    }
}
