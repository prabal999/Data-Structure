package com.ph.datastructure.search;

import java.util.Arrays;
import java.util.Collections;

public class BasicBinarySearch<X extends Comparable<X>> {

    private X[] dataArray;

    public BasicBinarySearch(X[] dataArray) {
        this.dataArray = dataArray;
    }

    public int searchIterative(X data) {
        int position = -1;
        int start = 0;
        int end = dataArray.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if(dataArray[middle].compareTo(data) < 0) {
                end = middle - 1;
            } else if(dataArray[middle].compareTo(data) > 0) {
                start = middle - 1;
            } else {
                position = middle;
                break;
            }
        }
        return position;
    }

    public int searchRecursive(X data) {
        return search(data, dataArray, 0, dataArray.length - 1);
    }

    public int searchArraysUtil(X data){
        return Arrays.binarySearch(dataArray, data);
    }
    public int searchCollectionsUtil(X data){
        return Collections.binarySearch(Arrays.asList(dataArray), data);
    }
    
    // For infinite array.
    public int search(X data, X[] dataArray, int start, int end) {
        int middle = (start + end) / 2;

        if(end < start) {
            return -1;
        }
        if(data.compareTo(dataArray[middle]) < 0) {
            return search(data, dataArray, start, middle - 1);
        } else if(data.compareTo(dataArray[middle]) > 0) {
            return search(data, dataArray, middle + 1, end);
        } else {
            return middle;
        }
    }
}
