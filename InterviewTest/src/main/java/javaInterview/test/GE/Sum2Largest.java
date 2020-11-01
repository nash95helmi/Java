package javaInterview.test.GE;

public class Sum2Largest {

	public static void main(String[] args) {
		int[] arr = {111,3,56,12,78,10,5,6,81};
		sortArr(arr);
		System.out.println("Total 2 largest :: "+sumOf2LargestElem(arr));
	}

	//Sorting method
	private static void sortArr(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1 ;j<arr.length-1; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	//Total 2 largest number
	private static int sumOf2LargestElem(int[] arr) {
		return arr.length > 1 ? arr[arr.length-1] + arr[arr.length-2] : 0;
	}

}
