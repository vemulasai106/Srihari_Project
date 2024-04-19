package Oops_Programs;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operator
		int a = 10; 
		int b = 20;
		System.out.println("addition of values are : "+(a+b));
		System.out.println("substraction of values are : "+(a-b));
		System.out.println("multiplication of values are :"+(a*b));
		System.out.println("division of values are : "+(a/b));
		System.out.println("remainder of values are :"+(a%b));
		
		//Comparision operator
		int c = 25;
		int d = 34;
		System.out.println(c<d);
		System.out.println(c>d);
		System.out.println(c<=d);
		System.out.println(c>=d);
		System.out.println(c==d);
		System.out.println(c!=d);
		
		//Logical operator
		int x = 12;
		int y = 23;
		System.out.println((x<y)&&(y<x));
		System.out.println((x>y)||(y>x));
		System.out.println((x!=y));
		
		//Incremental operators
		int s = 15;
		s++;
		System.out.println(s);
		++s;
		System.out.println(s);
		s--;
		System.out.println(s);
		--s;
		System.out.println(s);

	}

}
