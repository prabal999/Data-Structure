package com.ph.datastructure.sort;

import java.util.Arrays;

public class BasicBubbleSort<X extends Comparable<X>> {
	private X[] dataInput;

	public BasicBubbleSort(final X[] dataInput) {
		this.dataInput = dataInput;
	}

	public X[] sort() {
		X[] sorted = Arrays.copyOf(dataInput, dataInput.length);
		X temp = null;
		for (int i = 0; i < sorted.length - 1; i++) {
			for (int j = 0; j < sorted.length - i - 1; j++) {
				if (sorted[j].compareTo(sorted[j + 1]) > 0) {
					temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
			}
		}
		return sorted;
	}
	
	public X[] reversSort() {
		X[] reversSorted = Arrays.copyOf(dataInput, dataInput.length);
		X temp = null;
		for (int i = 0; i < reversSorted.length - 1; i++) {
			for (int j = 0; j < reversSorted.length - i - 1; j++) {
				if (reversSorted[j].compareTo(reversSorted[j + 1]) < 0) {
					temp = reversSorted[j];
					reversSorted[j] = reversSorted[j + 1];
					reversSorted[j + 1] = temp;
				}
			}
		}
		return reversSorted;
	}
	
	
	public String toString(X[] data) {
		String string = "";
		for(int i =0 ; i< data.length;i++) {
			string += data[i].toString()+", ";
		}
		return string;
	}
}
