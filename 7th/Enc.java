

class Person {
	private int age = 1;

	public void setAge(int age) {
		if (age < 0 || age > 200)
			age = 1234;
		else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}
	
}

public class Enc {
	public static void main(String args[]) {
		Person per = new Person();
		//per.age = -1;
		//per.setAge(-1);
		per.setAge(255);

		System.out.println(per.getAge());
	}
}

