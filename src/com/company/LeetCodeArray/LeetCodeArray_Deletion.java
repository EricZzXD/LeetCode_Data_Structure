package com.company.LeetCodeArray;
import java.util.Arrays;

public class LeetCodeArray_Deletion {
    public static int main(){

        System.out.println("\nLeetCode_Array_Deletion: ");

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
        int [] removeElement_array = {0,1,2,2,3,0,4,2};
        int remove_value = 2;
        removeElement(removeElement_array, remove_value);

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
        int [] removeDuplicates_array = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(removeDuplicates_array);
        return 0;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

        Given an array nums and a value val, remove all instances of that value in-place and return the new length.
        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
        The order of elements can be changed. It doesn't matter what you leave beyond the new length.

        Example 1:
            Given nums = [3,2,2,3], val = 3,
            Your function should return length = 2, with the first two elements of nums being 2.
            It doesn't matter what you leave beyond the returned length.

        Example 2:
            Given nums = [0,1,2,2,3,0,4,2], val = 2,
            Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
            Note that the order of those five elements can be arbitrary.
            It doesn't matter what values are set beyond the returned length.

        Clarification:
            Confused why the returned value is an integer but your answer is an array?
            Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

        Internally you can think of this:
            // nums is passed in by reference. (i.e., without making a copy)
            int len = removeElement(nums, val);

            // any modification to nums in your function would be known by the caller.
            // using the length returned by your function, it prints the first len elements.
            for (int i = 0; i < len; i++) {
                print(nums[i]);
            }
     */
    public static int removeElement(int[] nums, int val) {
        // Runtime 0ms     Memory Usage: 37.8MB

        // The LengthCounter used to return the length size
        int lengthCounter = nums.length;

        // Loop the array and Check value (remove and fill)
        for(int i=0;i<lengthCounter;i++){
            if(nums[i]==val){
                // Replace the index value
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                // i-- is used in case Remove_value Are in a row
                i--;
                // Update the Length
                lengthCounter--;
            }
        }
        System.out.println("removeElement: " + lengthCounter);
        return lengthCounter;
    }


    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/

        Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:
            Given nums = [1,1,2],
            Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
            It doesn't matter what you leave beyond the returned length.

        Example 2:
            Given nums = [0,0,1,1,1,2,2,3,3,4],
            Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
            It doesn't matter what values are set beyond the returned length.

        Clarification:
            Confused why the returned value is an integer but your answer is an array?
            Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

        Internally you can think of this:
            // nums is passed in by reference. (i.e., without making a copy)
            int len = removeDuplicates(nums);

            // any modification to nums in your function would be known by the caller.
            // using the length returned by your function, it prints the first len elements.
            for (int i = 0; i < len; i++) {
                print(nums[i]);
            }
     */
    public static int removeDuplicates(int[] nums) {
        // Check if the Nums is empty
        if (nums.length == 0) return 0;

        // Used to update the array length
        int LengthCounter = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[LengthCounter]) {
                LengthCounter++;
                nums[LengthCounter] = nums[j];
            }
        }
        System.out.println("removeDuplicates: " + Arrays.toString(nums));
        return LengthCounter + 1;
    }

}
