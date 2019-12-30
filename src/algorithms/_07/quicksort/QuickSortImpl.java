package algorithms._07.quicksort;

import java.util.Arrays;

public class QuickSortImpl {

	public static void main(String[] args) {
		
		int arr[] = { 1, 6, 5, 4, 55, 43, 21, 34, 4, 6, 9, 8, 90 };
		System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
		
	}
	
	private static int[] quickSort(int[] arr, int l, int h) {
		
		if(h > l) {
			int j = partition(arr, l, h);
			quickSort(arr, l, j-1);
			quickSort(arr, j+1, h);
		}
		
		return  arr;
	}
	
	private static int partition(int arr[], int l, int h) {
		
		int pivot = arr[l];
		int i = l;
		int j = h;
		
		while(i<j) {
			
			while(arr[i] <= pivot && i!=h) {
				
				i++;
				
			}
			
			while(arr[j] > pivot && j!=-1) {
				
				j--;
				
			}
			
			if(j>i) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
		}
		
		
		arr[l] = arr[j];
		arr[j] = pivot;
		
		return j; 
	}
	
}
