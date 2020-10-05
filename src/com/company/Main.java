package com.company;

import com.company.LeetCodeArray.*;
import com.company.LeetCodeLinkedList.*;
import com.company.LeetCodeStringAndArray.*;

public class Main {

    public static void main(String[] args) {
        // LeetCode String And Array
        LeetCode_StringAndArray();

        // LeetCode Array
//        LeetCode_Array();

        // LeetCode Linked List
//        LeetCode_linkedlist();
    }

    public static void LeetCode_StringAndArray(){
        // LeetCodeStringAndArray Introduction
        LeetCodeStringAndArray_Introduction.main();

        // LeetCodeStringAndArray 2D Array
        LeetCodeStringAndArray_2DArray.main();
    }

    public static void LeetCode_Array(){
        // LeetCode Array Section - Introduction
        LeetCodeArray_Introduction.main();

        // LeetCode Array Section - Insertion
        LeetCodeArray_Insertion.main();

        // LeetCode Array Selection - Deletion
        LeetCodeArray_Deletion.main();

        // LeetCode Array Selection - Search
        LeetCodeArray_Search.main();

        // LeetCode Array Selection - In place Operation
        LeetCodeArray_InPlaceOperation.main();

        // LeetCode Array Selection - Conclusion
        LeetCodeArray_Conclusion.main();
    }


    public static void LeetCode_linkedlist(){
        // Fist Chapter of LinkedList
        LeetCodeLinkedList_SinglyLinkedList.main();

    }
}
