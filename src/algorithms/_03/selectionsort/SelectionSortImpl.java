package algorithms._03.selectionsort;

import java.util.Arrays;

public class SelectionSortImpl {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 6, 3, 1, 67, 65, 66, 9, 0, 90, 0};
		System.out.println(Arrays.toString(selectionSort(arr)));
		
		
	}
	
	public static int[] selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			int minIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		
		return arr;
	}
	
}
