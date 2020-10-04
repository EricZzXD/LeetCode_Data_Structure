package com.company.LeetCodeArray;
import java.util.Arrays;

public class LeetCodeArray_InPlaceOperation {
    public static int main(){
        System.out.println("\nLeetCode_In_place_Operation: ");

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
        int [] replaceElements_array = {17,18,5,4,6,1};
        replaceElements(replaceElements_array);

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
        int [] moveZeroes_array= {0,1,0,3,12};
        moveZeroes(moveZeroes_array);

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
        int [] sortArrayByParity_array = {3,1,2,4};
        sortArrayByParity(sortArrayByParity_array);

        return 0;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/

        Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
        After doing so, return the array.

        Example 1:
            Input: arr = [17,18,5,4,6,1]
            Output: [18,6,6,6,1,-1]

        Constraints:
            1 <= arr.length <= 10^4
            1 <= arr[i] <= 10^5
     */

    public static int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            arr[i]=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[j];
                }
            }
        }
        arr[arr.length-1]=-1;
        System.out.println("replaceElements: " + Arrays.toString(arr));
        return arr;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/

        Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Example:
            Input: [0,1,0,3,12]
            Output: [1,3,12,0,0]

        Note:
            You must do this in-place without making a copy of the array.
            Minimize the total number of operations.
     */

    public static void moveZeroes(int[] nums) {
        boolean BreakFor;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                BreakFor = true;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0 && BreakFor){
                        nums[i]=nums[j];
                        nums[j]=0;
                        BreakFor=false;
                    }
                }
            }
        }
        System.out.println("moveZeroes: " + Arrays.toString(nums));
    }

    /*
        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/

        Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
        You may return any answer array that satisfies this condition.

        Example 1:
            Input: [3,1,2,4]
            Output: [2,4,3,1]
            The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

        Note:
            1 <= A.length <= 5000
            0 <= A[i] <= 5000
     */
    public static int[] sortArrayByParity(int[] A) {
        boolean CheckOdd;
        for (int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                CheckOdd=true;
                for(int j=i+1;j<A.length;j++){
                    if(A[j]%2 == 0 && CheckOdd){
                        int temp = A[i];
                        A[i]=A[j];
                        A[j]=temp;
                        CheckOdd = false;
                    }
                }
            }
        }
        System.out.println("sortArrayByParity: " + Arrays.toString(A));
        return A;
    }
}
