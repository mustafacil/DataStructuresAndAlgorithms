package algorithms._01.linearsearch;

public class LinearSearchImpl {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 3, 7, 8, 9, 4, 5, 98, 76, 55, 0};
		System.out.println(linearSearch(arr, 98));
		System.out.println(linearSearch(arr, 99));
		
	}
	
	
	public static boolean linearSearch(int[] arr, int number) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == number) return true;
		}
		
		return false;
	}
	
}
