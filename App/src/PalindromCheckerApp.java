public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String text = "madam";

        // Convert string to character array
        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Original String: " + text);
            System.out.println("Result: The string is a Palindrome");
        } else {
            System.out.println("Original String: " + text);
            System.out.println("Result: The string is NOT a Palindrome");
        }
    }
}