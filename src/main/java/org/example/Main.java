package org.example;


public class Main {

    public void reverseString(char[] s){
        // Initialize two pointers
        int left = 0;
        int right = s.length -1;

        // Swap characters until pointers meet
        while(left < right){
            // Swap s[left] and s[right]
            char temp = s [left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }
    }

    public static void printArray(char[] s){
        System.out.println(new String(s));
    }

    public static void main(String[] args) {
        System.out.println("Hello world!, This is my prac file");

        Main solution = new Main();

        // Test case 1: normal string "hello"
        char[] test1 = {'h','e','l','l','o'};
        System.out.println("Test 1 Before: ");
        printArray(test1);
        solution.reverseString(test1);
        System.out.println("Test 1 After: ");
        printArray(test1);

    }
}