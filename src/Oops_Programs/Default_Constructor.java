package Oops_Programs;

public class Default_Constructor {

	int studid;
	String studname;
	int studfee;
	String studcity;
	Default_Constructor()
	{
		this.studid = studid;
		this.studname = studname;
		this.studfee = studfee;
		this.studcity = studcity;
	}
	void display()
	{
		System.out.println(studid);
		System.out.println(studname);
		System.out.println(studfee);
		System.out.println(studcity);
	}
	void show()
	{
		System.out.println("This is a show method");
	}
	public static void main(String[] args) {
		Default_Constructor con = new Default_Constructor();
		con.display();
		con.show();

	}

}
