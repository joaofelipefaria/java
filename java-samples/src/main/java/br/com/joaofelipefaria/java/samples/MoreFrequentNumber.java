package br.com.joaofelipefaria.java.samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MoreFrequentNumber {

	public static void main(String[] args) {
		MoreFrequentNumber app = new MoreFrequentNumber();
		int[] result = 
				app.topKFrequent(new int[] {1,2,3,1,1,4,3,5,6}, 3);
		System.out.println(Arrays.toString(result));

	}
	
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequency = new HashMap<>();
		
		for (int num : nums) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> heap =
	            new PriorityQueue<>(Comparator.comparingInt(entry -> entry.getValue()));
	
		for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			heap.offer(entry);
			
			if(heap.size() > k) {
				heap.poll();
			}
		}

	    int[] result = new int[k];

	    for (int i = k - 1; i >= 0; i--) {
	        result[i] = heap.poll().getKey();
	    }
	    return result;
	}

}
