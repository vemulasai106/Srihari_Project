package Oops_Programs;

class Student
{
	private int Salary;
	private String Name;
	public int getSalary()
	{
		return Salary;
	}
	public void setSalary(int Salary)
	{
		this.Salary = Salary;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setSalary(25);
		s.setName("Hi this is sai vemula");
		System.out.println(s.getSalary());
		System.out.println(s.getName());

	}

}
