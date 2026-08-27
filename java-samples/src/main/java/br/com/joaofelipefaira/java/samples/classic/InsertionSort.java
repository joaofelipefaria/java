package br.com.joaofelipefaira.java.samples.classic;

import java.util.Arrays;

/**
 * Insertion Sort
 *
 * <p>
 * <b>What is it?</b>
 * </p>
 * A simple comparison-based sorting algorithm that builds the sorted portion of
 * the array one element at a time.
 *
 * <p>
 * At each iteration, the current element is compared with the elements before
 * it. Elements greater than the current element are shifted one position to the
 * right until the correct position for the current element is found.
 * </p>
 *
 * <p>
 * <b>Why is it called Insertion Sort?</b>
 * </p>
 * Because each element is inserted into its correct position within the already
 * sorted portion of the array.
 *
 * <p>
 * <b>Key Characteristics</b>
 * </p>
 * <ul>
 * <li>Stable: Yes. Equal elements keep their relative order.</li>
 * <li>In-place: Yes. Uses only O(1) extra memory.</li>
 * <li>Adaptive: Yes. Performs very well when the array is nearly sorted.</li>
 * </ul>
 *
 * <p>
 * <b>Time Complexity</b>
 * </p>
 * <ul>
 * <li>Best Case: O(n)</li>
 * <li>Average Case: O(n²)</li>
 * <li>Worst Case: O(n²)</li>
 * </ul>
 *
 * <p>
 * <b>Space Complexity</b>
 * </p>
 * <ul>
 * <li>O(1)</li>
 * </ul>
 *
 * <p>
 * <b>When to use</b>
 * </p>
 * Suitable for small datasets or arrays that are already mostly sorted.
 *
 * <p>
 * <b>When not to use</b>
 * </p>
 * Avoid Insertion Sort for large, randomly ordered datasets because of its
 * O(n²) average and worst-case time complexity.
 */
public class InsertionSort {

	public static void insertionSort(int[] nums) {

		/*
		 * We start at index 1 because a single element at index 0 is already considered
		 * sorted.
		 *
		 * Example:
		 *
		 * [29 | 10, 14, 37, 13] ↑ sorted portion
		 */
		for (int i = 1; i < nums.length; i++) {

			System.out.println("\n==============================");
			System.out.println("i = " + i);
			System.out.println("Current array: " + Arrays.toString(nums));

			/*
			 * Save the element that we want to insert into the sorted portion.
			 */
			int current = nums[i];

			/*
			 * j points to the last element of the sorted portion.
			 */
			int j = i - 1;

			System.out.println("current = " + current);
			System.out.println("j = " + j);

			/*
			 * Move larger elements one position to the right.
			 *
			 * We continue while:
			 *
			 * 1. j is still inside the array 2. nums[j] is greater than current
			 */
			while (j >= 0 && nums[j] > current) {

				System.out.println("Shifting nums[" + j + "] = " + nums[j] + " to position " + (j + 1));

				nums[j + 1] = nums[j];

				j--;

				System.out.println("Array after shift: " + Arrays.toString(nums));
			}

			/*
			 * j was decremented one position too far.
			 *
			 * Therefore, the correct position for current is j + 1.
			 */
			nums[j + 1] = current;

			System.out.println("Inserted " + current + " at position " + (j + 1));

			System.out.println("Array after insertion: " + Arrays.toString(nums));
		}
	}

	public static void main(String[] args) {

		int[] numbers = { 29, 10, 14, 37, 13 };

		System.out.println("Before: " + Arrays.toString(numbers));

		insertionSort(numbers);

		System.out.println("\nAfter: " + Arrays.toString(numbers));
	}
}