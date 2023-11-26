package myPackage;

public class Student {

	public int rollno;
	public int age;

	public void display1() {
		System.out.println("Welcome to all of you");
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {

		Student studentObj = new Student();
		studentObj.age = 30;
		studentObj.rollno = 420;
		System.out.println("My age is " + studentObj.age + " and my roll number is " + studentObj.rollno);

		studentObj.display1();
		studentObj.display2();

	}

}
