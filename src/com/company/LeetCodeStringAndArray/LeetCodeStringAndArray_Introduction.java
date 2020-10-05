package com.company.LeetCodeStringAndArray;
import java.util.Arrays;

public class LeetCodeStringAndArray_Introduction {
    public static int main(){

        System.out.println("\nLeetCode_StringAndArray_Introduction: ");

        // LeetCode Link: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
        int [] pivotIndex_array= {1,7,3,6,5,6};
        pivotIndex(pivotIndex_array);

        // LeetCode Url: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
        int [] dominantIndex_array= {1,5,3,7,66};
        dominantIndex(dominantIndex_array);

        // LeetCode Link :https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
        int [] plusOne_array = {9};
        plusOne(plusOne_array);

        return 0;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/

        Given an array of integers nums, write a method that returns the "pivot" index of this array.
        We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.
        If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

        Example 1:
            Input: nums = [1,7,3,6,5,6]
            Output: 3

            Explanation:
                The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
                Also, 3 is the first index where this occurs.

        Example 2:
            Input: nums = [1,2,3]
            Output: -1

            Explanation:
                There is no index that satisfies the conditions in the problem statement.

        Constraints:
            The length of nums will be in the range [0, 10000].
            Each element nums[i] will be an integer in the range [-1000, 1000].
     */

    /*
    // Solution 1: Runtime 284ms  Memory: 39.7MB
        public static int pivotIndex(int[] nums) {
            int leftsum = 0;
            for (int i=0;i<nums.length;i++){
                int rightsum = 0;
                for(int j=nums.length-1;j>=i;j--){
                    if(i == j && leftsum == rightsum){
                        return i;
                    }
                    rightsum += nums[j];
                }
                leftsum += nums[i];
            }
        return -1;
    }*/

    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        // Calculation the sum
        for (int x: nums) sum += x;

        // right sum = total sum - left sum -  pivotIndex.value = left sum
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) {
                System.out.println("pivotIndex: " + i);
                return i;
            }
            leftsum += nums[i];
        }

        return -1;
    }

    /*
        LeetCode Url: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/

        In a given integer array nums, there is always exactly one largest element.
        Find whether the largest element in the array is at least twice as much as every other number in the array.
        If it is, return the index of the largest element, otherwise return -1.

        Example 1:
            Input: nums = [3, 6, 1, 0]
            Output: 1
            Explanation: 6 is the largest integer, and for every other number in the array x,
            6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.


        Example 2:
            Input: nums = [1, 2, 3, 4]
            Output: -1
            Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.


        Note:
            nums will have a length in the range [1, 50].
            Every nums[i] will be an integer in the range [0, 99].

     */
    public static int dominantIndex(int[] nums) {
        int Max_index=0;

        // find the biggest integer
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[Max_index]){
                Max_index = i;
            }
        }

        // do comparison, if less , return -1
        for(int i=0;i<nums.length;i++){
            if(Max_index!=i && nums[Max_index]<nums[i]*2){
                return -1;
            }
        }

        // else return index
        System.out.println("dominantIndex: " + Max_index);
        return Max_index;
    }

    /*
        LeetCode Link :https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/

        Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
        You may assume the integer does not contain any leading zero, except the number 0 itself.

        Example 1:
            Input: digits = [1,2,3]
            Output: [1,2,4]
            Explanation: The array represents the integer 123.

        Example 2:
            Input: digits = [4,3,2,1]
            Output: [4,3,2,2]
            Explanation: The array represents the integer 4321.

        Example 3:
            Input: digits = [0]
            Output: [1]

        Constraints:
            1 <= digits.length <= 100
            0 <= digits[i] <= 9
     */
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]>=10 && i==0){
                int[] copy = new int[digits.length+1];
                for(int j=digits.length-1;j>=0;j--){
                    copy[j+1]=digits[j];
                    copy[j]=digits[j];
                }
                copy[1]=0;
                copy[0]=1;
                System.out.println("plusOne: " + Arrays.toString(copy));
                return copy;
            }else
            if(digits[i]>=10){
                digits[i]=digits[i]%10;
                digits[i-1]++;
            }
        }
        System.out.println("plusOne: "+Arrays.toString(digits));
        return digits;
    }
}
