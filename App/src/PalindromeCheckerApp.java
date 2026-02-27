 UC7
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
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

        Stack<Character> stack = new Stack<>();
 UC7
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both stack and queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO


        // Push all characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
 main
        }

        boolean isPalindrome = true;

 UC7
        // Compare elements from stack and queue
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {

        // Compare original string with characters popped from stack
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
 main
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