import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        int[][] jaggedArray = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int numCols = scanner.nextInt();
            jaggedArray[i] = new int[numCols];
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The jagged array is:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}