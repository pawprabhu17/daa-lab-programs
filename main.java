import java.util.*;

class staff{
	private String staffid,name;
	private long phone;
	private float sal;
	public void accept() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter staffid and name:");
		staffid=s.next();
		name=s.next();
		System.out.println("ENter the phone number and salary:");
		phone=s.nextLong();
		sal=s.nextFloat();
		
	}
	public void display()
	{
		System.out.println("Staffid: "+staffid+"\n"+"name: "+name+"\n Phone: "+phone+"\n Salary: "+sal);
		
	}
}
class teaching extends staff{
	private String domain;
	private String[] publication;
	private int n;
	public void accept() {
		super.accept();
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the domain:");
		domain=s.next();
		System.out.println("ENter the tiotal number of publications :");
		n=s.nextInt();
		publication= new String[n];
		System.out.print("Enter publication:");
		for(int i=0;i<n;i++)
		{
			publication[i]=s.next();
		}
	}
	public void display()
	{
		super.display();
		System.out.println("DOmain:"+domain+"Publication:");
		for(String x:publication) {
			System.out.println(x);
		}
	}
	}
	
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teaching s =new teaching();
		s.accept();
		s.display();
	}

}
