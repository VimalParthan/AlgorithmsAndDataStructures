package com.trial;

public class App {

	public static void main(String[] args) {
		
		int [] nums = new int[]{1,2,3,4,5,6,7,8,9,13};
		
		System.out.println(binarySearch(nums, 13));
	}
	
	private static boolean binarySearch(int[] nums,int numToFind){
		
		int low = 0 ;
		int high = nums.length-1;
		int mid = (low+high)/2;
		
		while(low<=high){
		
			if(nums[mid]==numToFind){
				return true;
			}else if(nums[mid]>numToFind){
				high=mid-1;
			}else if(nums[mid]<numToFind){
				low =mid+1;
			}
			mid=(low+high)/2;
		}
		return false;
	}

}
