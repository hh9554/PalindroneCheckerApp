/**
 * Use Case 10: Normalized Palindrome Validation
 * Description: This class validates a palindrome after preprocessing the input string.
 * Normalization includes: Removing spaces and symbols, Converting to lowercase.
 * This ensures the palindrome check is logical rather than character-format dependent.
 * Example: A man a plan a canal Panama
 * @author hh9554
 * @version 10.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Remove everything except letters and numbers, then convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}