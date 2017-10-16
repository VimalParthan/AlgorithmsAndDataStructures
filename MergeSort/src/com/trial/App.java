package com.trial;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		int [] nums = new int[30];
		
		Random random = new Random();
		
		for(int i=0;i<nums.length;i++){
			nums[i] = random.nextInt(1000);
		}
		
		MergeSort mergeSort = new MergeSort(nums);

		mergeSort.mergeSort(0, nums.length-1);
		System.out.println(mergeSort.isSorted());
		mergeSort.display();
	}

}
