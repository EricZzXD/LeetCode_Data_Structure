package com.company.LeetCodeArray;
import java.util.Arrays;

public class LeetCodeArray_Introduction {

    public static void main() {

        System.out.println("\nLeetCode_Array_Introduction: ");

        // LeetCode_array: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
        int [] findMaxConsecutiveOnes_Array = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(findMaxConsecutiveOnes_Array);

        // LeetCode_array: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
        int [] findNumbers_array = {12,345,2,6,7896};
        findNumbers(findNumbers_array);

        //LeetCode_array: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
        int [] sortedSquares_array = {-4,-1,0,3,10};
        sortedSquares(sortedSquares_array);

    }

    /*
        LeetCode_array: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/

        Description: Given a binary array, find the maximum number of consecutive 1s in this array.
        Example 1:
            Input: [1,1,0,1,1,1]
            Output: 3
            Explanation: The first two digits or the last three digits are consecutive 1s.
                The maximum number of consecutive 1s is 3.

        Note:
            The input array will only contain 0 and 1.
            The length of input array is a positive integer and will not exceed 10,000
     */
    public static int findMaxConsecutiveOnes(int[] nums){
        int maxCouner = 0;
        int tempC = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                tempC++;
                if (maxCouner < tempC) {
                    maxCouner = tempC;
                }
            }else {
                tempC = 0;
            }
        }
        System.out.println("FindMaxConsecutiveOnes: " + maxCouner);
        return maxCouner;
    }


    /*
        LeetCode_array: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

        Given an array nums of integers, return how many of them contain an even number of digits

        Example 1:
            Input: nums = [12,345,2,6,7896]
            Output: 2
            Explanation:
            12 contains 2 digits (even number of digits).
            345 contains 3 digits (odd number of digits).
            2 contains 1 digit (odd number of digits).
            6 contains 1 digit (odd number of digits).
            7896 contains 4 digits (even number of digits).
            Therefore only 12 and 7896 contain an even number of digits.

         Example 2:
            Input: nums = [555,901,482,1771]
            Output: 1
            Explanation:
            Only 1771 contains an even number of digits.


        Constraints:
            1 <= nums.length <= 500
            1 <= nums[i] <= 10^5
     */
    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i=0;i<nums.length;i++){
            String Num_String = Integer.toString(nums[i]);
            if(Num_String.length()%2 == 0){
                counter++;
            }
        }
        System.out.println("FindNumbers: " + counter);
        return counter;
    }


    /*
        LeetCode_array: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/

        Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

        Example 1:
            Input: [-4,-1,0,3,10]
            Output: [0,1,9,16,100]

        Example 2:
            Input: [-7,-3,2,3,11]
            Output: [4,9,9,49,121]

        Note:
            1 <= A.length <= 10000
            -10000 <= A[i] <= 10000
            A is sorted in non-decreasing order.
     */
    public static int[] sortedSquares(int[] arr) {
        // Square the A[i]
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }

        // Bubble sort
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("SortedSquares: " + Arrays.toString(arr));
        return arr;
    }

}
