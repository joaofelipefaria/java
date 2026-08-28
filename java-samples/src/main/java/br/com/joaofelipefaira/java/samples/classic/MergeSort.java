package br.com.joaofelipefaira.java.samples.classic;

import java.util.Arrays;

/**
 * Merge Sort
 *
 * <p>
 * <b>What is it?</b>
 * </p>
 * A divide-and-conquer sorting algorithm that recursively divides the array
 * into smaller portions, sorts them, and then merges the sorted portions.
 *
 * <p>
 * <b>How does it work?</b>
 * </p>
 * The array is repeatedly divided in half until each portion contains only
 * one element. Then, the sorted portions are merged back together.
 *
 * <p>
 * During the merge operation, the elements from both sorted portions are
 * compared and placed into a temporary array in sorted order.
 *
 * <p>
 * <b>Key Characteristics</b>
 * </p>
 * <ul>
 * <li>Stable: Yes.</li>
 * <li>In-place: No. Requires O(n) additional memory.</li>
 * <li>Adaptive: No. Its time complexity remains O(n log n).</li>
 * </ul>
 *
 * <p>
 * <b>Time Complexity</b>
 * </p>
 * <ul>
 * <li>Best Case: O(n log n)</li>
 * <li>Average Case: O(n log n)</li>
 * <li>Worst Case: O(n log n)</li>
 * </ul>
 *
 * <p>
 * <b>Space Complexity</b>
 * </p>
 * <ul>
 * <li>O(n)</li>
 * </ul>
 *
 * <p>
 * <b>When to use</b>
 * </p>
 * Suitable for large datasets when predictable O(n log n) performance
 * and stability are important.
 *
 * <p>
 * <b>When not to use</b>
 * </p>
 * Avoid when minimizing additional memory is critical, because Merge Sort
 * requires O(n) extra space for the merge operation.
 */
public class MergeSort {
	public static void main(String... args) {
		int[] numbers = {29, 10, 14, 37, 13};
		System.out.println("Before:" + Arrays.toString(numbers));
		mergeSort(numbers);
		System.out.println("After:" + Arrays.toString(numbers));
	}
	
	private static void mergeSort(int[] numbers) {
		if(numbers.length <= 1) {
			return;
		}
		System.out.println(">>>Sorting:" + Arrays.toString(numbers));
		mergeSort(numbers, 0, numbers.length - 1);
	}
	
	private static void mergeSort(int[] numbers, int left, int right) {
		if(left >= right) {
			return;
		}
		int middle = left + (right - left) / 2;
		System.out.println("Divide:" 
				+ Arrays.toString(Arrays.copyOfRange(numbers, left, middle + 1))
				+ " | "
				+ Arrays.toString(Arrays.copyOfRange(numbers, middle + 1, right + 1)));
		mergeSort(numbers, left, middle);
		mergeSort(numbers, middle + 1, right);
		merge(numbers, left, middle, right);
	}
	
	private static void merge(int[] numbers, int left, int middle, int right) {
		int[] leftArray = Arrays.copyOfRange(numbers, left, middle+1);
		int[] rightArray = Arrays.copyOfRange(numbers, middle+1, right+1);
		int i = 0;
		int j = 0;
		int k = left;
		while(i < leftArray.length && j < rightArray.length) {
			if(leftArray[i] < rightArray[j]) {
				numbers[k] = leftArray[i];
				i++;
			} else {
				numbers[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i < leftArray.length) {
			numbers[k] = leftArray[i];
			i++;
			k++;
		}
		while(j < rightArray.length) {
			numbers[k] = rightArray[j];
			j++;
			k++;
		}
		System.out.println("Merge: " +
				Arrays.toString(
						Arrays.copyOfRange(numbers, left, right + 1)
						));
	}
}
