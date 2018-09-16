import java.util.Scanner;
public class student {

		private String usn,name,branch;
		private long phone;
		public void accept()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the student details:");
			usn=s.nextLine();
			name=s.nextLine();
			branch=s.nextLine();
			phone=s.nextLong();
		}
		public void display()
		{
			System.out.println("The details are:");
			System.out.println(usn+"\n"+name+"\n"+branch+"\n"+phone);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the total no of students:");
		int n=s.nextInt();
		student[] st=new student[n];
		for(int i=0;i<n;i++)
		{
			st[i]=new student();
			st[i].accept();
		}
		for(int i=0;i<n;i++)
		{
			st[i].display();
		}
	}

}
