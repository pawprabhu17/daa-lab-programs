import java.util.*;
public class knapsack {

	static int knap(int W,int[]wt,int[]val,int n)
	{
		int i,w;
		int[][] k= new int[n+1][W+1];
		for(i=0;i<=n;i++)
		{
			for(w=0;w<=W;w++)
			{
				if(i==0 || w==0)
					k[i][w]=0;
				else if(wt[i-1]<=w)
						k[i][w]=Math.max(val[i-1]+k[i-1][w-wt[i-1]],k[i-1][w]);
				else
						k[i][w]=k[i-1][w];
			}
		}
		 i=n;
		 w=W;
		 while(i>0 && w>0)
		 {
			 if(k[i][w]!=k[i-1][w])
			 {
				 System.out.println(i+" ");
				 w=w-wt[i-1];
			 }
			 i--;
		 }
		 return k[n][W];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("ENter the number of items:");
		int n=s.nextInt();
		System.out.println("ENter objects weights:");
		int[] wt=new int[n];
		for(int i=0;i<n;i++)
			wt[i]=s.nextInt();
		System.out.println("Enter objects profits:");
		int[] val=new int[n];
		for(int i=0;i<n;i++)
			val[i]=s.nextInt();
		System.out.println("ENter the max capacity:");
		int W =s.nextInt();
		System.out.println("The max value "+knap(W,wt,val,n));
	}

}
