import java.util.*;

class main1{
	private int arr[],top,size;
	public main1(int n) {
		this.size=n;
		arr=new int[size];
		top=-1;
	}
	public void push(int i)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full");
		}
		arr[++top]=i;
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is full");
		}
		System.out.println("The popped element is:"+arr[top--]);
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is full");
		}
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the stack size:");
		int n=s.nextInt();
		main1 st=new main1(n);
		while(true)
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1: st.push(s.nextInt());
					break;
			case 2:	st.pop();
					break;
			case 3:st.display();
					break;
			case 4:return;
			}
		}
	}

}
