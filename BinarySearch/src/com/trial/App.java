package com.trial;

public class App {

	private static final int[] list = new int[]{1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		
	
		System.out.println(binarySearch(list, 9));
	}

	private static boolean binarySearch(int[] array, int search){
		
		int first = 0;
		int last = array.length-1;
		int mid = (first+last)/2;
		
		while(first<=last){
			if(array[mid]<search){
				first = mid+1;
			}else if(array[mid]==search){
				return true;
			}else{
				last = mid-1;
			}
			mid= (first+last)/2;
		}
		
		return false;
	}
}
