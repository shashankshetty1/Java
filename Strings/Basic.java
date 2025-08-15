public class Basic {

    public static void main(String[] args) {

        // Declaring a string
        String name = "Shashank";

        // Printing the length of the string
        System.out.println("Length of name: " + name.length());

        // Printing substring from index 4
        System.out.println("Substring from index 4: " + name.substring(4));

        // Checking if name starts with "Sh"
        System.out.println("Does name start with 'Sh'? " + name.startsWith("Sh"));

        // Printing the character at index 4
        System.out.println("Character at index 4: " + name.charAt(4));

        // Replacing 'S' with 'A' in the name
        System.out.println("Name after replacing 'S' with 'A': " + name.replace("S", "A"));

        // Demonstrating escape sequences
        String message = "Hi\nThis is\n\tShashank Shetty";
        System.out.println("Formatted message:\n" + message);

        // Converting to uppercase
        System.out.println("Uppercase name: " + name.toUpperCase());

        // Converting to lowercase
        System.out.println("Lowercase name: " + name.toLowerCase());
    }
}
