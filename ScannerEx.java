import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char inputChar = scanner.next().charAt(0);
        System.out.print("Enter an int: ");
        int inputInt = scanner.nextInt();
        System.out.print("Enter a float: ");
        float inputFloat = scanner.nextFloat();
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        System.out.print("Enter a long: ");
        long inputLong = scanner.nextLong();
        System.out.print("Enter a short: ");
        short inputShort = scanner.nextShort();
        System.out.print("Enter a byte: ");
        byte inputByte = scanner.nextByte();
        System.out.print("Enter a boolean (true/false): ");
        boolean inputBoolean = scanner.nextBoolean();
        System.out.println("Character is: '" + inputChar + "'");
        System.out.println("Integer is: " + inputInt);
        System.out.println("Float is: " + inputFloat);
        System.out.println("Double is: " + inputDouble);
        System.out.println("Long is: " + inputLong);
        System.out.println("Short is: " + inputShort);
        System.out.println("Byte is: " + inputByte);
        System.out.println("Boolean is: " + inputBoolean);
        scanner.close();
    }
}