package com.ph.datastructure.sort.problems;

import com.ph.datastructure.sort.BasicBubbleSort;

public class SortArray {

	public static void main(String... strings) {
		Integer[] data = { 5, 7, 3, 9, 2, 0, 1, 4, 6, 8 };
		String string = "";
		for(int i =0 ; i< data.length;i++) {
			string += data[i].toString()+", ";
		}
		System.out.println(string);
		BasicBubbleSort<Integer> bubble = new BasicBubbleSort<Integer>(data);
		System.out.println(bubble.toString(bubble.sort()));
		System.out.println(bubble.toString(bubble.reversSort()));
		string = "";
		for(int i =0 ; i< data.length;i++) {
			string += data[i].toString()+", ";
		}
		System.out.println(string);
	}
}
