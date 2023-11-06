import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Stack<T> {
    private List<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public boolean search(T element) {
        return elements.contains(element);
    }

    public void display() {
        System.out.println("Stack Elements:");
        for (int i = elements.size() - 1; i >= 0; i--) {
            System.out.println(elements.get(i));
        }
    }

}
    public class StackExample {
        public static void main(String[] args) {
            Stack<Integer> integerStack = new Stack<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements to push onto the stack: ");
            int n = scanner.nextInt();
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                integerStack.push(element);
            }
            System.out.println("Pop: " + integerStack.pop());

            System.out.println("Stack elements using display:");
            integerStack.display();
            System.out.println("Peek: " + integerStack.peek());
            System.out.println("Size: " + integerStack.size());

            System.out.print("Enter an element to search in the stack: ");
            int searchElement = scanner.nextInt();
            System.out.println("Element found: " + integerStack.search(searchElement));
            System.out.println("Stack elements using display:");
            integerStack.display();
            scanner.close();
        }
    }
