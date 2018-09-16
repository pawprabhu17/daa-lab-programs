import java.util.*;
public class strtoke {
	Scanner s=new Scanner(System.in);
	String name,dob,temp;
	String d,m,y;
	void accept()
	{
		System.out.println("Enter the details:");
		temp=s.next();
		StringTokenizer st =new StringTokenizer(temp,",");
		name=st.nextToken();
		dob=st.nextToken();
		st = new StringTokenizer(dob,"/");
		d=st.nextToken();
		m=st.nextToken();
		y=st.nextToken();
	}
	void display()
	{
		System.out.println(name+","+d+","+m+","+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strtoke sc =new strtoke();
		sc.accept();
		sc.display();
	}

}
