import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String text = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Variable to store reversed string
        String reversed = "";

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (text.equals(reversed)) {
            System.out.println("Original String: " + text);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Result: The string is a Palindrome");
        } else {
            System.out.println("Original String: " + text);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Result: The string is NOT a Palindrome");
        }
    }
}