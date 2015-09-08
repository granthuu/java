
//class Person {
//	String name;
//	String getName() {
//		return "guangdong "+name;
//	}

//	/* construct function */	
//	public Person (String n) {
//		name = n;
//	}
//	
//};


//public class Oop2 {
//	public static void main(String args[]) {
//		Person p1 = new Person("zhangsan");
//		Person p2 = new Person("lisi");

//		System.out.println(p1.getName());
//		System.out.println(p2.getName());
//	}
//}


class Person{

	String name;

	String GetName(){
		return "guangDong " + this.name;
	}

	public Person(String name){
		this.name = name;
	}
}

public class Oop2{
	public static void main(String args[]){
		Person p1 = new Person("zhangsan");
		Person p2 = new Person("lisi");

		System.out.println(p1.GetName());
		System.out.println(p2.GetName());
	}
}
