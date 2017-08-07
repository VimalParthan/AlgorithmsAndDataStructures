import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new java.util.LinkedList<>();
		list.add(3);
		list.add(10);
		list.add(20);
		
		list.remove(0);
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		for(Integer i :list){
			System.out.println(i);
		}
	}

}
