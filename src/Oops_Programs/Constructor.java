package Oops_Programs;

public class Constructor {

	int studid;
	String studname;
	int studfee;
	String studcity;
	Constructor(int studid, String studname, int studfee, String studcity)
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
		Constructor con = new Constructor(10, "Koushik", 15000, "Hyderabad");
		con.display();
		con.show();

	}

}
