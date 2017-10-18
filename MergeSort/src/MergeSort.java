
public class MergeSort {
	
	private int [] nums;
	
	private int [] temp;
	
	public MergeSort(int [] nums){
		this.nums = nums;
		this.temp = new int [nums.length]; 
		mergeSort(0,nums.length-1);
	}
	
	private void mergeSort(int low,int high){
		
		if(low>=high){
			return;
		}
		
		int mid = (low+high)/2;
		
		mergeSort(low,mid);
		mergeSort(mid+1,high);
		merge(low,mid,high);
	}
	
	private void merge(int low,int mid,int high){
		
		for(int i=low;i<=high;i++){
			temp[i]=nums[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i<=mid&&j<=high){
			if(temp[i]<=temp[j]){
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
			k++;i++;
		}
		while(j<=high){
			nums[k]=temp[j];
			j++;k++;
		}
	}
	
	public void show(){
		for(int i:nums){
			System.out.println(i);
		}
	}
	
}
