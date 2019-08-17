package algorithms._05.mergesort;

public class MergeSorter {

	public void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int startIndex, int endIndex) {

		if (endIndex <= startIndex)
			return;

		int midIndex = (startIndex + endIndex) / 2;

		sort(arr, startIndex, midIndex);
		sort(arr, midIndex + 1, endIndex);
		merge(arr, startIndex, midIndex, endIndex);

	}

	private void merge(int arr[], int startIndex, int midIndex, int endIndex) {

		int leftSide = startIndex;
		int rightSide = midIndex + 1;
		int[] tempArr = new int[endIndex - startIndex + 1];
		int k = 0;

		while (leftSide <= midIndex && rightSide <= endIndex) {

			if (arr[leftSide] < arr[rightSide]) {
				tempArr[k] = arr[leftSide];
				++leftSide;
			} else {
				tempArr[k] = arr[rightSide];
				++rightSide;
			}

			++k;
		}

		if (leftSide <= midIndex) {

			while (leftSide <= midIndex) {

				tempArr[k] = arr[leftSide];
				++leftSide;
				++k;

			}

		} else if (rightSide <= endIndex) {
			while (rightSide <= endIndex) {
				tempArr[k] = arr[rightSide];
				++rightSide;
				++k;
			}
		}

		for (int i = 0; i < tempArr.length; i++) {
			arr[startIndex + i] = tempArr[i];
		}
	}
}
