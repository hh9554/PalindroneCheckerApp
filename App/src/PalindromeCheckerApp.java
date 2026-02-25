/**
 * Use Case 11: Object-Oriented Palindrome Service
 * Description: Demonstrates palindrome validation using object-oriented principles.
 * Encapsulates the logic in a PalindromeService class.
 * @author hh9554
 * @version 11.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";

        // Instantiate the service class
        PalindromeService service = new PalindromeService();
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}