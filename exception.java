import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,res;
		try {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the dividend:");
			a=s.nextInt();
			System.out.println("ENter the divisor:");
			b=s.nextInt();
			res=a/b;
			System.out.println("Result is :"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("DIvide by zero error");
		}
	}

}
