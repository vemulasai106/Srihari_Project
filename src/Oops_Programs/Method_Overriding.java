package Oops_Programs;

class car
{
	public void show()
	{
		System.out.println("overrided A");
	}
}
class bike extends car
{
	public void show()
	{
		System.out.println("Overrided B");
	}
}
public class Method_Overriding {

	/*static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	static double sub(double a, double b, double c)
	{
		return a-b-c;
	}
	static int div(int a, int b, int c)
	{
		return a%b%c;
	}
	static double mul(double a, double b, double c)
	{
		return a*b*c;
	}*/

	public static void main(String[] args) {
		/*System.out.println(Method_Overriding.add(10, 20, 30));
		System.out.println(Method_Overriding.sub(1.3, 2.5, 5.8));
		System.out.println(Method_Overriding.div(5, 10, 15));
		System.out.println(Method_Overriding.mul(3.4, 6.5, 9.3));*/

		bike b = new bike();
		b.show();
	}

}
