import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * Description: This class validates a palindrome using a Deque.
 * @author hh9554
 * @version 7.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}