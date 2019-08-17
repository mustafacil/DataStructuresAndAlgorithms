package algorithms._05.mergesort;

import java.util.Arrays;

public class TestMergeSort {
	
	public static void main(String[] args) {
		
		int[] arrMergeSort = {4, 3, 1, 9, 4, 5, 6, 4, 3, 5, 2, 0, 99, 98, 67, 21, 0};
		MergeSorter sorter = new MergeSorter();
		sorter.sort(arrMergeSort);
		System.out.println(Arrays.toString(arrMergeSort));
		
	}
	
	
}
