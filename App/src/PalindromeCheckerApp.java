import java.util.Scanner;

// Palindrome class (Encapsulation)
class Palindrome {

    private String text;

    // Constructor
    public Palindrome(String text) {
        this.text = text;
    }

    // Method to check palindrome (ignores case and spaces)
    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

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

    // Getter method
    public String getText() {
        return text;
    }
}

// Main class
public class OOPPalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        Palindrome palindrome = new Palindrome(input);

        // Call method
        if (palindrome.isPalindrome()) {
            System.out.println("The string \"" + palindrome.getText() + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + palindrome.getText() + "\" is not a palindrome.");
        }

        sc.close();
    }
}