/**
 * Use Case 13: Performance Comparison
 * Description: This class measures and compares the execution performance
 * of palindrome validation algorithms using System.nanoTime().
 * @author hh9554
 * @version 13.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String normalized = input.toLowerCase();

        // Capture execution start time
        long startTime = System.nanoTime();

        boolean isPalindrome = check(normalized);

        // Capture execution end time
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }

    private static boolean check(String input) {
        int start = 0, end = input.length() - 1;
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