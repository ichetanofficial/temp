public class StringBufferOperations {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, ");
        stringBuffer.append("World!");
        System.out.println("Appended StringBuffer: " + stringBuffer);
        stringBuffer.insert(7, "Java ");
        System.out.println("Inserted 'Java' at position 7: " + stringBuffer);
        stringBuffer.replace(13, 19, "Programming");
        System.out.println("Replaced 'World' with 'Programming': " + stringBuffer);
        stringBuffer.delete(0, 7);
        System.out.println("Deleted characters from 0 to 7: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);
        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of the StringBuffer: " + capacity);
    }
}
