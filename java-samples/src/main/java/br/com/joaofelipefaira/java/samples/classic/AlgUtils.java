package br.com.joaofelipefaira.java.samples.classic;

public class AlgUtils {

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
