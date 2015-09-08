//class Person {
//	private int age;

//	public void setAge(int age) {
//		if (age < 0 || age > 200)
//			age = 234;
//		else {
//			this.age = age;
//		}
//	}

//	public int getAge() {
//		return age;
//	}	
//}

//class Student extends Person{
//}

//public class Ext {
//	public static void main (String args[]) {
//		Student stu = new Student();

//		stu.setAge(300);

//		System.out.println(stu.getAge());
//	}
//}


class Person{
	private int age;

	public void setAge(int age){
		if(age <0 || age > 200)
			age = 0;
		else
			this.age = age;
	}

	public int getAge(){
		return age;
	}
}

class Student extends Person{
}

public class Ext{
	public static void main(String args[]){
		Student st = new Student();
		st.setAge(199);

		System.out.println(st.getAge());
	}
}





