package com.ph.datastructure.search.problems;

import com.ph.datastructure.search.BasicBinarySearch;

/**
Find position of an element in a sorted array of infinite numbers
Suppose you have a sorted array of infinite numbers, how would you search an element in the array?

Source: Amazon Interview Experience.

Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.

Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.
 * 
 * @author Prabal Srivastava
 */
public class PositionInInfiniteSortedArray {
    // Method takes an infinite size array and a key to be
    //  searched and returns its position if found else -1.
    // We don't know size of arr[] and we can assume size to be
    // infinite in this function.
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE
    // THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
    public int findPos(Integer[] inputData,Integer key)    
    {
        int low = 0, high = 1;
        int value = inputData[0];
  
        // Find high of an array to do binary search
        while (value < key)
        {
            low = high;        // store previous high
            high = 2*high;      // double high index
            value = inputData[high]; // update new value
        }
  
        // at this point we have updated low
        //  and high indices, thus use binary 
        // search between them
        BasicBinarySearch<Integer> search = new BasicBinarySearch<Integer>(inputData);
        return search.search(key, inputData, low, high);
    }
    
    public static void main(String...strings){
        PositionInInfiniteSortedArray obj = new PositionInInfiniteSortedArray();
        Integer arr[] = new Integer[]{3, 5, 7, 9, 10, 90, 
                              100, 130, 140, 160, 170};
         int ans = obj.findPos(arr,10);
          
         if (ans==-1)
             System.out.println("Element not found");
         else
             System.out.println("Element found at index " + ans);
    }
}
