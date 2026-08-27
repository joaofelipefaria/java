package br.com.joaofelipefaira.java.samples.classic;

/**
 * Bubble Sort
 *
 * <p><b>What is it?</b></p>
 * A simple comparison-based sorting algorithm that repeatedly compares adjacent
 * elements and swaps them if they are in the wrong order. After each pass, the
 * largest unsorted element "bubbles up" to its correct position at the end of
 * the array.
 *
 * <p><b>Why is it called Bubble Sort?</b></p>
 * Because the largest elements gradually "bubble up" to the end of the array,
 * similar to bubbles rising to the surface of water.
 *
 * <p><b>Key Characteristics</b></p>
 * <ul>
 *   <li>Stable: Yes. Equal elements preserve their relative order.</li>
 *   <li>In-place: Yes. Uses only O(1) extra memory.</li>
 *   <li>Adaptive: Yes, when optimized with a swap flag. It runs in O(n) if the array is already sorted.</li>
 * </ul>
 *
 * <p><b>Time Complexity</b></p>
 * <ul>
 *   <li>Best Case: O(n) (optimized version)</li>
 *   <li>Average Case: O(n²)</li>
 *   <li>Worst Case: O(n²)</li>
 * </ul>
 *
 * <p><b>Space Complexity</b></p>
 * <ul>
 *   <li>O(1)</li>
 * </ul>
 *
 * <p><b>When to use</b></p>
 * Suitable for educational purposes, very small datasets, or nearly sorted
 * collections when using the optimized version.
 *
 * <p><b>When not to use</b></p>
 * Avoid Bubble Sort for large datasets, as its O(n²) time complexity makes it
 * significantly less efficient than algorithms such as Merge Sort, Quick Sort,
 * or Heap Sort.
 */
public class BubbleSort {
	public static void bubbleSortImproved(int[] nums) {
		for(int end = nums.length - 1; end > 0; end--) {
			boolean swapped = false;
			for (int current = 0; current < end; current++) {
				if(nums[current] > nums[current + 1]) {
					AlgUtils.swap(nums, current, current + 1);
					swapped = true;
				}
			}
			if(!swapped)
				return;
		}
	}

	public static void bubbleSortBasic(int[] nums) {
		int n = nums.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
//			System.out.println("i = " + i);
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
//				System.out.println("j = " + j);
//				System.out.println("nums[j]:" + nums[j] + " - nums[j+1]:" + nums[j+1]);
				if(nums[j] < nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
			//if no swap was done, the vector is already in order.
			if(!swapped) {
				return;
			}
		}
	}
	
	public static void main(String... args) {
		int[] numbers = new int[] {3,7,2,8,1,9,4,6};
		bubbleSortBasic(numbers);
		bubbleSortImproved(numbers);
		for (int i : numbers) {
			System.out.println(i + " ");
		}
	}
}
