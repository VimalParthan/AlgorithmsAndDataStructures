import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new java.util.ArrayList<>();
		
		list.add("Adam");
		list.add("Joe");
		list.add("Kevin");
		

		System.out.println(list.toArray());
		
		for(String s:list){
			System.out.println(s);
		}
	}

}
