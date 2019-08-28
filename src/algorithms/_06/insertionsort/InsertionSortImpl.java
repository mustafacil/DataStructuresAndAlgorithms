package algorithms._06.insertionsort;

import java.util.Arrays;

public class InsertionSortImpl {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 6, 3, 1, 67, 65, 66, 9, 0, 90, 0};
		System.out.println(Arrays.toString(insertionSortV1(arr)));
		System.out.println(Arrays.toString(insertionSortV2(arr)));
	}
	
	
	public static int[] insertionSortV1(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
		return arr;
	}
	
	public static int[] insertionSortV2(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]<arr[i-1]) {
				for (int j = i; j >=0; j--) {
					if(arr[j]<arr[j-1]) {
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
			}
			
		}
		return arr;
	}
}
