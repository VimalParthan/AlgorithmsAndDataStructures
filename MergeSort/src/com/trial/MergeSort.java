package com.trial;

public class MergeSort {
	
	private int[] nums;
	private int[] temp;
	
	public MergeSort(int [] nums){
		this.nums = nums;
		temp = new int [nums.length];
		sort(0,nums.length-1);
	}
	
	public void sort(int low,int high){
		
		if(low>=high){
			return;
		}
		
		int mid = (low+high)/2;
		
		sort(low,mid);
		sort(mid+1,high);
		merge(low,mid,high);
		
	}

	private void merge(int low, int mid, int high) {
	
		for(int i=0;i<=high;i++){
			temp[i]=nums[i];
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid&&j<=high){
			if(temp[i]<temp[j]){
				nums[k]=temp[i];
				i++;
			}else{
				nums[k]=temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid){
			nums[k]=temp[i];
			i++;k++;
		}
		
		while(j<=high){
			nums[k]=temp[j];
			j++;k++;
		}
		
	}
	
	public void display(){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

}
