
public class BadSwap {
	
	int a = 12;
	int b = 123;
	
	public BadSwap(){
		
		
		
		Person person1 = new Person("Vimal", 121, "Software developer");
		Person person2 = new Person("Veena", 12, "Chemical Engineer");
		badSwap(person1,person2,a,b);
		
		
		System.out.println(person1.name+"-"+person1.profile.jobDescription+"-"+person1.age);
		System.out.println(person2.name+"-"+person2.profile.jobDescription+"-"+person2.age);
		System.out.println(a+"-"+b);
	}
	
	
	public void badSwap(Person person1,Person person2,int a,int b){
		System.out.println(person1.name+"-"+person1.profile.jobDescription+"-"+person1.age);
		System.out.println(person2.name+"-"+person2.profile.jobDescription+"-"+person2.age);
		
		person1.age = 12;
		person2.age=32423;
		Person temp = person1;
		person1=person2;
		person2=temp;
		this.a=345;
		this.b=3221;
		
		System.out.println(person1.name+"-"+person1.profile.jobDescription+"-"+person1.age);
		System.out.println(person2.name+"-"+person2.profile.jobDescription+"-"+person2.age);
		
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BadSwap other = (BadSwap) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
	
}
