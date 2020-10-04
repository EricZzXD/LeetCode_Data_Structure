package com.company.LeetCodeArray;
import java.util.Arrays;

public class LeetCodeArray_Insertion {
    public static int main(){

        System.out.println("\nLeetCode_Array_Insertion: ");

        // LeetCode Link:  https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
        int [] duplicateZeros_array = {1,0,2,3,0,4,5,0};
        duplicateZeros(duplicateZeros_array);

        // LeetCode Link:  https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int Num_nums1 = nums1.length-nums2.length;
        int Num_nums2 = nums2.length;
        merge(nums1, Num_nums1, nums2, Num_nums2);
        return 0;
    }

    /*
        LeetCode Link:  https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/

        Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
        Note that elements beyond the length of the original array are not written.
        Do the above modifications to the input array in place, do not return anything from your function.

        Example 1:
            Input: [1,0,2,3,0,4,5,0]
            Output: null
            Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

        Example 2:
            Input: [1,2,3]
            Output: null
            Explanation: After calling your function, the input array is modified to: [1,2,3]


        Note:
            1 <= arr.length <= 10000
            0 <= arr[i] <= 9


     */
    public static void duplicateZeros(int[] arr) {
        // Solution 1 (Runtime: 16ms, Memory Usage: 39.2M)
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                i++;
            }
        }
        System.out.println("duplicateZeros: "+Arrays.toString(arr));
    }


    /*
        LeetCode Link:  https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
        Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

        Note:

        The number of elements initialized in nums1 and nums2 are m and n respectively.
        You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

        Example:
            Input:
            nums1 = [1,2,3,0,0,0], m = 3
            nums2 = [2,5,6],       n = 3

            Output: [1,2,2,3,5,6]

        Constraints:
            -10^9 <= nums1[i], nums2[i] <= 10^9
            nums1.length == m + n
            nums2.length == n
     */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // RunTime: 1ms     Memory Usage: 39.1MB
        int counter = 0;

        // Merge Two array
        for(int i=m;i<n+m;i++){
            if(counter <= n){
                nums1[i] = nums2[counter];
                counter++;
            }
        }
        // Bubble sort
        boolean BubbleSort = false;
        int temp;
        while (!BubbleSort){
            BubbleSort = true;
            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i+1]) {
                    temp = nums1[i];
                    nums1[i] = nums1[i+1];
                    nums1[i+1] = temp;
                    BubbleSort = false;
                }
            }
        }
        System.out.println("merge: " + Arrays.toString(nums1));
    }
}
