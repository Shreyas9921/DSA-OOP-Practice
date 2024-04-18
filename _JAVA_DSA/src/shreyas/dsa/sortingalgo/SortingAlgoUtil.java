package shreyas.dsa.sortingalgo;

import java.util.Arrays;

public class SortingAlgoUtil {

	/*
	 * Insertion sorting Algorithm
	 */
	
	public static Integer[] insertionSort(Integer[] arr) {
		int iteration = 1;
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			System.out.println("Key Element for current " +iteration + " in  Iteration is ::" +key);
			while(j >= 0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			iteration++;
			System.out.println(Arrays.asList(arr));
		}
		System.out.println("Total number of iterations are ::" +iteration);
		return arr;
	}
	/*
	 * Selection sorting Algorithm
	 */
	public static Integer[] selectionSort(Integer[] arr) {
		int minIndex = -1;
		int iteration = 0; 
		int temp = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			
			iteration++;
			minIndex = i;
			int comparison = 0;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j])	minIndex = j;
				comparison++;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		
			System.out.println(Arrays.asList(arr));

			System.out.println("Number of Comparisons for each iteration ::" +comparison);
		System.out.println();
		}
		System.out.println("Number of Iteration for selection sort ::" +iteration);
		return arr;
	}
	
	/*
	 * Bubble sorting Algorithm
	 */
	public static Integer[] bubbleSort(Integer[] arr) {
		int left = 0;
		int right = arr.length-1;
		int iteration = 0;
		while(left < right) {
			
			iteration++;
			
			for(int idx = 0; idx < right-left; idx++) {
				
				if(arr[idx] > arr[idx+1]) {
					arr[idx+1] = arr[idx+1] + arr[idx];
					arr[idx] = arr[idx+1] - arr[idx];
					arr[idx+1] = arr[idx+1] - arr[idx];
				}
			}
			left++;
			
			System.out.println(Arrays.asList(arr));
			System.out.println();
 		}
		System.out.println("Number of Iteration for bubble sort ::" +iteration);
		return arr;
	}

}
