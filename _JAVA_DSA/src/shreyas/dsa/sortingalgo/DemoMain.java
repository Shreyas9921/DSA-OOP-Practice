package shreyas.dsa.sortingalgo;

import java.util.*;

import shreyas.dsa.practice.DsAlgoUtil;

public class DemoMain {

	public static void main(String[] args) {
		// Sorting Algorithms
		
		Integer[] shuffleArray = DsAlgoUtil.array(10);
		
		System.out.println("Array before sorting Algorithm ::");
		System.out.println(Arrays.asList(shuffleArray));

//		Integer[] sortedArray = SortingAlgoUtil.bubbleSort(shuffleArray);
//		Integer[] sortedArray = SortingAlgoUtil.selectionSort(shuffleArray);
		Integer[] sortedArray = SortingAlgoUtil.insertionSort(shuffleArray);


		System.out.println("Array after sorting Algorithm ::");
//		Collections.sort(Arrays.asList(shuffleArray));
		System.out.println(Arrays.asList(sortedArray));
		
	}

}
