import java.util.Scanner;

public class PalindromeCheckerApp {
 UC3-StringReverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    public class void main(String[] args){
        System.out.println("Welcome to Palindrone Checker App Management System");
        System.out.println("Modify this logic to usecase 2");
 main
    }
}