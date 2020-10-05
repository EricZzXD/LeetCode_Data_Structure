package com.company.LeetCodeArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCodeArray_Conclusion {
    public static int main() {
        System.out.println("\nLeetCode_Conclusion: ");

        //  LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
        int [] heightChecker_array = {1,1,4,2,1,3};
        heightChecker(heightChecker_array);

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
        int [] thirdMax_array = {2, 2, 3, 1};
        thirdMax(thirdMax_array);


        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
        int [] findDisappearedNumbers_array = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(findDisappearedNumbers_array);
        return 0;


    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/

        Students are asked to stand in non-decreasing order of heights for an annual photo.
        Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
        Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.

        Example 1:
            Input: heights = [1,1,4,2,1,3]
            Output: 3

            Explanation:
                Current array : [1,1,4,2,1,3]
                Target array  : [1,1,1,2,3,4]
                On index 2 (0-based) we have 4 vs 1 so we have to move this student.
                On index 4 (0-based) we have 1 vs 3 so we have to move this student.
                On index 5 (0-based) we have 3 vs 4 so we have to move this student.

        Example 2:
            Input: heights = [5,1,2,3,4]
            Output: 5

        Example 3:
            Input: heights = [1,2,3,4,5]
            Output: 0

        Constraints:
            1 <= heights.length <= 100
            1 <= heights[i] <= 100

     */

    public static int heightChecker(int[] heights) {
        // Make a copy of the Height
        int[] copy = Arrays.copyOf(heights, heights.length);
        // Sort the array
        Arrays.sort(copy);

        // Compare the different -> if height[i] != height[j], counter++
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                count++;
            }
        }
        System.out.println("heightChecker: " + count);
        return count;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/

        Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

        Example 1:
            Input: [3, 2, 1]
            Output: 1
            Explanation: The third maximum is 1.

        Example 2:
            Input: [1, 2]
            Output: 2
            Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

        Example 3:
            Input: [2, 2, 3, 1]
            Output: 1
            Explanation: Note that the third maximum here means the third maximum distinct number.
            Both numbers with value 2 are both considered as second maximum.
     */
    public static int thirdMax(int[] nums) {
        int index = 0;

        // An array to store three largest value
        long[] result = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        // Use Three If condition to find where the value should go to
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result[0]) {
                result[2] = result[1];
                result[1] = result[0];
                result[0] = nums[i];
                index++;
            } else if (nums[i] > result[1] && nums[i] < result[0]) {
                result[2] = result[1];
                result[1] = nums[i];
                index++;
            } else if (nums[i] > result[2] && nums[i] < result[1]) {
                result[2] = nums[i];
                index++;
            }
        }
        System.out.print("thirdMax: ");
        System.out.println(index > 2 ? (int)result[2] : (int)result[0]);
        return index > 2 ? (int)result[2] : (int)result[0];
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/

        Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
        Find all the elements of [1, n] inclusive that do not appear in this array.
        Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

        Example:
            Input:
            [4,3,2,7,8,2,3,1]

        Output:
            [5,6]
     */

    // Pending (not finish)
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();

        return result;
    }

}
