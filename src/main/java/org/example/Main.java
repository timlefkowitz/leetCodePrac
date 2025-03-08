package org.example;


public class Main {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

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

    public static void printArrayWithMessage(char[] s {
        System.out.println(new String(s) + "we are gonna code code code :))");

    public static void printIntArray(int[] arr) {
        System.out.printf(Arrays.toString(arr));
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

        //Two Sums test
        System.out.println("\n Testing twoSum: ");
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(" Test 1 Input: nums = ");
        printIntArray(nums1);
        System.out.println("Target: " + target1);
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1 Output: ");
        printIntArray(result1);

    }
}
