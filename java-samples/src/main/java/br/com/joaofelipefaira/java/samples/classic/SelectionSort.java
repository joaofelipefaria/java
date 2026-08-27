package br.com.joaofelipefaira.java.samples.classic;

import java.util.Arrays;

/**
 * Selection Sort
 *
 * <p><b>What is it?</b></p>
 * A simple comparison-based sorting algorithm that repeatedly selects the
 * smallest element from the unsorted portion of the array and places it in its
 * correct position. After each pass, the sorted portion of the array grows by
 * one element from left to right.
 *
 * <p><b>Why is it called Selection Sort?</b></p>
 * Because on each iteration, the algorithm selects the smallest element from
 * the remaining unsorted elements and moves it to its final position.
 *
 * <p><b>Key Characteristics</b></p>
 * <ul>
 *   <li>Stable: No. Equal elements may change their relative order.</li>
 *   <li>In-place: Yes. Uses only O(1) extra memory.</li>
 *   <li>Adaptive: No. It always performs the same number of comparisons, even if the array is already sorted.</li>
 * </ul>
 *
 * <p><b>Time Complexity</b></p>
 * <ul>
 *   <li>Best Case: O(n²)</li>
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
 * Suitable for educational purposes, very small datasets, or situations where
 * minimizing the number of swaps is more important than minimizing the number
 * of comparisons.
 *
 * <p><b>When not to use</b></p>
 * Avoid Selection Sort for large datasets, as its O(n²) time complexity makes
 * it significantly less efficient than algorithms such as Merge Sort, Quick
 * Sort, or Heap Sort.
 */
public class SelectionSort {
	
	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("i = " + i);
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("j = " + j);
				System.out.println("nums[j]:" + nums[j] + " - nums[minIndex]:" + nums[minIndex]);
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
				
			}
			if(i != minIndex) {
				AlgUtils.swap(nums, i, minIndex);
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = {29, 10, 14, 37, 13};

		selectionSort(numbers);

		System.out.println(Arrays.toString(numbers));

	}

}
