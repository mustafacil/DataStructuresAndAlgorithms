package algorithms._04.bubblesort;

import java.util.Arrays;

public class BubbleSortImpl {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 6, 3, 1, 67, 65, 66, 9, 0, 90, 0};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		return arr;
	}
	
}
