
//class Person {
//	String name;
//	String getName() {
//		return "guangdong "+name;
//	}
//};


//public class Oop {
//	public static void main(String args[]) {
//		Person p1 = new Person();
//		p1.name = "zhangsan";

//		Person p2 = new Person();
//		p2.name = "lisi";

//		System.out.println(p1.getName());
//		System.out.println(p2.getName());
//	}
//}


class Person{

	String name;
	
	String getName(){
	    String name = " hhahah";
		// return 
		return "GuangDong "+ name;
		//return "GuangDong "+ this.name;
	}
}

public class Oop{

	public static void main(String args[]){
		Person p1 = new Person();
		p1.name = "zhongshan";

		Person p2 = new Person();
		p2.name = "lisi";

		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}
}

