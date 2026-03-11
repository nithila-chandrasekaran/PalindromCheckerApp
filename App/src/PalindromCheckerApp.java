import java.util.Scanner;

public class PalindromCheckerApp{

    public static void main(String[] args) {

        // Welcome message and application details
        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("           Version 1.0           ");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Reverse the input
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Palindrome checking
        if (input.equals(reverse)) {
            System.out.println("Result: It is a PALINDROME.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("Thank you for using Palindrome Checker!");

        sc.close();
    }
}

