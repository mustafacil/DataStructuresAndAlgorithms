package algorithms._02.binarysearch;

public class BinarySearchImpl {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 5, 8, 9, 10, 14, 15, 16, 20};
		System.out.println(binarySearch(arr, 10));
		System.out.println(binarySearch(arr, 23));
		
	}

	public static int binarySearch(int[] arr, int number) {

		int startIndex = 0;
		int endIndex = arr.length - 1;
		

		while (startIndex <= endIndex) {
			
			int midIndex = (startIndex + endIndex) / 2;
			
			if (number < arr[midIndex])
				endIndex = midIndex - 1;
			else if (number > arr[midIndex])
				startIndex = midIndex + 1;
			else
				return midIndex;
		}

		return -1;
	}

}
