package Oops_Programs;

class book
{
	public int add(int i, int j)
	{
		return i+j;
	}
}
class pen extends book
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class pencil extends pen
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}
class sketch extends pencil
{
	public int div(int i, int j)
	{
		return i%j;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		sketch pencil = new sketch();
		int res1 = pencil.add(10,20);
		int res2 = pencil.sub(15,21);
		int res3 = pencil.mul(12,18);
		int res4 = pencil.div(10,5);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}

}
