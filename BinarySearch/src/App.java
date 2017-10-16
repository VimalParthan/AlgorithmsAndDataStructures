
public class App {

	private static int [] list = new int []{0,1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		
		if(binarySearch(list, 7)){
			System.out.println("found 7");
		}if(!binarySearch(list, 12)){
			System.out.println("did not find 12");
		}

	}
	
	private static boolean binarySearch(final int[] array , final int search){
		
		int first = 0; 
		int last = array.length-1;
		int middle = (first+last)/2;
		while(first<=last){
			if(array[middle]<search){
				first = middle+1;
			}
			else if(array[middle]==search){
				return true;
			}else{
				last = middle-1;
			}
			middle = (first+last)/2;
		}
		return false;
	}
}
