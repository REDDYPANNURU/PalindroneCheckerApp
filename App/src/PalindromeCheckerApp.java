 UC7
import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeCheckerApp {


import java.util.Scanner;
import java.util.Stack;

public class StackPalindrome {
 main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

 UC9
        LinkedList<Character> list = new LinkedList<>();

        Stack<Character> stack = new Stack<>();
 UC7
        Queue<Character> queue = new LinkedList<>();
 main

        // Add characters to linked list
        for (int i = 0; i < input.length(); i++) {
 UC9
            list.add(input.charAt(i));

            char ch = input.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO


        // Push all characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
 main
 main
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

 UC7
        // Output result

        // Display result
 main
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}