/**
 * Use Case 4: Character Array Based Validation
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++; end--;
        }
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}