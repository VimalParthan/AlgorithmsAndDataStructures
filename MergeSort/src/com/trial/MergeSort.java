package com.trial;

public class MergeSort {
	
	private int [] nums;
	private int [] tempArray;
	
	public MergeSort(int[] nums){
		this.nums=nums;
		this.tempArray = new int[nums.length];
		
	}
	
	public void mergeSort(int low,int high){
		
		if(low>=high){
			return;
		}
		
		int mid = (low+high)/2;
		
		mergeSort(low, mid);
		mergeSort(mid+1,high);
		merge(low,mid,high);
		
	}
	
	public void display(){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	
	public boolean isSorted(){
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]>nums[i+1]){
				return false;
			}
		}
		
		return true;
	}
	
	private void merge(int low, int mid,int high){
		
		for(int i=0;i<nums.length;i++){
			tempArray[i]=nums[i];
		}
		
		int i =low;
		int j =mid+1;
		int k= low;
		
		while(i<=mid&&j<=high){
			if(tempArray[i]<=tempArray[j]){
				nums[k]=tempArray[i];
				i++;
			}else{
				nums[k]=tempArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid){
			nums[k]=tempArray[i];
			i++;
			k++;
		}
		while(j<=high){
			nums[j]=tempArray[j];
			j++;
			k++;
		}

	}

}
