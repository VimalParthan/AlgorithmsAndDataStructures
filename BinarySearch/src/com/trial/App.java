package com.trial;

public class App {

	public static void main(String[] args) {
		
		int [] nums = new int[]{1,2,3,4,5,6,7,8,9};
		
		System.out.println(binarySearch(nums,10));

	}

	private static boolean binarySearch(int [] nums,int numTosearch){
		
		int low = 0;
		int high = nums.length-1;
		int mid = (low+high)/2;
		
		while(low<=high){
			System.out.println(low+"-"+mid+"-"+high);
			if(nums[mid]==numTosearch){
				return true;
			}else if(numTosearch<nums[mid]){
				high=mid-1;
			}else if(numTosearch>nums[mid]){
				low=mid+1;
			}
			mid =(low+high)/2;

		}
		
		return false;
	}
}
