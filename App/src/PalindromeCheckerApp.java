import java.util.Stack;

/**
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * Description: Algorithms can be selected dynamically at runtime using the Strategy Pattern.
 * @author hh9554
 * @version 12.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String normalized = input.toLowerCase(); // handle case sensitivity

        // Inject the strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(normalized);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}