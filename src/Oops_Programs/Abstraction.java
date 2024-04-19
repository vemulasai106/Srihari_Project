package Oops_Programs;


abstract class Teacher
{
	abstract void student();
}
class School extends Teacher
{
	public void student()
	{
		System.out.println("Student is present");
	}
}
abstract class Office
{
	abstract void child();
}
class Teach extends Office
{
	public void child()
	{
		System.out.println("Children's are playing");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		School s = new School();
		Teach t = new Teach();
		s.student();
		t.child();

	}

}
