package com.company.LeetCodeStringAndArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class LeetCodeStringAndArray_2DArray {
    public static int main(){
        System.out.println("\nLeetCode_StringAndArray_2DArray: ");

        // LeetCode Link: https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
        int [][] findDiagonalOrder_2DArray = {{1,2,3},{4,5,6},{7,8,9}};
        findDiagonalOrder(findDiagonalOrder_2DArray);

        // LeetCode Link: https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/
        int [][] spiralOrder_Matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int [][] spiralOrder_Matrix = {{3},{2}};
        spiralOrder(spiralOrder_Matrix);

        return 0;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/

        Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

        Example:
            Input:
            [
             [ 1, 2, 3 ],
             [ 4, 5, 6 ],
             [ 7, 8, 9 ]
            ]
            Output:  [1,2,4,7,5,3,6,8,9]

            Explanation: https://assets.leetcode.com/uploads/2018/10/12/diagonal_traverse.png

            Note:
                The total number of elements of the given matrix will not exceed 10,000.
     */
    public static int[] findDiagonalOrder(int[][] matrix) {
        int arrCounter = 0;
        int [] arr = new int[matrix.length*matrix[0].length];
        // To be continues ------------------------------------------------

        return arr;
    }

    /*
        LeetCode Link: https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/

        Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

        Example 1:
            Input:
            [
             [ 1, 2, 3 ],
             [ 4, 5, 6 ],
             [ 7, 8, 9 ]
            ]
            Output: [1,2,3,6,9,8,7,4,5]

        Example 2:
            Input:
            [
              [1, 2, 3, 4],
              [5, 6, 7, 8],
              [9,10,11,12]
            ]
            Output: [1,2,3,4,8,12,11,10,9,5,6,7]
     */

    public static List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list = new LinkedList<Integer>();

        // Check if the matrix is empty
        if(matrix.length==0 || matrix[0].length==0){
            return list;
        }

        int Column1 = 0, Column2=matrix.length-1;
        int Row1 = 0, Row2=matrix[0].length-1;

        while(Column1 <= Column2 && Row1<=Row2){
            // Append the row into the list
            for(int r=Row1;r<=Row2;r++){
                list.add(matrix[Column1][r]);
            }
            for(int c=Column1+1;c<=Column2;c++){
                list.add(matrix[c][Row2]);
            }
            if(Row1<Row2 && Column1<Column2) {
                for (int r = Row2-1; r > Row1; r--) {
                    list.add(matrix[Column2][r]);
                }
                for (int c = Column2; c > Column1; c--) {
                    list.add(matrix[c][Row1]);
                }
            }
            Column1++;
            Column2--;
            Row1++;
            Row2--;
        }
        System.out.println("spiralOrder: " + list);
        return list;
    }
}
