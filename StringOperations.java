public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello,";
        String str2 = " World!";
        String str3 = "Java Programming";
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated String: " + concatenatedString);
        int length = str3.length();
        System.out.println("Length of the String '" + str3 + "': " + length);
        String substring = str3.substring(5, 12);
        System.out.println("Substring of '" + str3 + "' from index 5 to 12: " + substring);
        String upperCaseString = str3.toUpperCase();
        String lowerCaseString = str3.toLowerCase();
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);
        char charToFind = 'a';
        boolean containsChar = str3.contains(String.valueOf(charToFind));
        System.out.println("Does '" + str3 + "' contain the character '" + charToFind + "': " +
                containsChar);
        String substringToFind = "Java";
        boolean containsSubstring = str3.contains(substringToFind);
        System.out.println("Does '" + str3 + "' contain the substring '" + substringToFind + "': " +
                containsSubstring);
        String replacedString = str3.replace('a', 'X');
        System.out.println("AŌer replacing 'a' with 'X': " + replacedString);
        String[] words = str3.split(" ");
        System.out.println("Words in the string: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
