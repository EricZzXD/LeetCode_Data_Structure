package com.company.LeetCodeArray;

public class LeetCodeArray_Search {
    public static int main(){

        System.out.println("\nLeetCode_Array_Search: ");

        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
        int [] checkIfExist_array = {-2,0,10,-19,4,6,-8};
        checkIfExist(checkIfExist_array);
        System.out.println("checkIfExist: " + true);


        // LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
        int [] ValidMountainArray = {0,1,2,3,4,5,6,7,8,9};
        validMountainArray(ValidMountainArray);
        System.out.println("validMountainArray: " + true);

        return 0;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
        Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
        More formally check if there exists two indices i and j such that :

            i != j
            0 <= i, j < arr.length
            arr[i] == 2 * arr[j]

        Example 1:
            Input: arr = [10,2,5,3]
            Output: true
            Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.

        Example 2:
            Input: arr = [7,1,14,11]
            Output: true
            Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

        Example 3:
            Input: arr = [3,1,7,11]
            Output: false
            Explanation: In this case does not exist N and M, such that N = 2 * M.


        Constraints:
            2 <= arr.length <= 500
            -10^3 <= arr[i] <= 10^3
     */

    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int doubleCheck = arr[i]*2;
            for(int j=0;j<arr.length;j++){
                if(doubleCheck == arr[j] && j != i){
                    return true;
                }
            }
        }
        return false;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

        Given an array A of integers, return true if and only if it is a valid mountain array.
        Recall that A is a mountain array if and only if:

        A.length >= 3
        There exists some i with 0 < i < A.length - 1 such that:
        A[0] < A[1] < ... A[i-1] < A[i]
        A[i] > A[i+1] > ... > A[A.length - 1]


        Example 1:
            Input: [2,1]
            Output: false

        Example 2:
            Input: [3,5,5]
            Output: false

        Example 3:
            Input: [0,3,2,1]
            Output: true

        Note:
            0 <= A.length <= 10000
            0 <= A[i] <= 10000
     */

    public static boolean validMountainArray(int[] A) {
        // Find the Highest Index
        int highValue_index = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] > A[highValue_index]){
                highValue_index=i;
            }
        }

        // If match anything bellow -> return false
        if(A.length<=2 || highValue_index==0 || highValue_index==A.length-1){
            return false;
        }else{
            // loop to find
            for (int i = 0; i < highValue_index; i++) {
                if (A[i] >= A[i + 1]) {
                    System.out.println("False_First");
                    return false;
                }
            }
            for (int i = highValue_index; i < A.length - 1; i++) {
                if (A[i] <= A[i + 1]) {
                    System.out.println("False_Second");
                    return false;
                }
            }
        }
        System.out.println("validMountainArray: " + "True");
        return true;
    }

}
