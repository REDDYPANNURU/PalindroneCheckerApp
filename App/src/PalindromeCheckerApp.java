import java.util.Scanner;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

// Concrete Strategy 1: Reverse Method
class ReverseStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {
        String cleaned = cleanText(text);
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    private String cleanText(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}

// Concrete Strategy 2: Two Pointer Method
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {
        String cleaned = cleanText(text);

        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private String cleanText(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        return strategy.isPalindrome(text);
    }
}

// Main Class
public class StrategyPatternPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Start with Reverse Strategy
        PalindromeContext context = new PalindromeContext(new ReverseStrategy());

        System.out.println("\nUsing Reverse Strategy:");
        System.out.println(context.check(input) ? "Palindrome" : "Not Palindrome");

        // Switch to Two Pointer Strategy
        context.setStrategy(new TwoPointerStrategy());

        System.out.println("\nUsing Two Pointer Strategy:");
        System.out.println(context.check(input) ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}