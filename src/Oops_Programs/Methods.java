package Oops_Programs;

public class Methods {

	int empid;
	String empname;
	String empcity;
	int empsal;
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empcity);
		System.out.println(empsal);
	}
	void show()
	{
		System.out.println("This is also a show method");
	}
	public static void main(String[] args) {
		Methods method = new Methods();
		method.empid = 1001;
		method.empname = "Srihari";
		method.empcity = "Warangal";
		method.empsal = 25000;
		method.display();
		method.show();

	}

}
