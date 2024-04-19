package Oops_Programs;

class A
{
	public void show()
	{
		System.out.println("Hi, good evening this is sai vemula");
	}
	public void show(int i)
	{
		System.out.println("overloading"+i);
	}
}

public class Method_Overloading {

	/*static int add(int a , int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	static int add(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}*/
	public static void main(String[] args) {
		/*System.out.println(Method_Overloading.add(10, 20));
		System.out.println(Method_Overloading.add(15, 22, 20));
		System.out.println(Method_Overloading.add(5, 40, 43, 18));*/

		A obj = new A();
		obj.show();
	}

}
