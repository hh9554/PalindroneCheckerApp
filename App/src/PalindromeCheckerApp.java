import java.util.LinkedList;

/**
 * Use Case 8: Linked List Based Palindrome Checker
 * Description: This class checks whether a string is a palindrome using a LinkedList.
 * @author hh9554
 * @version 8.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}