import java.util.Scanner;

class sub{
	int[] w,x;
	int sum,total=0;
	void process()
	{
		getdata();
		System.out.println("The subsets are:");
		subset1(0,1,total);
	}
	void getdata() {
		Scanner s =new Scanner(System.in);
		System.out.println("ENter the no of elements :");
		int n=s.nextInt();
		w=new int[n+1];
		x=new int[n+1];
		System.out.println("Enter the elements:");
		for(int i=1;i<=n;i++)
		{
			w[i]=s.nextInt();
			total+=w[i];
		}
		System.out.println("ENter the sum to be obtained:");
		sum=s.nextInt();
		if(total<sum) {
			System.out.println("no possible subsets");
			System.exit(1);
		}
	}
	void subset1(int s,int k,int r)
	{
		int i=0;
		x[k]=1;
		if(s+w[k]==sum)
		{
			System.out.print("(");
			for(i=1;i<=k;i++)
			{
				if(x[i]==1)
					System.out.print(" "+w[i]);
			}
			System.out.print(")");
		}
		else if((s+w[k]+w[k+1])<=sum)
				subset1(s+w[k],k+1,r-w[k]);
		if((s+r-w[k])>=sum && (s+w[k+1])<=sum )
		{
			x[k]=0;
			subset1(s,k+1,r-w[k]);
		}
	}
}
public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sub().process();
	}

}
